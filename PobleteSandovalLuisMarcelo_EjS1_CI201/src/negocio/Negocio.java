/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.Datos;
import java.util.Scanner;
        
public class Negocio extends Datos{
    public static void sleep(int time) { //Metodo sleep que retrasa el hilo(thread) de ejecucion en la cantidad de milisegundos que se indique como parámetro de tipo int(time).
        try {// Se implementa una estructura de seguridad( try & catch), en caso que el usuario ingrese un tipo de dato que no corresponda,para evitar la caída del método.
            Thread.sleep(time); // Para este caso  basa en la clase Thread y toma el parametro de milisegundos configurados(time).
        } catch (Exception e) { }//En caso de error, este se "captura con la excepción, para este caso la genérica "e").
        
    }
    public static boolean validaInt(String num) { //Este metodo valida que el valor que ingrese el usuario sea un entero.
        try {// Se implementa una estructura de seguridad( try & catch), en caso que el usuario ingrese un tipo de dato que no corresponda,para evitar la caída del método.
            Integer.parseInt(num);// El proceso se hace a través de un "parseo" o conversion de datos en este caso desde texto(String) a entero (Int).
        } catch (Exception e) {//En caso de error, este se "captura con la excepción, para este caso la genérica "e").
            return false;}// Valor booleano que retorna en caso de error.
        return true;//Valor booleano que retorna en caso que la validación sea exitosa.
    }
    public static boolean validaTexto(String nombre) {//Este metodo valida que el valor que ingrese el usuario sea un texto(String).
        try {// Se implementa una estructura de seguridad( try & catch), en caso que el usuario ingrese un tipo de dato que no corresponda,para evitar la caída del método.
            return nombre.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ]+([ '-][a-zA-ZñÑáéíóúÁÉÍÓÚ]+)*");// Retorna valor Booleano "True"en caso que la validación sea exitosa.
        } catch (Exception e) {//En caso de error, este se "captura con la excepción, para este caso la genérica "e").
            return false;}// Valor booleano que retorna en caso de error.
    }
    public static boolean validaDouble(String num) {//Este metodo valida que el valor que ingrese el usuario sea un entero.
        try {// Se implementa una estructura de seguridad( try & catch), en caso que el usuario ingrese un tipo de dato que no corresponda,para evitar la caída del método.
            Double.parseDouble(num);
        } catch (Exception e) {//En caso de error, este se "captura con la excepción, para este caso la genérica "e").
            return false;}//Valor booleano que retorna en caso de error.
        return true;//Valor booleano que retorna en caso que la validación sea exitosa.
    }
    public static int seguirIntentando(int menu) { //Este método toma la respuesta del usuario si quiere volver al programa para probar otros valores o ir al menú principal.
    boolean seguir = false;// Se define valor booleano para condicionar la salida del ciclo Do-While.
        Scanner entrada = new Scanner(System.in);
        do {//Ciclo Do-While que solicitará valores al usuario mientras se cumpla que el valor booleano establecido (!seguir).
            System.out.println("* Presione 1 para realizar otra prueba.");// se le solicita al usuario que ingrese un valor entero sea 1 o 2.       
            System.out.println("* Presione 2 para ir al menú.");
            System.out.println();
            String salida = entrada.next();// Se almacena el valor ingresado por el usuario.
            if (validaInt(salida)==true) {//se valida que el valor ingresado sea entero.
                menu = Integer.parseInt(salida);//Una vez validado se asigna el valor a la variable menu.
                if (menu == 1 || menu == 2) {//Se reducen las opciones para continuar a 2 y 1
                    seguir = true;// Sólo continúa si el valor ingresado es 1 o 2.
                } else {//si el valor está fuera de las opciones posibles se imprime pro pantalla el mensaje: "Favor ingrese sólo 1 o 2.".
                    System.out.println("Favor ingrese sólo 1 o 2. ");
                    System.out.println();
                    System.out.println("Volvamos a intentar!"); //Si el valor ingresado no es un enterose imprime pro pantalla el mensaje :"Volvamos a intentar!".
                    System.out.println();
                    seguir = false;}//si el valor ingresado por el usuario está fuera de las opciones posibles 1 ó 2 se vuelve al comienzo del ciclo.
            } else {
                seguir = false;}//si el valor ingresado por el usuario no es un entero, se vuelve al comienzo del ciclo.
        } while (!seguir); //condición establecida para el ciclo Ciclo Do-While.
        return menu;//se retorna al main el valor ingresado por el usuario luego de atravesar  las validaciones.
    }
    public static class calculadora{
        public  static double suma(String num1 ,String num2){
           double numero1 = Double.parseDouble(num1);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
           double numero2 = Double.parseDouble(num2);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
           return numero1+ numero2;//retorna la suma.
        }
        public static double resta(String num1 ,String num2){
            double numero1 = Double.parseDouble(num1);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
            double numero2 = Double.parseDouble(num2);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
            return numero1 - numero2;//retorna la resta.
        }
        public static double multiplicacion (String num1 ,String num2){
            double numero1 = Double.parseDouble(num1);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
            double numero2 = Double.parseDouble(num2);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
            return numero1 * numero2;//retorna la multiplicación.
        }
        public static double division (String num1 ,String num2){
            double numero1 = Double.parseDouble(num1);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
            double numero2 = Double.parseDouble(num2);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
            return  numero1/numero2;//retorna la división.
        }
        public static double modulo (String num1 ,String num2){
            double numero1 = Double.parseDouble(num1);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
            double numero2 = Double.parseDouble(num2);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
            return numero1 % numero2;//retorna el módulo.
        }}
    public static double numeroMayor(String num1 ,String num2){
        double numero1 = Double.parseDouble(num1);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
        double numero2 = Double.parseDouble(num2);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
        double numero_Mayor;
        if (numero1 > numero2) {
            numero_Mayor=numero1;
            System.out.println("El numero mayor es: " + numero_Mayor + ".");// se imprime resultado por pantalla con el número mayor.
        } else if (numero1 == numero2) {
            numero_Mayor=0;
            System.out.println("Los numeros son iguales.");// se imprime resultado por pantalla si los valores ingresados son el mismo.
        } else {
            numero_Mayor=numero2;
            System.out.println("El numero mayor es: " + numero_Mayor + ".");// se imprime resultado por pantalla con el numero mayor.
        }return numero_Mayor;
    }
    public static boolean divisiblePorDos(String num1 ,String num2){
        double numero1 = Double.parseDouble(num1);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
        double numero2 = 2.0;
        boolean divisible = true;
        if (numero1 % numero2 == 0) {
            divisible=true;
            System.out.println(" El número " + numero1 + " es divisible por 2.");// se imprime resultado por pantalla, si es divisible por 2.
        } else {
            divisible=false;
            System.out.println("El número " + numero1 + " no es divisible por 2.");// se imprime resultado por pantalla, sino es divisible por 2.
        }return divisible;
    }
    public static String solicitaNumero(){
        
        String Numero; //definine variable tipo String para el primerNumero numero ingresado por el usuario.
        Scanner entrada = new Scanner(System.in);// se llama la clase Scanner para tomar los datos ingresados por el usuario.
        boolean boolIterador = false; // se define variable boolIterador  con valor "false" para controlar la salida del ciclo Do-while que contendrá el menú de opciones en una estructura Switch.
        do {//ciclo Do-While que contiene el desarrollo del programa.
            do {//ciclo Do-While que contiene el procesamiento del primerNumero numero.
                System.out.println("Introduce un número; ");//solicitud al usuario que ingrese un valor numerico.
                Numero = entrada.next();//asignación de valor ingresado por el usuario a la variable "primerNumero".
                if (validaDouble(Numero) == true) {//validación del dato ingresado por usuario si es o  no numerico (tipo double).
                    boolIterador = false;}// se mantiene el valor false para boolIterador si el valor ingresado es numerico y continua el flujo del progarama.
                else {// si el valor no es numerico se imprime por pantalla el mensaje :"El dato ingresado NO es un numero" y se define boolIterador con valor true para volver al inicio del ciclo Do-While.
                    System.out.println("El dato ingresado NO es un numero.");
                    boolIterador = true;}
            } while (boolIterador);//condición establecida en false para continuar el programa si los datos ingresados pasan las validaciones. 
        } while (boolIterador);
        return Numero;
    }
    public static String solicitaTexto(){//Método que solicita un texto al usuario.
        String nombre; //definine variable tipo String para el primerNumero numero ingresado por el usuario.
        Scanner entrada = new Scanner(System.in);// se llama la clase Scanner para tomar los datos ingresados por el usuario.
        boolean boolIterador = false; // se define variable boolIterador  con valor "false" para controlar la salida del ciclo Do-while que contendrá el menú de opciones en una estructura Switch.
        do {//ciclo Do-While que contiene el desarrollo del programa.
            do {//ciclo Do-While que contiene el procesamiento del primerNumero numero.
                System.out.println("Introduce un nombre; ");//solicitud al usuario que ingrese un valor numerico.
                nombre = entrada.next();//asignación de valor ingresado por el usuario a la variable "primerNumero".
                if (validaTexto(nombre) == true) {//validación del dato ingresado por usuario si es o  no numerico (tipo double).
                    boolIterador = false;}// se mantiene el valor false para boolIterador si el valor ingresado es numerico y continua el flujo del progarama.
                else {// si el valor no es numerico se imprime por pantalla el mensaje :"El dato ingresado NO es un numero" y se define boolIterador con valor true para volver al inicio del ciclo Do-While.
                    System.out.println("El dato ingresado NO es un nombre.");
                    boolIterador = true;}
            } while (boolIterador);//condición establecida en false para continuar el programa si los datos ingresados pasan las validaciones. 
        } while (boolIterador);
        return nombre;
    }
    
    public static void simboloASCII(int num){//Método que entrega el caracter ASCII que corresponde a un numero ingresado.
        if ((num < 33) || (num > 255) || (num == 127))  // se valida que el dato ingresado corresponda a los solicitado.
            {System.out.println("* El número ingresado no corresponde a un valor imprimible o estándar del Código ASCII.");//se imprime mensaje en caso que la opción no corresponda a lo solicitado.
            System.out.println();
            sleep(1000);
        }else{
            System.out.println("El símbolo del Código ASCII que corresponde al número " + num + " es: " + (char) +num);// se imprime resultado por pantalla.
            System.out.println();
            Negocio.sleep(1000);}
    }
    public static double calculaIVA(String num){//Método que calcula el valor de un numero más su IVA.
        double numero = Double.parseDouble(num);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
        double iva = 0.19; //Cálculo de IVA
        double valor_producto = numero +( numero*iva);//Cálculo valor producto con IVA incluído.
        return valor_producto;
    }
    public static void Numeros(){
        int numeros[] = new int[100];//definine arreglo de tamaño 100, que contendrá los números del 1 al 100.
        int cont = 1;//se implementa un contador para agregar un valor por cada ciclo recorrido hasta llegar al largo establecido para el arreglo.
        for (int i = 0; i < numeros.length; i++) {//se implementa ciclo for para ingresar datos al arreglo.
            int saltoLinea = i % 10;// se implementa salto de línea cada 10 valores para dar una visibilidad amigable a la impresión del resultado.
            if (saltoLinea == 0) {
                System.out.println();}
            numeros[i] = cont++; //se guarda el valor de el contador en i en cada ciclo recorrido.
            System.out.printf(numeros[i] + " ");// se imprime resultado por pantalla.
            Negocio.sleep(70);}
        System.out.println();
        System.out.println();
    }
}