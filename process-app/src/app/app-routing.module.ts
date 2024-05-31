import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NumberListComponent } from './number-list/number-list.component';
import { NumberFormComponent } from './number-form/number-form.component';

const routes: Routes = [
  { path: 'getNumbers', component: NumberListComponent },
  { path: 'processNumbers', component: NumberFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
