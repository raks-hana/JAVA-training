import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Enquiry } from '../../../model/enquiry.model';
import { BookService } from '../../../services/book.service';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-enquiry-form',
  templateUrl: './enquiry-form.component.html',
  styleUrls: ['./enquiry-form.component.css'] 
})
export class EnquiryFormComponent {
  enquiry: Enquiry = { name: '', email: '', message: '', bookId: 0 };
  errors: string[] = []; 
  enquiryForm = this.fb.group({
    name: ['', [Validators.required, Validators.minLength(3)]],
    email: ['', [Validators.required, Validators.email]],
    message: ['', [Validators.required, Validators.minLength(10)]],
    bookId: ['', [Validators.required, Validators.min(1)]]
  });

  constructor(private fb: FormBuilder, private route: ActivatedRoute, private api: BookService) {}

  ngOnInit(): void {
    const bookId = +this.route.snapshot.paramMap.get('id')!;
    this.enquiry.bookId = bookId;
  }

  onSubmit() {
    this.errors = []; 
    let emailPattern = /^[a-zA-Z0-9\._]+@[a-zA-Z]+\.[a-zA-Z]{2,4}$/;
    
    if (!this.enquiry.name || this.enquiry.name.length < 3) {
      this.errors.push("Name should be at least three characters long");
    }
    if (!this.enquiry.email || !emailPattern.test(this.enquiry.email)) {
      this.errors.push("Invalid Email");
    }
    if (!this.enquiry.message || this.enquiry.message.length < 10) {
      this.errors.push("Message should be at least 10 characters long");
    }
    if (!this.enquiry.bookId || this.enquiry.bookId <= 0) {
      this.errors.push("Invalid Book Id");
    }

    if (this.errors.length === 0) {
      this.api.addEnquiry({
        name: this.enquiry.name,
        email: this.enquiry.email,
        message: this.enquiry.message,
        bookId: this.enquiry.bookId
      }).subscribe({
        next: (response) => {
          console.log("Enquiry Form Response:", response);
          this.enquiry.name = '';
          this.enquiry.email = '';
          this.enquiry.message = '';
          this.enquiry.bookId = 0;
          alert("Enquiry Submitted Successfully");
        },
        error: (error) => {
          alert("Something went wrong. Please try again");
        }
      });
    }
  }
}
