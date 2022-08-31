package sesion7.MiSingleton;

public class MiSingleton {
    private MiSingleton(){}

    private static MiSingleton instacia;

    public static MiSingleton getInstacia() {

        if(instacia == null){
            instacia = new MiSingleton();
        }

        return instacia;
    }
}
