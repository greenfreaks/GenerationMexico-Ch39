//Asignar en variables el elemento
const bottonRandom = document.getElementById("btn--random");
const bottonReset = document.getElementById("btn--reset");
const background = document.body.style.backgroundColor;

//Creamos funcion para generar un número al azar para hacer que el numero varíe
const random = (number) =>{
    return Math.floor(Math.random() * (number + 1)); //Math.floor pasa el entero más grande
}

// Creamos eventos de tipo CLICK para que suceda algo en el DOM  al dar click
bottonRandom.addEventListener("click", () =>{
    const newBackground = `rgb(${random(255)}, ${random(255)}, ${random(255)})`;
    document.body.style.backgroundColor = newBackground;
});