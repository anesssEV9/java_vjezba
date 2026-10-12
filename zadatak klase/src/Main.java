import java.util.Scanner;

interface Dropable {
    void drop();
}

abstract class Resurs implements Dropable {
    private String naziv;
    private int kolicina;
    private int maxKolicina;

    public Resurs(String naziv, int kolicina, int maxKolicina) {
        this.naziv = naziv;
        this.maxKolicina = maxKolicina;
        this.kolicina = Math.min(kolicina, maxKolicina);
    }

    public String getNaziv() { return naziv; }
    public int getKolicina() { return kolicina; }
    public int getMaxKolicina() { return maxKolicina; }

    public abstract void ponasanje();
}

class Ruda extends Resurs {
    public Ruda(String naziv, int kolicina) {
        super(naziv, kolicina, 28);
    }

    @Override
    public void ponasanje() {
        System.out.println("Ruda " + getNaziv() + " se topi u peći za kovanje!");
    }

    @Override
    public void drop() {
        System.out.println("Ispuštam " + getKolicina() + "x " + getNaziv() + " na pod!");
    }
}

class Drvo extends Resurs {
    public Drvo(String naziv, int kolicina) {
        super(naziv, kolicina, 28);
    }

    @Override
    public void ponasanje() {
        System.out.println("Drvo " + getNaziv() + " se koristi za loženje vatre!");
    }

    @Override
    public void drop() {
        System.out.println("Ispuštam " + getKolicina() + "x " + getNaziv() + " na pod!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Koliko tipova resursa želite unijeti (1-5): ");
            n = scanner.nextInt();
            if (n < 1 || n > 5) System.out.println("Neispravan opseg!");
        } while (n < 1 || n > 5);

        Resurs[] inv = new Resurs[n];

        for (int i = 0; i < inv.length; i++) {
            System.out.println("\n--- Slot " + (i + 1) + " ---");

            int izb;
            do {
                System.out.println("Izaberite tip: 1-Drvo, 2-Ruda");
                izb = scanner.nextInt();
                if (izb < 1 || izb > 2) System.out.println("Pogrešan izbor!");
            } while (izb < 1 || izb > 2);

            scanner.nextLine();
            System.out.print("Unesite tačan naziv resursa (npr. Hrast/Željezo): ");
            String naziv = scanner.nextLine();

            System.out.print("Unesite količinu: ");
            int kolicina = scanner.nextInt();

            if (izb == 1) {
                inv[i] = new Drvo(naziv, kolicina);
            } else {
                inv[i] = new Ruda(naziv, kolicina);
            }
        }

        System.out.println("\n=== INVENTAR ISPIS ===");
        for (Resurs x : inv) {
            System.out.println("\n[Predmet]: " + x.getNaziv() + " | Količina: " + x.getKolicina() + "/" + x.getMaxKolicina());
            x.ponasanje();
            x.drop();
        }

        scanner.close();
    }
}