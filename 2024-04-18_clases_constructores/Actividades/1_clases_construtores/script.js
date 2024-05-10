class Ch39{
    constructor(nombre, apellido, email, telefono){
        this.name = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.info = `Hola soy ${this.name} ${this.apellido}, mi email es ${this.email} y mi cel es ${this.telefono}`
    }

    inforIntegrantes(){
        console.log(this.info);
    }

    organizadores(){
        if(this.name=="Mario"){
            console.log("Eres organizador");
        }else{
            console.log("No eres organizador")
        }
    }
}

class Participante extends Ch39{
    constructor(nombre, apellido, email, telefono, edad){
        super(nombre, apellido, email, telefono);
        this.age = edad;
    }
    static canvas(){
        alert("Terminaste el ejercicio");
    }
}

class Instructor extends Ch39{
    constructor(nombre, apellido, email, telefono, licenciatura){
        super(nombre, apellido, email, telefono);
        this.degree = null;
    }

    set setDegree(newDegree){
        this.degree = newDegree
    }

    get getDegree(){
    return this.degree
    }

    darSesiones(){
        console.log("Tienes sesión hoy")
    }
}

class Mentor extends Ch39{
    constructor(nombre, apellido, email, telefono, licenciatura, grupo){
        super(nombre, apellido, email, telefono);
        this.team = grupo;
    }

    darSesiones(){
        console.log("Tienes sesión hoy")
    }
    mentorias(){
        console.log("Agendaste una mentoría");
    }
}


const int1 = new Ch39;
const int2 = new mentoria("Mario", "Sandoval", "developermario@gmail.com", 5619238733);
const int3 = new Instructor("Gabriel", "Velázquez", "devgabriel@gmail.com", 7893547895, "maestria");
const int4 = new Ch39("Camila", "Vela", "devcamila@gmail.com", 7789547878);
const int5 = new Instructor("Andrea", "Garibaldi", "devandrea@gmail.com", 7893589895);
const int6 = new Participante("Juan", "Pistolas", "devjuan@gmail.com", 7123547895);
const int7 = new Ch39("Miguel", "Castillo", "devmiguel@gmail.com", 789359695);


int2.canvas();
int3.darSesiones();

int2.setDegree = "Doctorado";

document.write(int2.getDegreedegree);