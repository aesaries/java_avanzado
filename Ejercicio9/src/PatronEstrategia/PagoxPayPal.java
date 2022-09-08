package PatronEstrategia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PagoxPayPal implements EstrategiaPago{

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
        DATA_BASE.put("asd","enzo@gmail.com");
    }

    /**
     * Ingresando datos de usuario
     */
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Ingrese su email de usuario: ");
                email = READER.readLine();
                System.out.print("Ingrese contraseña: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Verificacion de datos exitosa");
                } else {
                    System.out.println("mail o contraseña incorrectos!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    /**
     * salvando datos de usuario poara futuras compras
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Pagando " + paymentAmount + " por PayPal.");
            return true;
        }
            return false;

    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
