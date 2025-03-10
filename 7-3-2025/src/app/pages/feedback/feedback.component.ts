import { Component } from '@angular/core';
import { Feedback } from '../../model/feedback.model';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrl: './feedback.component.css'
})
export class FeedbackComponent {
  feedbacks: Feedback[] = [
    { name: 'John Doe', message: 'Great book collection! Very helpful.', date: '2025-03-07' },
    { name: 'Jane Smith', message: 'I love the variety of genres. Highly recommend.', date: '2025-03-06' },
    { name: 'Alice Johnson', message: 'Customer service was excellent!', date: '2025-03-05' },
  ];

  constructor() { }

  ngOnInit(): void {
  }
}
