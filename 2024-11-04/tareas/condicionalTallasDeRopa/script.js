
function tallaDisponible(){
    let usuarioTalla = prompt("¿Qué talla desea elegir? Puede escoger entre las 3 siguientes opciones: CH, M, G").toUpperCase().trim();
    if(usuarioTalla === ""){
        alert("No puedes dejar el campo vacío, elige una talla");
        location.reload();
    }else{
        switch(usuarioTalla){
            case "CH":
                alert("¡Talla chica en existencia!");
                location.reload();

                break;
    
            case "M":
                alert("¡Talla mediana en existencia!");
                location.reload();
                break;
    
            case "G":
                alert("¡Talla grande en existencia!");
                location.reload();
                break;
    
            default:
                alert(`Lo lamentamos, no contamos con la talla ${usuarioTalla}, elige sólo entre estas 3 tallas: CH, M,  G`)
                location.reload();
        }  
    }
    
}
tallaDisponible();