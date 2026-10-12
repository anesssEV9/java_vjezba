import java.util.ArrayList;
import java.util.Scanner;

class Predmet{
    private String naziv;
    private int kolicina;

    public Predmet(String naziv, int kolicna){
        this.naziv=naziv;
        this.kolicina=kolicna;
    }

    public String getNaziv(){ return naziv; }
    public int getKolicina(){ return kolicina; }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Predmet> inventar = new ArrayList<>();
        Scanner unos = new Scanner(System.in);
        int k,br=0;
        String n;
        for (int i=0;i<3;i++){
            System.out.println("Unesi naziv predmeta: ");
            n=unos.nextLine();
            System.out.println("Unesi kolicinu: ");
            k=unos.nextInt();

            inventar.add(new Predmet(n,k));
            unos.nextLine();
        }
        for (Predmet x:inventar){
            System.out.println("Naziv: "+x.getNaziv()+": "+x.getKolicina()+"x");
            br=br+x.getKolicina();
        }
        System.out.println("Ukupan broj itema: "+br);
        unos.close();
    }
} 