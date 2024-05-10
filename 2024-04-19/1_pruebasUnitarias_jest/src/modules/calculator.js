// 1. Aquí vamos a crear las funciones de nuestra calculadora
// Vamos a exportar como módulo de tipo CommosJS y no de tipo ESModules

const calculator ={
    sum(a, b){
        return a + b;
    },
    substract(a, b){
        return a - b;
    },
    multiply(a, b){
        return a * b;
    },
    divide(a, b){
        return a / b;
    },  
}

// Cómo exporta módulos con ESModules
//CommonsJS
module.exports = calculator;