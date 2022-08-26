export class persona {
    id?: number;
    nombre: string;
    apellido: string;
    imagen: string;

    constructor(nombre: string, apellido: string, img: string){
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = img;
    }
}