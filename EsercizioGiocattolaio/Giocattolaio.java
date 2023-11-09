public class Giocattolaio {
   public static class Vendita {
        private Cliente cliente;
        private Giocattolo giocattolo;
        private String dataAcquisto;
        private int quantita;

        public Vendita(Cliente cliente, Giocattolo giocattolo, String dataAcquisto, int quantita) {
            this.cliente = cliente;
            this.giocattolo = giocattolo;
            this.dataAcquisto = dataAcquisto;
            this.quantita = quantita;
        }
    }

    public static void main(String[] args) {
        // Esempio di utilizzo:
        Giocattolo giocattolo1 = new Giocattolo(1, "Puzzle", 10.99, "3+");
        Cliente cliente1 = new Cliente(1, "Mario Rossi", "mario@email.com");
        Vendita vendita1 = new Vendita(cliente1, giocattolo1, "2023-11-07", 2);
    

    
    
    }
}