public class Giocattolaio {
    public static class Giocattolo {
        private int id;
        private String nome;
        private double prezzo;
        private String etaConsigliata;

        public Giocattolo(int id, String nome, double prezzo, String etaConsigliata) {
            this.id = id;
            this.nome = nome;
            this.prezzo = prezzo;
            this.etaConsigliata = etaConsigliata;
        }
    }

    public static class Cliente {
        private int id;
        private String nome;
        private String indirizzoEmail;

        public Cliente(int id, String nome, String indirizzoEmail) {
            this.id = id;
            this.nome = nome;
            this.indirizzoEmail = indirizzoEmail;
        }
    }

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
    
    System.out.println(giocattolo1);
    
    
    
    }
}