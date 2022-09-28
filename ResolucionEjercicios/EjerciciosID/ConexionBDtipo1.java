package EjerciciosID;

public class ConexionBDtipo1 implements Conexion{


    @Override
    public void guardarUsuario(Usuario usuario) {
        System.out.println("Se guarda un Usuario desde Conexion tipo 1");
        System.out.println("Datos del Usuario " + usuario.toString());
    }
}
