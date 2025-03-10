import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { BookListComponent } from './pages/book-list/book-list.component';
import { BookDetailComponent } from './pages/book-list/book-detail/book-detail.component';
import { MenuBarComponent } from './common/menu-bar/menu-bar.component';
import { FeedbackComponent } from './pages/feedback/feedback.component';
import { EnquiriesComponent } from './pages/enquiries/enquiries.component';
import { EnquiryFormComponent } from './pages/enquiries/enquiry-form/enquiry-form.component';
//import { FooterComponent } from './pages/footer/footer.component';
import { GenrePipe } from './pipes/genre.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    BookListComponent,
    BookDetailComponent,
    MenuBarComponent,
    FeedbackComponent,
    EnquiriesComponent,
    EnquiryFormComponent,
    //FooterComponent,
    GenrePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
