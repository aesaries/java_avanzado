package PatronEstrategia;

public interface EstrategiaPago {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}
