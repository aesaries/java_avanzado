package PatronEstrategia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagoxTarjetaCredito implements EstrategiaPago{

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * Ingresando datos de tarjeta de credito
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Ingrese numero de tarjeta de credito: ");
            String number = READER.readLine();
            System.out.print("Ingrese fecha de vencimiento 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Ingrese codigo VCC: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // Validate credit card number...

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**

     * Luego de la validacion podemos hacer el cargo de la tarjeta de credito
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Pagando " + paymentAmount + " con Tarjeta de Credito.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
