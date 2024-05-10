//Seleccionar elementos del DOM
let  infoButton = document.getElementById("button");
let answerContainer = document.getElementById("answer")
// API
const API_ENDPOINT = 'https://yesno.wtf/api';
let post = null; // Se crea una variable tipo null donde se va a guardar la info de la ÄPI

/**
 * STEPS:
 *
 * 1. Create a fetchAnswer function and call the API
 * 2. Output the API's response
 * 3. Attach fetchAnswer to an event listener
 * 4. Clear output after 3 seconds
 * 5. Optional: add loading/error states
 *
 */

fetch(API_ENDPOINT)
        .then(response => response.json())
        .then(response=>{
            console.log(response); //Me trae toda la API
        });

function fetchAnswer(post){
    //Se crean nodos
    const answer = document.createElement("h1");

    //Meterles info innerHTML a las key del objeto
    answer.innerHTML = post.answer;

    //Insertar as etiquetas creadas al parent node
    answerContainer.appendChild(answer);

}

infoButton.addEventListener("click", ()=>{
    fetchAnswer();
});



