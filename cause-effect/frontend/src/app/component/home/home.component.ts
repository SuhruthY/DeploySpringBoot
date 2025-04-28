import { Component, OnInit } from '@angular/core';
import { AppService } from '../../service/app.service';
import { Person } from '../../model/person';
import { CommonModule, JsonPipe } from '@angular/common';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  persons: Person[] = [];
  error: string | null = null;

  constructor(private appService: AppService) {}

  ngOnInit(): void {
    this.appService.getAllPersons().subscribe({
      next: (data) => {
        this.persons = data;
      },
      error: (err) => {
        this.error = 'Failed to load data';
        console.error('Error:', err);
      }
    });
  }
}
