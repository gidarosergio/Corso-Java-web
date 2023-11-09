import java.util.ArrayList;
import java.util.List;

public abstract class RegistroVendite{
  protected static List<Vendita> vendite = new ArrayList<>();

    public void registraVendita(Vendita vendita) {
        vendite.add(vendita);
    }

    public List<Vendita> getVendite() {
        return vendite;
    }

    public abstract void visualizzaVendite();
}