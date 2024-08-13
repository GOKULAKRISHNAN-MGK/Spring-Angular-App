import { Directive, ElementRef, Input, OnChanges, Renderer2, SimpleChanges } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective implements OnChanges {
  @Input() searchNumber!: string;
  @Input() content!: string;

  constructor(private el: ElementRef, private renderer: Renderer2) { }

  ngOnChanges() {
    if(!this.searchNumber) {
      this.renderer.setProperty(this.el.nativeElement, 'innerHTML', this.content);
      return;
    }

    const regex = new RegExp(`(${this.searchNumber})`, 'gi');
    const newText = this.content.replace(regex, `<span class="highlight">$1</span>`);
    this.renderer.setProperty(this.el.nativeElement, 'innerHTML', newText);
    console.log(newText);
  }

}
