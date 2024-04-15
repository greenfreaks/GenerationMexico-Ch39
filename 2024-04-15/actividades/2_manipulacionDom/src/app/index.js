const tituloH1 = document.getElementById("title1");
const tituloH2 = document.getElementById("title2");

console.log(tituloH1);
console.log(tituloH1.innerText); // Muestra el texto que vive en mi elemento en formato string
console.log(tituloH2.innerText);

const titulos = document.getElementsByClassName("title");
console.log(titulos);
console.log(titulos.length); // Muestra el numero de elementos que conforman a ese arreglo
console.log(typeof titulos); // Muestra el tipo de dato

const titulosH3 = document.getElementsByTagName("h3");
console.log(titulosH3);

/* *Método para llamar elementos mediante selectores CSS
 * Se usa para procesos específicos y sintaxis querySelector
 * Podemos traer la 1er coincidencia o todos los elementos de consulta
        * document.querySelector("selector")
        * document.querySelectorAll()
*/

//querySelector
const titulo4 = document.querySelector("#title4");
console.log(titulo4);

const primerTitulo = document.querySelector(".title");
console.log(primerTitulo);

//querySelectorAll
const titulosQuery = document.querySelectorAll(".title");
console.log(titulosQuery);

//Manipular DOM desde JS, en este caso los estilos del elemento
tituloH1.style.textAlign = "center";
tituloH1.style.color = "#E1523D"

//Modificar texto existente de un elemento, innerText me permite acceder y modificar el texto de un elemento
tituloH2.innerText = "Sesión de Manipuación del DOM"
tituloH2.style.color = "#C2BB30"

/* *Crear y agregar elementos en el DOM. Este proceso se divide en 2: crear el nodo y agregar el nodo
 * -Crear nodos:
        * document.createElement("tipoElemento") ---> Crea elementos a partir de etiquetas
        * document.createTextNode("string") -----> Crea texto dentro de etiquetas

* -Agregar nodos
        * parentMode.appendChild(node);
        * * parentMode.append();
        * * parentMode.appendChild(node)
        * * parentMode.insertBefore(node);
        * * parentMode.insertBefore(node);
 */

const tituloH4 = document.createElement("h4");
const imgNode = document.createElement("img");

//Ya cree mis nodos h4 e img ¿Dónde y cómo los agregamos?
//1. Obtengo el nodo padre (parentNode) mediante un querySelector
const imgParent = document.getElementById("img--container");
//2. Crear el texto que vivirá en el nodo 1 (titulo4).
const textoTitulo4 = document.createTextNode("Imágen agregada desde el node")
//3. Insertar el texto en el nodo 1
tituloH4.appendChild(textoTitulo4);
//4. Mado a llamar el Parent Node y agrego el Child node
imgParent.appendChild(tituloH4);
imgParent.style.color = "#A1C7E0"
//5. Agregando imagen.Establecer atributos de tipo img (src, alt, width, etc.)
imgNode.src="../../public/bobRoss.png";
imgNode.width="300";
imgNode.alt="Imágen de Bob Ross";
//6. Agregando al imágen al ParentNode
imgParent.appendChild(imgNode)


/*
 *Otra forma de modificar nodos
        * document.outerHTML -----> leer
        * node.innerHTML
*/

const elementOuter = tituloH2.outerHTML;
console.log(elementOuter);
tituloH2.innerHTML = "Manipulación del DOM"



