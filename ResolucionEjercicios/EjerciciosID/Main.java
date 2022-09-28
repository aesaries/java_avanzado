package EjerciciosID;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conexion conexion;

        System.out.println("Elige la Base de Datos  1 o 2 ");
        int x = sc.nextInt();
        if (x == 1){
            conexion = new ConexionBDtipo1();
        }else {
            conexion = new ConexionBDtipo2();
        }


        Usuario persona = new Usuario();
        persona.setNombre("Enzo");
        persona.setEdad(43);
        persona.setGenero("Masc");


        guardarEnBasedeDatos(conexion, persona);


    }

    public static void guardarEnBasedeDatos(Conexion cx, Usuario usu){
        cx.guardarUsuario(usu);

    }




}
