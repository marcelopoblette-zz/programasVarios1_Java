package presentacion;

import java.util.Scanner;
import negocio.Negocio;
public class Presentacion {

    public static void main(String[] args) { //comienzo del main(programa principal)
        Scanner in = new Scanner(System.in);// se llama la clase Scanner para tomar los datos ingresados por el usuario.
        int opciones;// se declara la variable ociones para crear el menú que contenga las opciones que se ofrecerán al usuario.
        int eleccionUsuario = 0; // se inicializa la variable eleccionUsuario con valor cero, esta variable recogerá el valor retornado por la función seguirIntentando.
        boolean boolIterador = false; // se define variable boolIterador  con valor "false" para controlar la salida del ciclo Do-while que contendrá el menú de opciones en una estructura Switch.
        boolean menu;//variable booleana que toma la elección del usuario de volver o no al menu de opciones.
        do {//Ciclo do While que contiene el menú de opciones y le da continuidad al flujo del usuario por el menú de opciones, evitando que el programa se caiga.

            Scanner entrada = new Scanner(System.in); //se define el objeto "entrada" que almacenará la información ingresada por teclado por el usuario.
            System.out.println();
            System.out.println("Elija un programa para evaluar.");//Título de introducción al manú de opciones. Se imprime
            System.out.println("===============================");
            System.out.println(" ");
            System.out.println("1.- Operaciones Aritméticas.");
            System.out.println("2.- Numero Mayor.");
            System.out.println("3.- Bienvenida.");
            System.out.println("4.- Área de un Círculo.");
            System.out.println("5.- Número divisible por 2.");
            System.out.println("6.- Caracter ASCII.");
            System.out.println("7.- Valor de un Producto.");
            System.out.println("8.- Números del 1 al 100.");
            System.out.println("9.- Salir.");
            System.out.println("===============================");
            System.out.println();
            System.out.println();

            opciones = entrada.nextInt();
            entrada.nextLine();

            switch (opciones) {//Se crea estructura switch que desarrollará cada programa solicitado en la evaluación.

                case 1:
                    //1.- Operaciones Aritméticas
                    System.out.println("Programa que realiza operaciones aritméticas con 2 numeros ingresados."); //título que explica función del programa: "realiza operaciones aritméticas con 2 numeros ingresados"
                    System.out.println("======================================================================");
                    Negocio.sleep(2000);//llamada al Metodo sleep para acomodar el flujo de lectura y hacer que la experiencia del usuario tenga una cadencia y ritmos confortables.
                    String primerNumero; //definine variable tipo String para el primerNumero numero ingresado por el usuario.
                    String segundoNumero;//definine variable tipo String para el segundoNumero numero ingresado por el usuario.
                     {
                        int salida_ = 0;//define variable local que envia parámetro al método seguirIntentando.
                        do {//ciclo Do-While que contiene el desarrollo del programa.
                            primerNumero= Negocio.solicitaNumero();//asignación de valor ingresado por el usuario a la variable "primerNumero".
                            segundoNumero=Negocio.solicitaNumero();//asignación de valor ingresado por el usuario a la variable "segundoNumero".
                            System.out.println("Los números elegidos son: " + primerNumero + " y " + segundoNumero + ".");// se imprime por pantalla los numeros seleccionados por el usuario.
                            Negocio.sleep(2000);
                            System.out.println("Su suma es: " + Negocio.calculadora.suma(primerNumero, segundoNumero) + ". ");// se imprime por pantalla el resultado de la suma.
                            Negocio.sleep(2000);
                            System.out.println("Su resta es: " + Negocio.calculadora.resta(primerNumero, segundoNumero) + ".");// se imprime por pantalla el resultado de la resta.
                            Negocio.sleep(2000);
                            System.out.println("Su multiplicación es: " + Negocio.calculadora.multiplicacion(primerNumero, segundoNumero) + ". ");// se imprime por pantalla el resultado de la multiplicación.
                            Negocio.sleep(2000);
                            double numero2= Double.parseDouble(segundoNumero);
                            if ( numero2==0){// se valida si denominador es cero.
                            System.out.println("No es posible dividir por cero, no hay división.");// se imprime por pantalla el resultado de la división.
                            }else{
                            System.out.println("Su division es: " + Negocio.calculadora.division(primerNumero, segundoNumero) + ". ");}// se imprime por pantalla el resultado de la división luego de validar denominador != 0.
                            Negocio.sleep(2000);
                            if ( numero2==0){// se valida si denominador es cero.
                            System.out.println("No es posible dividir por cero, no hay Módulo.");// se imprime por pantalla el resultado del módulo.
                            }else{
                            System.out.println("Su módulo es: " + Negocio.calculadora.modulo(primerNumero, segundoNumero) + ". ");}// se imprime por pantalla el modulo resultante de la división.
                            Negocio.sleep(2000);
                            System.out.println(); //se imprime una línea vacía para facilitar la lectura de los datos impresos por pantalla.
                            System.out.println();

                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros numeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;}
                        } while (menu != false);}//condición establecida en false para continuar el programa o detenerlo.
                    break;

                case 2:
                    //2.- Numero Mayor.

                    System.out.println("Programa que encuentra el número mayor entre 2 números ingresados.");//título que explica función del programa.
                    System.out.println("==================================================================");
                    Negocio.sleep(2000);
                    {
                        int salida_ = 0;//define variable local que envia parámetro al método seguirIntentando.
                        do {
                            primerNumero = Negocio.solicitaNumero();//asignación de valor ingresado por el usuario a la variable "primerNumero".
                            segundoNumero = Negocio.solicitaNumero();//asignación de valor ingresado por el usuario a la variable "segundoNumero".
                            System.out.println("Los números ingresados son: " + primerNumero + " y " + segundoNumero + ".");// se imprime por pantalla los numeros seleccionados por el usuario.
                            System.out.println();
                            Negocio.sleep(2000); Negocio.numeroMayor(primerNumero, segundoNumero);// se llama a la funcion que elige el numero mayor.
                            System.out.println();
                            System.out.println();
                            Negocio.sleep(2000);
                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros numeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;
                            }
                        } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                    }
                     break;
                case 3:
                    //3.- Bienvenida.
                    
                    System.out.println("Programa que saluda al ingresar el nombre.");//título que explica función del programa.
                    System.out.println("==========================================");
                    Negocio.sleep(1000);
                    {
                        int salida_ = 0;//define variable local que envia parámetro al método seguirIntentando.
                        do {
                            String nombre= Negocio.solicitaTexto();//asignación de valor ingresado por el usuario.

                            // Resultado
                            System.out.println("");
                            System.out.println("Bienvenid@ " + nombre + ".");// se imprime resultado por pantalla.
                            System.out.println();
                            System.out.println();
                            Negocio.sleep(2000);
                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros numeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;
                            }

                        } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                    }
                    break;

