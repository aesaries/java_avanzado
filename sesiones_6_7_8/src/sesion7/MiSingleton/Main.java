package sesion7.MiSingleton;

public class Main {
    public static void main(String[] args) {

        MiSingleton xx = MiSingleton.getInstacia();

        System.out.println(xx);

        MiSingleton yy = MiSingleton.getInstacia();

        System.out.println(yy);


    }
}
