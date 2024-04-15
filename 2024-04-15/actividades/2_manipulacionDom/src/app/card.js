//Voy a crear información de un usuario que va a vivir en un objeto(clave-valor) para agregarlo mediante manipulación del DOM

const user = {
    username: "mariosv",
    age: 25,
    email: "developermariosv@gmail.com",
    films: ["Actividad paranormal", "La posesión de Dévora Logan", "Maze Runner"]
}

//Crear  función que me permita ingresar el objeto user en el nodo padre
const crearUsuario = (user) => {
    document.getElementById("name").textContent = user.username; // primero elegimos el nodo con el id "name" que por defecto está vacío, pero ahora con textContent vamos a proporcionarle un texto
    document.getElementById("age").textContent = user.age;
    document.getElementById("e-mail").textContent = user.email;

    //Agregar el array de films
    //document.getElementById("films").textContent = user.films; esto me trae todo el array pero no lo está definiendo como lista desordenada
    //Entonces vamos a utilizat forEach() para recorrer el Array y mostrar los elementos en forma de lista
    const listaDesordenada = document.getElementById("films").textContent = user.films;

    user.films.array.array.forEach(film => {
        const itemLista = document.createElement("li") // Cuando empiece el forEach a recorrer cada elemento del Array, va a crear un <li> por cada elemento
        itemLista.textContent = film;
        listaDesordenada.appendChild(itemLista);
    });

    listaDesordenada.style.listStyleType = "none";
    listaDesordenada.style.padding = "0";
    listaDesordenada.style.color = "coral";
}

crearUsuario(user);