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
