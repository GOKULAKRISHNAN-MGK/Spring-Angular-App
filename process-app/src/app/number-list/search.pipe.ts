import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(value: any[], number: string) {
    if(!number) {
      return value;
    }
    return value.filter((numbers: any)=>{
      return numbers.numberList.startsWith(number)
    });
  }

}
