import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Number } from './number';

@Injectable()
export class NumberService {

  private numberUrl: string;

  constructor(private http: HttpClient) {
    this.numberUrl = "http://localhost:8080/number";
   }

   public findAll(): Observable<Number[]> {
    return this.http.get<Number[]>(this.numberUrl+"/getNumbers");
   }

   public save(number: Number) {
    return this.http.post<Number>(this.numberUrl+"/processNumbers", number);
   }
}
