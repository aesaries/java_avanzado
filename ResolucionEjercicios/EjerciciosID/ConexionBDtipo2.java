package EjerciciosID;

public class ConexionBDtipo2 implements Conexion{

    @Override
    public void guardarUsuario(Usuario usuario) {
        System.out.println("Se guarda un Usuario desde Conexion tipo 2");
        System.out.println("Datos del Usuario " + usuario.toString());
    }


}
