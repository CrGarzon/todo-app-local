import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'todo-app';
  nombre: string="Cristian";
  nombreGuardar: string="";
  edad : number=25;
  casado : boolean = false;
  listaNombres : Array<string> = ['cristian','pedro','pepe'];
  //listaNombres: string[]=[];

  persona = {
    name: "crg",
    age: 24,
    married: false,
  }

  guardar (){
    this.nombreGuardar=this.nombre
    this.listaNombres.push(this.nombre);
  }



}
