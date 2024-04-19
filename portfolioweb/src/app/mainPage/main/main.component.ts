import { Component } from '@angular/core';
import { NavComponent } from '../../navbars/nav/nav.component';
import { ProfileComponent } from '../../imageName/profile/profile.component';
import { Project } from '../../entity/project';
import { AppComponent } from '../../app.component';
import { CardComponent } from '../../projectCards/card/card.component';
import { HttpClient } from '@angular/common/http';
import { SCardsComponent } from '../../skillCards/s-cards/s-cards.component';
import { BackendSkillsComponent } from '../../skillCards/backend-skills/backend-skills.component';
import { DatabaseSkillsComponent } from '../../skillCards/database-skills/database-skills.component';

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [NavComponent, ProfileComponent, CardComponent, SCardsComponent, BackendSkillsComponent, DatabaseSkillsComponent],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {
  springUrl:string="http://localhost:8080/portfolio/getPro";
// project:Project=new Project("CricketChronicle","assets/proImg/CrickChronicle.jpg","Spring Boot, Hibernate, JPA, Angular, MySQL");
  constructor(private http:HttpClient){
    this.getAllProjects();
  }

  projectFromApi:any;

  getAllProjects()
  {
    this.http.get<Project>(this.springUrl).subscribe({
      next:(data:Project)=>{this.projectFromApi=data},
      error:err=>console.log("Something went wrong"),
      complete:()=>console.log("Completed")

    });
  }

}
