package Ejercicios15161718;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            dividirPorCero();
        }catch (ArithmeticException ae){
            System.out.println("No se puede dividir por cero " + ae.getMessage() + " " + ae.getStackTrace());
        }

        try{
            arrayError();
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("El indice que intenta  alcanzar no existe en el Array " + ae.getMessage() + " " + ae.getStackTrace());
        }
        try {
            archivoError();
        }catch (FileNotFoundException fe){
            System.out.println("El archivo no existe " + fe.getMessage() + " " + fe.getStackTrace());
        }




    }
    public static void dividirPorCero(){
        int numero1 = 0;
        int numero2 = 2;
        int resultado = numero2/numero1;
        System.out.println(resultado);
    }

    public static void arrayError(){
        String [] lista = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};

        System.out.println(lista[8]);
    }
    public static void archivoError() throws FileNotFoundException {
        File file = new File("archivoInexistente.txt");
        FileReader fr = new FileReader(file);

    }


}
