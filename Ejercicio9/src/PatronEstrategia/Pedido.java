package PatronEstrategia;

public class Pedido {
    /**

     * Clase Pedido. En concreto no sabe la forma de pago que el usuario a elegido (estrategia)
     * Usa la interface en comun para delegar info recogida del pago a el objeto Estrategia.
     * Puede ser usado para guardar pedidos en la base de datos
     *
     *
     */

        private int totalCost = 0;
        private boolean isClosed = false;

        public void processOrder(EstrategiaPago strategy) {
            strategy.collectPaymentDetails();
            // Here we could collect and store payment data from the strategy.
        }

        public void setTotalCost(int cost) {
            this.totalCost += cost;
        }

        public int getTotalCost() {
            return totalCost;
        }

        public boolean isClosed() {
            return isClosed;
        }

        public void setClosed() {
            isClosed = true;
        }

}
