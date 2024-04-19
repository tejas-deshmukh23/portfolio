import { Component, Input } from '@angular/core';
import { Project } from '../../entity/project';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [HttpClientModule],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {
  @Input() pro:any;
  constructor()
  {
    // alert();
  }
}
