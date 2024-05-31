import { Component, OnInit } from '@angular/core';
import { Number } from '../number';
import { NumberService } from '../number.service';

@Component({
  selector: 'app-number-list',
  templateUrl: './number-list.component.html',
  styleUrl: './number-list.component.css'
})
export class NumberListComponent implements OnInit {
  numbers!: Number[];

  constructor(private numberService: NumberService) {

  }
  ngOnInit(): void {
    this.numberService.findAll().subscribe(data=>{
      this.numbers = data;
    })
  }

}
