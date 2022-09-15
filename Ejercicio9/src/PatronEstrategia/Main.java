package PatronEstrategia;

/**
 * Pequeño ejemplo para usar comentarios
 */
public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido();
        Pedido p2 = new Pedido();

        RecibePedidos(p1,p2);



    }

    /**
     * El metodo recibe cantidad indistinta de pediddos y los muestra
     * @param pedidos
     */
    public static void RecibePedidos(Pedido...pedidos){
        for(Pedido p : pedidos){
            System.out.println(p);
        }

    }

}
