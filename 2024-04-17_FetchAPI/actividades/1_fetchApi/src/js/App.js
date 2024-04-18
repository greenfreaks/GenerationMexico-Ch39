//Sincronía: respeta la secuencia.
// function primerFuncion(){
//     console.log("2");
// }

// function segundaFuncion(){
//     console.log("1");
//     console.log("3");
//     primerFuncion();
// }

// segundaFuncion();

//Asincronía. Recibimos una función y podemos establecer códigos de ejecución para evitar el código secuencial. Este tiempo se establece mediante 'setTimeout' que me permite indicar tiempo en milisegundos (1000ms = 1s)

// const firstFunction = () =>{
//     setTimeout(() =>{
//         console.log(2);
//     }, 2000);
    
// }

// const secondFunction = () =>{
//     setTimeout(() =>{
//         console.log(1);
//     },5000);
//     console.log(3);
//     firstFunction();
// }



//Trabajando con promesas mediante FetchAPI
const url = 'https://jsonplaceholder.typicode.com/users'
fetch(url)
//La función de tipo callBack se ca a ejecutar siempre que la promesa se resuelva y se convierte en JSON decodificado
    .then(response => response.json())
    .then(response => {
        console.log(response); //Me trae toda la API (10 registros)
        console.log(response[0]) // Trae el usuario co id 1
        console.log(response[4]) // Trae el usuario co id 5
        console.log(response[4].name) // Trae sólo el nombre el usuario con id 5
    })
    .catch(error => console.error("¡No funcionó mi chavo!", error)); //Si se rechaza, muestra este mensaje de error


    //----------Manipulación del DOM para mostrar en el navegador-------------

    //1. Guardar elementos en una constante

    const botonInfo = document.querySelector("#button--info");
    const contenedorInfo = document.querySelector("#div--info");
    //2. Crear una variable de tipo NULL donde se va a guardar la info que vamos a traer desde la API;
    let post = null;

    //3. Crear una función que tome la variable post y me permita manipuñar el DOM. Vamos a crear nodos y vamos insertarlo en e partenNode
    // De mi objeto en la API voy a traer las llaves 'name , phone, email, username'

    const mostrarDatos = (post) =>{
        // 3.1 Crear nodos(h2, h3, p, p)
        const name = document.createElement("h2");
        const username = document.createElement("h3");
        const email = document.createElement("p");
        const phone = document.createElement("p");
        //3.2 Meterles info
        name.innerHTML = post.name;
        username.innerHTML = post.username;
        email.innerHTML = post.email;
        phone.innerHTML = post.phone;

        //3.3 Mostrar los nodos en el navegador al insertarlos en su parentNode

        contenedorInfo.appendChild(name);
        contenedorInfo.appendChild(username);
        contenedorInfo.appendChild(email);
        contenedorInfo.appendChild(phone);
    }

    //4. Consumir API con fetch y evento
    botonInfo.addEventListener("click", ()=>{
        fetch("https://jsonplaceholder.typicode.com/users/4")
            .then(response => response.json())
            .then(response =>{
                // Guardo los datos obtenidos de la promesa en mi variable null
                post = response;
                mostrarDatos(post);
            })
            .catch(error => console.error("No te salión mi chavo"))
    })

    //---------Método POST con Fetch y envío----------
    const urlPost = 'https://jsonplaceholder.typicode.com/posts';
    fetch(urlPost, {
        //Indicamos que esta promesa es tipo POST
        method: "POST",
        //Definir headers
        headers:{'Content-Type': 'application/json; charset=UTF-8'},
        //Definir el Body que debe coincidir con mi API, para ello le paso un método stringify que me permite transformar el objeto en formato Json
        body: JSON.stringify({
            userId: 1986,
            id: 25365, // Esto es autoincrementable, no se visualiza
            title: 'un nuevo elemento en la API',
            body: 'Estoy enviando un nuevo método tipo Json a la API de jsonplaceholder utilizando el método POST'
        })
    })
    .then(response => response.json())
    .then(response =>{
        console.log(response)    
    })
    .catch(error => console.error("Falló"));


    // Programación asíncrona
//async tenemos funciones de tipo async-await

const getUser = async () =>{
    try{
        await new Promise(resolve=> setTimeout(resolve, 3000))
        //Promesa
        const response = await fetch('https://jsonplaceholder.typicode.com/users/8');
        const data = await response.json();
        console.log(data);
    }
    catch(error){
        console.error("Error en la petición", error);

    }
}

getUser();

