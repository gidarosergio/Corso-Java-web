public class Vendita {
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

    public Cliente getCliente() {
        return cliente;
    }

    public Giocattolo getGiocattolo() {
        return giocattolo;
    }

    public String getDataAcquisto() {
        return dataAcquisto;
    }

    public int getQuantità() {
        return quantita;
    }
} "questo è il main"
