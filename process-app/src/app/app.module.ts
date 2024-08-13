import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NumberListComponent } from './number-list/number-list.component';
import { NumberFormComponent } from './number-form/number-form.component';
import { NumberService } from './number.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { SearchPipe } from './number-list/search.pipe';
import { HighlightDirective } from './highlight.directive';

@NgModule({
  declarations: [
    AppComponent,
    NumberListComponent,
    NumberFormComponent,
    SearchPipe,
    HighlightDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [NumberService],
  bootstrap: [AppComponent]
})
export class AppModule { }
