import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;


enum BotState{
    LOOTING,
    FULL,
    ERROR
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inventar = new ArrayList<>();
        BotState stanje = BotState.LOOTING;
        HashMap<String, Integer> cijene = new HashMap<>();
        Scanner unos = new Scanner(System.in);
        cijene.put("Rune axe",12800);
        cijene.put("Lobster", 150);
        cijene.put("Coins", 1000);

        try {
            System.out.print("Unesi naziv predmeta: ");
            String naziv = unos.nextLine();
            if (cijene.containsKey(naziv)) {
                System.out.print("Predmet je poznat. Unesite količinu: ");
                int kolicina = unos.nextInt();
                for (int i = 0; i < kolicina; i++) {
                    inventar.add(naziv);
                }
                if (inventar.size() >= 28) {
                    stanje = BotState.FULL;
                } else {
                    stanje = BotState.LOOTING;
                }
            } else {
                System.out.println("Predmet se ne nalazi u bazi cijena!");
            }
        }
        catch (InputMismatchException e){
            System.out.println("GREŠKA! Niste unijeli ispravan broj za količinu!");
            stanje = BotState.ERROR;
        }
        System.out.println("\nTRENUTNO STANJE BOTA");
        switch (stanje) {
            case LOOTING -> System.out.println("Bot nastavlja sa sakupljanjem predmeta.");
            case FULL -> System.out.println("Inventar je pun (28/28)! Bot ide u banku.");
            case ERROR -> System.out.println("Došlo je do greške u radu bota.");
        }

        System.out.println("\nINVENTAR (" + inventar.size() + " predmeta)");
        for (String x : inventar) {
            System.out.println("- " + x);
        }
        unos.close();
    }
}