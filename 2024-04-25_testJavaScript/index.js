function calcularFactorial(num){
    let factorial = 1;
    for (let i = 1; i < num; i++){
        factorial *=1;
        console.log(factorial)
    }
    return factorial
}

calcularFactorial(4);

let x = 6 + 3 + "3";
console.log(x);

var miUsuario = {nombre: "Laura", edad: 27, ciudad: "madrid"}
var miJson = JSON.stringify(miUsuario);
console.log(miJson);

var comparar = function(test1, test2){
    return test1 == test2;
}

console.log(comparar(1078, "1078"));

for(let i = 10; i>0; i--){
    console.log(`Faltan ${i} segundos para el despegue`);
}