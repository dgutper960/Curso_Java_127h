package POO_ClasesAbstractas.form;

import POO_ClasesAbstractas.elementos.ElementoForm;
import POO_ClasesAbstractas.elementos.InputForm;
import POO_ClasesAbstractas.elementos.SelectForm;
import POO_ClasesAbstractas.elementos.TextAreaForm;
import POO_ClasesAbstractas.elementos.select.Option;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        /** Como la clase ElementoForm es abstracta no podemos crear una instancia de la misma */
        // ElementoForm nuevoElemento = new ElementoForm(); ERROR!

        /** DEBEMOS CREAR UNA CLASE ANÓNIMA QUE SE IMPLEMENTA AL VUELO **/
//        ElementoForm elemento = new ElementoForm() {
//            @Override
//            public String dibujarHTML() {
//                return null;
//            }
//        };
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
        Option java = new Option("1", "Java");
        lenguajes.addOption(java);// NECESARIO PARA SELECCIONAR OPCIÓN
        // TAMBIÉN SE PUEDE AÑADIR DIRECTAMENTE
        lenguajes.addOption(new Option("2", "Python"));
        lenguajes.addOption(new Option("3", "JavaScript/TypeScript"));
        lenguajes.addOption(new Option("4", "PHP"));
        lenguajes.addOption(new Option("5", "RUST"));
        lenguajes.addOption(new Option("6", "GO"));

        // AÑADIMOS VALORES A LOS CAMPOS
        username.setValor("Davilillo-Slash");
        password.setValor("davSlash1234");
        email.setValor("davililloslash@davslash.com");
        edad.setValor("39");
        experiencia.setValor("Finaliza FP-GS DAW con nota final superior a 7");
        java.setSelected(true); // AL SER UNA INSTANCIA PODEMOS INICIALIZAR A TRUE (las demás opciones no son instancias)

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

        /** Iteramos sobe ElementosForm
         * --> Vemos que cada objeto ha implementado el método sobreescrito de diferente forma **/
        for (ElementoForm elemento: elementos){
            System.out.println(elemento.dibujarHTML());
        }
    }
}
