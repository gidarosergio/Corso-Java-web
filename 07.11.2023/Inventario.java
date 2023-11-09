import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Giocattolo> giocattoli = new ArrayList<>();
    
    public void aggiungiGiocattolo(Giocattolo giocattolo) {
        giocattoli.add(giocattolo);
    }

    public void rimuoviGiocattolo(Giocattolo giocattolo, int quantita) {
        if (giocattoli.contains(giocattolo)) {
            int quantitaAttuale = getQuantità(giocattolo);
            if (quantita <= quantitaAttuale) {
                for (int i = 0; i < giocattoli.size(); i++) {
                    Giocattolo g = giocattoli.get(i);
                    if (g.getId() == giocattolo.getId()) {
                        if (quantita <= g.getQuantità()) {
                            g.setQuantità(quantita);
                            break;
                        } else {
                            giocattoli.remove(i);
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Quantità non valida. L'inventario contiene solo " + quantitaAttuale + " di questo giocattolo.");
            }
        } else {
            System.out.println("Giocattolo non trovato nell'inventario.");
        }
    }

    public int getQuantità(Giocattolo giocattolo) {
        int quantitaDisponibile = 0;
        for (Giocattolo g : giocattoli) {
            if (g.getId() == giocattolo.getId()) {
                quantitaDisponibile += g.getQuantità();
            }
        }
        return quantitaDisponibile;
    }

    public List<Giocattolo> getGiocattoli() {
        return giocattoli;
    }
}