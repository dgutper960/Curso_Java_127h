package POO_ClasesAbstractas.form;

import POO_ClasesAbstractas.elementos.*;
import POO_ClasesAbstractas.elementos.select.Option;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        /** Como la clase ElementoForm es abstracta no podemos crear una instancia de la misma */
        // ElementoForm nuevoElemento = new ElementoForm(); ERROR!

        /** PODEMOS CREAR UNA CLASE ANÓNIMA QUE SE IMPLEMENTA AL VUELO **/
        ElementoForm saludo = new ElementoForm() {
            @Override
            public String dibujarHTML() { // CREAMOS UNA IMPLEMENTACIÓN SIMPLE PARA UN SOLO USO, Y DENTRO DE UN CONTEXTO
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'/>";
            }
        };
        /** SE CREA EN ESTE MAIN Y NO ES REUTILIZABLE POR OTRAS CLASES
         *
         * Para este ejemplo, instanciaremos las clases hija de ElementoForm */

        /** Instancias de InputForm para generar los campos del formulario */
        InputForm username = new InputForm("username"); // nombre campo / tipo por defecto
        InputForm password = new InputForm("clave", "password"); // nombre campo / tipo de elemento HTML
        InputForm email = new InputForm("email", "email"); // nombre campo / tipo de elemento HTML
        InputForm edad = new InputForm("edad", "number"); // nombre campo / tipo de elemento HTML

        /** Creamos un textarea **/
        TextAreaForm experiencia = new TextAreaForm("experiencia", 5, 9);

        /** Creamos un combo-box */
        SelectForm lenguajes = new SelectForm("lenguajes"); // nombre combo-box
        // ESTE OBJETO, PERMITE SELECCIONAR DE UNA LISTA DE OPCIONES
        // AÑADIMOS OPCIONES A LA LISTA (usamos List.add())
        Option java = new Option("Java", "1");
        lenguajes.addOption(java);// NECESARIO PARA SELECCIONAR OPCIÓN
        // TAMBIÉN SE PUEDE AÑADIR DIRECTAMENTE
        lenguajes.addOption(new Option("Python", "2")) //AÑADIMOS MÁS OPCIONES DE FORMA ENCADENADA
        .addOption(new Option("JavaScript/TypeScript", "3").setSelected(true)) /** otra forma más directa y no es necesaria la instancia previa */
        .addOption(new Option("PHP", "4"))
        .addOption(new Option("RUST", "5"))
        .addOption(new Option("GO", "6"));

        // AÑADIMOS VALORES A LOS CAMPOS
        username.setValor("Davilillo-Slash");
        password.setValor("davSlash1234");
        email.setValor("davililloslash@davslash.com");
        edad.setValor("39");
        experiencia.setValor("Finaliza FP-GS DAW con nota final superior a 7");
//        java.setSelected(true); // AL SER UNA INSTANCIA PODEMOS INICIALIZAR A TRUE (las demás opciones no son instancias)
//        // DAMOS VALOR A LA CLASE ANÓNIMA PARA EL EJEMPLO
        saludo.setValor("Hola!, este campo está deshabilitado");

        /** Creamos una Lista de objetos de la clase abstracta **/
        List<ElementoForm> elementos = new ArrayList<>();
        //LA CLASE ArrayList IMPLEMENTA List, POR ESO PODEMOS CREAR UN ArrayList DEL TIPO List
        /** Añadimos todos los elementosForm al ArrayList de ElementosForm */
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguajes);
        //AÑADIMOS EL CAMPO CON LA CLASE ANÓNIMA PARA EL EJEMPLO
        elementos.add(saludo);

        /** LA forma ordenada de hacer lo anterior sería: **/
//        List<ElementoForm> elementos = Arrays.asList(
//                username,
//                password,
//                email,
//                edad,
//                experiencia,
//                lenguajes,
//        //AÑADIMOS EL CAMPO CON LA CLASE ANÓNIMA PARA EL EJEMPLO
//                saludo
//        );



        /** Iteramos sobe ElementosForm
         * --> Vemos que cada objeto ha implementado el método sobreescrito de diferente forma **/
//        for (ElementoForm elemento: elementos){
//            System.out.println(elemento.dibujarHTML()+
//                    "\n</br>");
//        }

        /** Otra forma más elegante de hacer lo anterior, sería **/
        // MÉTODO forEach INTEGRADO EN LA API COLLECTION DE JAVA
        elementos.forEach(elemento -> {
            System.out.println(elemento.dibujarHTML());
            System.out.println("</br>");
        });


    }
}
