import { Component, OnInit } from '@angular/core';
import { AppService } from '../../app.service';
import { AppRoutingModule } from '../../app-routing.module';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  constructor(private app: AppService) { }

  ngOnInit() {
  }

  authenticated() { return this.app.authenticated; }
}
