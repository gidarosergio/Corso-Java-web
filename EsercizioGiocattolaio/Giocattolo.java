<<<<<<< HEAD
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
        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public double getPrezzo() {
            return prezzo;
        }

        public String getEtaConsigliata() {
            return etaConsigliata;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPrezzo(double prezzo) {
            this.prezzo = prezzo;
        }

        public void setEtaConsigliata(String etaConsigliata) {
            this.etaConsigliata = etaConsigliata;
        }
    }
=======
public class Giocattolo {
    private int id;
    private String nome;
    private double prezzo;
    private String etaConsigliata;
    private int quantità;

    public Giocattolo(int id, String nome, double prezzo, String etaConsigliata, int quantità) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
        this.quantità = quantità;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getEtaConsigliata() {
        return etaConsigliata;
    }
    public int getQuantità() {
        return quantità;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }
}
>>>>>>> ab1f5b33a97918e8522eb4ad23971bf2ee5a2082
