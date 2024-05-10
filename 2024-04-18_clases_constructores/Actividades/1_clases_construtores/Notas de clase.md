# class: La clase es como una plantilla-molde con el que podemos crear un objeto 
## constructor: 
Es una caracteristica que tiene las clases, es una funcion obligatoria que nos va a ayudar a construit el objeto. El constructor va a contener las propiedades o parametros de nuestra clase
this.:Se refiere al objeto que estamos creando

## Método: 
Se refiere a lo que puede hacer nuestro objeto
Instanciacion: Cuando se finalixa todo este proceso tenemos la clase instanciada (materializada) (new)


## Atributo : 
Es una caracteristica o propiedad asociado a un objeto


## Abstraccion: 
Se basa en reducir al objeto, es decir que sea lo menos complejo posible


## Herencia: 
Se refiere a que cuando creamos una clase, va a tomar todo lo que tiene esa clase y se lo va a "heredar" (pasar) a la siguiente clase (subclase)


## Polimorfismo: 
Tener instancias de clases diferentes, pero responden al mismo metodo pero de forma diferente. Como un objeto se comporta de forma distinta ante el mismo metodo

## Métodos estáticos: 
Es un método que no necesita que el objeto esté definido para poder ser creado

## Método Setter: Nos  ayuda a hacer modificaciones dentro de mis parámetros


## ----------------------------------- PRICNIPIOS SOLID ------------------------------------##

1. SRP Single Responsibility Principle (Principio de Responsabilidad Única): Establece que una clase debe de tener una única responsabilidad.

2. OCP Open/Close Principle (Principio abierto y cerrado): Las clases deben de estar abiertas para poder heredad y extenderse, pero deben de estar cerradas a modificaciones.

3. LSP Liskov Subtitution Principle (Principio de Sustitución de Liskov): Establece que los objetos de una clase hija pueden ser sustituidos por objetos de una clase padre sin afectar a mi programa.

4. ISP Interface Segregation (Principio de Segregación de Interfaces): Mis usuarios que entren a mi sitio web deben de ser independientes de otras interfaces, a mi usuario le voy a mostra únicamente las interfaces que necesite ver, no va a ver pagínas que no sean necesarias que este vea.

5. DIP Dependency Inversion Principle  (Principio de Inversión de Dependencias): Los módulos de alto nivel (clase padre), no debe de depender de las clases Hijas, esta no se debe de modificar por nada.