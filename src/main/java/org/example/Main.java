package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        int opcion, number;
        do {
            System.out.println("Intoduzca el numero del ejecicio que quiere revisar ");
            System.out.println("1.Ejercicio inputStrem printStram");
            System.out.println("2.Ejercicio dar vuelta un string");
            System.out.println("3.Ejercicio recorrer array de strings");
            System.out.println("4.Ejercicio array bidimensional");
            System.out.println("5.Ejercicio vectores");
            System.out.println("6.Ejercicio Problematica de los vectores");
            System.out.println("7.Ejercicio ArrayList to Linked List");
            System.out.println("8.Ejercicio ArrayList autocompletada");
            System.out.println("9.Ejercicio Throws/Throw excepetion");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese la ruta del archivo que desea leer (C:/Users/user/Desktop/NombreDelArchivo  con la extension corrsepondiente(jpg,txt,pdf))");
                    Scanner ruta = new Scanner(System.in);
                    String rutaI = ruta.nextLine();
                    System.out.println("Ingrese el nombre con el que desea que el archivo se guarde con la extension correspondiente(jpg,txt,pdf)");
                    Scanner file = new Scanner(System.in);
                    String newFileName = file.nextLine();
                    readArchive(rutaI, newFileName);
                }
                break;


                case 2: {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Escriba la frase que desea revertir");
                    String texto = scanner.nextLine();

                    String reversedText = reverse(texto);
                    System.out.println(reversedText);
                }
                case 3: {
                    System.out.println("Introduza 5 elementos para su lista");
                    String[] array = new String[5];
                    Scanner lista = new Scanner(System.in);
                    array[0] = lista.next();
                    array[1] = lista.next();
                    array[2] = lista.next();
                    array[3] = lista.next();
                    array[4] = lista.next();
                    System.out.println("Escriba Listo para finalizar la lista");
                    lista.next();
                    recorrerArray(array);


                }
                break;
                case 4: {

                    System.out.println("introdcuzca que tipo de nombre le daria a cada una de las siguientes mascotas");
                    Scanner duo = new Scanner(System.in);
                    System.out.println("Que nombre le pondrias a un perro");
                    String perro = duo.next();
                    System.out.println("Que nombre le pondrias a un gato");
                    String gato = duo.next();
                    System.out.println("Que nombre le pondrias a un conejo");
                    String conejo = duo.next();
                    System.out.println("Que nombre le pondrias a un hamster");
                    String hamster = duo.next();
                    System.out.println("Que nombre le pondrias a un pollo");
                    String pollo = duo.next();


                    String[][] mascotas = {{"perro", perro}, {"gato", gato}, {"conejo", conejo}, {"hamster", hamster}, {"pollo", pollo}};
                    arrayBi(mascotas);

                }
                break;
                case 5: {
                    Vector<String> vector = new Vector<>();
                    System.out.println("Introduzca los username de los 5 integrantes del equipo");
                    Scanner usuario = new Scanner(System.in);
                    System.out.println("Usuario 1:");
                    String usuario1 = usuario.next();
                    vector.add(usuario1);
                    System.out.println("Usuario 2:");
                    String usuario2 = usuario.next();
                    vector.add(usuario2);
                    System.out.println("Usuario 3:");
                    String usuario3 = usuario.next();
                    vector.add(usuario3);
                    System.out.println("Usuario 4:");
                    String usuario4 = usuario.next();
                    vector.add(usuario4);
                    System.out.println("Usuario 5:");
                    String usuario5 = usuario.next();
                    vector.add(usuario5);

                    vectors(vector);
                }
                break;
                case 6: {
                    System.out.print("El porblema de intentar ingresar 1000 entradas a la vez en un vector con la capacidad de aumento predeterminada" + "\n" +
                            "es que el vector tendra que repetir multiples veces el proceso de redimensionarse (ya que el basico es de 10 y por cada " + "\n" +
                            "intento incrementa duplicando la cantidad inicial) lo cual consumiria muchisima memoria en el ordenador" + "\n" + "\n");
                }
                break;
                case 7: {
                    ArrayList<String> names = new ArrayList<>();
                    System.out.println("Introduce 4 nombres para la lista");
                    Scanner name = new Scanner(System.in);
                    System.out.println("Nombre 1");
                    String nombre1 = name.next();
                    names.add(nombre1);
                    System.out.println("Nombre 2");
                    String nombre2 = name.next();
                    names.add(nombre2);
                    System.out.println("Nombre 3");
                    String nombre3 = name.next();
                    names.add(nombre3);
                    System.out.println("Nombre 4");
                    String nombre4 = name.next();
                    names.add(nombre4);

                    arrayLtolinkedL(names);
                }
                break;
                case 8:{
                    arrayList();
                }break;
                case 9:{
                    System.out.println("Introduce un numero");
                    Scanner numero= new Scanner(System.in);
                    int numeroADividir= numero.nextInt();
                try{
                    DividePorCero(numeroADividir);
                }catch (ArithmeticException e){
                    System.out.println( "error aritmetico");
                }finally {
                    System.out.println("Demo de codigo");
                }

                }break;

                default:

                    System.out.println("Wrong input..!");
                    break;

            }
            System.out.println("Presiona 5 para continuar");
            number = sc.nextInt();
        }//mantengo el programa corriendo al reinicial el do a traves de la tecla 5
        while (number == 10);


    }
    // tareas Invocables

    public static void DividePorCero(int number) throws ArithmeticException{
        try {
            int result = number / 0;
         }catch(ArithmeticException e){
             throw new ArithmeticException();
        }
    }

    public static void arrayList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <10;i++){
            int num= (i+1);
            if (num==1){
                list.add(num);
            }else if (num % 2 != 0){
            list.add((num));}
        }
        System.out.println(list);
    };

    public static void arrayLtolinkedL(ArrayList<String> arrayList) {
        LinkedList<String> Lista = new LinkedList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Lista.add(arrayList.get(i));
            System.out.println(arrayList.get(i));
        }
        for (int i = 0; i < Lista.size(); i++) {
            System.out.println(Lista.get(i));
        }
    }

    public static void vectors(Vector<String> vector) {
        Vector<String> vectorFinal = new Vector<>();
        int pos = 0;
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("El nombre del suario " + (i + 1) + " es : " + vector.get(i));
            if (i == 1 || i == 2) {
                vector.remove(i+pos);
                pos--;
            }
        }
        System.out.println(vector);
    }


    public static void arrayBi(String[][] arrayBi){
        for (String[] strings : arrayBi) {

            System.out.println("Mascota: " + strings[0] + " Nombre: " + strings[1]);
        }

    }
    public static String reverse(String texto) {

        char[] reverseArray= new char[texto.length()];
        int reverseIndex=0;
        String reverse="";
        for (int i = texto.length()-1; i >= 0; i--) {
            reverseArray[reverseIndex]= texto.charAt(i);
            reverseIndex++;
        }
        for (char c : reverseArray) {
            System.out.println(c);
        }
        for(int i=0 ; i< texto.length() ; i++) {
            reverse= reverse + reverseArray[i];
        }
        return reverse;

    }

    public static void readArchive(String fileIn, String fileOut)  {
        try{
            InputStream archivo = new FileInputStream(fileIn);

            byte[] file= archivo.readAllBytes();

            PrintStream salida= new PrintStream(fileOut);
            salida.write(file);

        } catch(FileNotFoundException e){

            System.out.println("No se encontro el fichero"+ e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("no puede leerse" +e.getMessage());
        }

    }
  public static void recorrerArray(String[] array){

      for (String s : array) {
          System.out.println(s);
      }
  }
}