                case 4:
                    //4.- Área de un Círculo.
                    
//                    String radio_;//definine variable tipo String para el  valor ingresado por el usuario.
                    double PI = Math.PI;
                    double area;
                    System.out.println("Programa que calcula el área de un circulo al ingresar su radio.");//título que explica función del programa.
                    System.out.println("================================================================");
                    Negocio.sleep(3000);
                     {
                        int salida_ = 0;//define variable local que envia parámetro al método seguirIntentando.
                        do {
                            String radio_ = Negocio.solicitaNumero();//asignación de valor ingresado por el usuario.
                            double radio = Double.parseDouble(radio_);//asignación del valor string ingresado y converción a tipo double luego de las validaciones.
                            area = PI * Math.pow(radio, 2);
                            System.out.println("El area del circulo es: " + area + ".");// se imprime resultado por pantalla.
                            System.out.println();
                            System.out.println();
                            Negocio.sleep(2000);
                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros numeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;
                            }
                        } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                     }
                    break;
                case 5:
                    //5.- Número divisible por 2.

                    
                    System.out.println("Programa que indica si el número ingresado es divisible por 2.");//título que explica función del programa.
                    System.out.println("==============================================================");
                    Negocio.sleep(2000);
                     {
                        int salida_ = 0;//define variable local que envia parámetro al método seguirIntentando.
                        do {
                           primerNumero = Negocio.solicitaNumero();//asignación de valor ingresado por el usuario.
                            segundoNumero = "2";
                            Negocio.divisiblePorDos(primerNumero, segundoNumero);
                            System.out.println();
                            Negocio.sleep(2000);

                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros numeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;
                            }
                        } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                    }
                    break;

                case 6:
                    //6.- Caracter ASCII.
                    System.out.println("Programa que indica a qué símbolo imprimible del Código ASCII corresponde un número entero ingresado.");//título que explica función del programa.
                    System.out.println("=====================================================================================================");
                    Negocio.sleep(2000);
                    System.out.println("Los simbolos estándares o imprimibles del Código ASCII van desde el n° 33 al n°255.");// se imprime por pantalla texto explicativo.
                    System.out.println("Excepto el número del 127 que es la función DELETE; por lo que no imprime nada.");// se imprime por pantalla texto explicativo.
                    Negocio.sleep(2000);
                    System.out.println();
                    {
                        int salida_ = 0;//define variable local que envia parámetro al método seguirIntentando.
                        do {
                            String numero = Negocio.solicitaNumero();//asignación de valor ingresado por el usuario.
                            int num = Integer.parseInt(numero);
                            Negocio.simboloASCII(num);
                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros numeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;}
                        } while (menu != false);}//condición establecida en false para continuar el programa o detenerlo.
                    break;

                case 7:
                    //7.- Valor de un Producto.
                    System.out.println("Programa que muestra el valor del IVA sumado a un número ingresado como valor neto.");//título que explica función del programa.
                    System.out.println("===================================================================================");
                     {
                        int salida_ = 0;//define variable local que envia parámetro al método seguirIntentando.
                        do {
                            String numero = Negocio.solicitaNumero();//asignación de valor ingresado por el usuario.
                            System.out.println("El valor Total del Producto, con IVA incluido, es: $" + Negocio.calculaIVA(numero) + ".");// se imprime resultado por pantalla.
                            System.out.println();
                            Negocio.sleep(2000);
                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros numeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;
                            }} while (menu != false);}//condición establecida en false para continuar el programa o detenerlo.
                     break;

                case 8:
                    //8.- Números del 1 al 100.
                    System.out.println("Programa que muestra los numeros del 1 al 100.");//título que explica función del programa.
                    System.out.println("==============================================");
                    Negocio.sleep(1000);
                     {
                        int salida_ = 0;//define variable local que envia parámetro al método seguirIntentando.
                        do {
                            System.out.println();
                            System.out.println("Los numeros del 1 al 100 son: ");// se imprime por pantalla titulo explicativo.
                            Negocio.sleep(1000);
                            Negocio.Numeros();
                            Negocio.sleep(2000);
                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros numeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;
                            }
                        } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                     }
                     break;
                case 9:
                    //9.- Salir. 
                    System.out.println("Gracias por su evaluación! ");// mensaje de despedida al elegir salir del programa en el menú de opciones.
                    System.out.println();
                    System.out.println();
                    Negocio.sleep(2000);
                    break;
                
                default:
                    System.out.println("LA OPCIÓN INGRESADA ES INCORRECTA ");// se imprime mensaje por pantalla en caso de que la opción ingresada este fuera de las ofrecidas en el menú.
                    System.out.println();
                    System.out.println();
                    Negocio.sleep(2000);
                    break;}
        } while (opciones != 9);}}//condición establecida para continuar el programa o salir de el.