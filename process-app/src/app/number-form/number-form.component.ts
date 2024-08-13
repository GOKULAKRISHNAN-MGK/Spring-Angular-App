import { Component } from '@angular/core'
import { Number } from '../number';
import { ActivatedRoute, Router } from '@angular/router';
import { NumberService } from '../number.service';

@Component({
  selector: 'app-number-form',
  templateUrl: './number-form.component.html',
  styleUrl: './number-form.component.css'
})
export class NumberFormComponent {
  
  number: Number;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private numberService: NumberService
  ) {
    this.number = new Number();
  }

  onSubmit() {
    this.numberService.save(this.number).subscribe(result=>this.goToNumberList());
  }
  goToNumberList() {
    this.router.navigate(['/getNumbers']);
  }
}
