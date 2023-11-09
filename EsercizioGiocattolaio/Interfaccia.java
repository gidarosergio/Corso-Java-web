import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Interfaccia {
    static List<Vendita> vendite = new ArrayList<>();
    static Inventario inventario = new Inventario();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Benvenuto nel negozio di giocattoli!");
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Acquista Giocattolo");
            System.out.println("2. Visualizza Vendite");
            System.out.println("0. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la newline

            switch (scelta) {
                case 1:
                    acquistaGiocattolo();
                    break;
                case 2:
                    visualizzaVendite();
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }

    private static void acquistaGiocattolo() {
        System.out.print("Inserisci l'ID del Giocattolo che vuoi acquistare: ");
        int idGiocattolo = scanner.nextInt();
        Giocattolo giocattolo = trovaGiocattolo(idGiocattolo);

        if (giocattolo != null) {
            System.out.print("Inserisci la quantità desiderata: ");
            int quantita = scanner.nextInt();
            scanner.nextLine(); // Consuma la newline

            if (quantita > 0 && quantita <= inventario.getQuantità(giocattolo)) {
                Cliente cliente = creaCliente();
                String dataAcquisto = getCurrentDate();

                Vendita vendita = new Vendita(cliente, giocattolo, dataAcquisto, quantita);
                vendite.add(vendita);

                inventario.rimuoviGiocattolo(giocattolo, quantita);
                System.out.println("Acquisto effettuato con successo.");
            } else {
                System.out.println("Quantità non valida o non disponibile in inventario.");
            }
        } else {
            System.out.println("Giocattolo non trovato.");
        }
    }

    private static Giocattolo trovaGiocattolo(int id) {
        for (Giocattolo giocattolo : inventario.getGiocattoli()) {
            if (giocattolo.getId() == id) {
                return giocattolo;
            }
        }
        return null;
    }

    private static Cliente creaCliente() {
        System.out.print("Inserisci il nome del Cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Inserisci l'indirizzo email del Cliente: ");
        String emailCliente = scanner.nextLine();
        int id = 1; // Puoi implementare la logica per generare un ID univoco
        return new Cliente(id, nomeCliente, emailCliente);
    }

    private static void visualizzaVendite() {
        if (vendite.isEmpty()) {
            System.out.println("Nessuna vendita registrata.");
        } else {
            System.out.println("Vendite registrate:");
            for (Vendita vendita : vendite) {
                System.out.println("Cliente: " + vendita.getCliente().getNome() +
                        ", Giocattolo: " + vendita.getGiocattolo().getNome() +
                        ", Data Acquisto: " + vendita.getDataAcquisto() +
                        ", Quantità: " + vendita.getQuantità());
            }
        }
    }

    private static String getCurrentDate() {
        // Simulazione: restituisce una data fittizia
        return "2023-11-07";
    }
}











