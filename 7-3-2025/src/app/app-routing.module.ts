import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookListComponent } from './pages/book-list/book-list.component';
//import { BookDetailComponent } from './pages/book-list/book-detail/book-detail.component';
import { EnquiriesComponent } from './pages/enquiries/enquiries.component';
import { FeedbackComponent } from './pages/feedback/feedback.component';
import { HomeComponent } from './pages/home/home.component';
import { EnquiryFormComponent } from './pages/enquiries/enquiry-form/enquiry-form.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'book-list', component: BookListComponent },
  { path: 'enquiries', component: EnquiriesComponent },
  { path: 'enquiries/:id', component: EnquiryFormComponent },
  { path: 'feedback', component: FeedbackComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
