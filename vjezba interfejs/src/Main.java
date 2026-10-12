import java.util.Scanner;

interface Craftable{
    void craft();
}

abstract class Item{
    private String naziv;
    private int kolicina;

    public Item(String naziv, int kolicina){
        this.naziv=naziv;
        this.kolicina=kolicina;
    }

    public String getNaziv(){
        return naziv;
    }
    public int getKolicina(){
        return kolicina;
    }

    public abstract void ispisInfo();
}

class PecenoDrvo extends Item implements Craftable{
    public PecenoDrvo(String naziv, int kolicina) {
        super(naziv, kolicina);
    }

    @Override
    public void ispisInfo() {
        System.out.println(getKolicina()+"x "+getNaziv());
    }
    public void craft(){
        System.out.println("Pravim predmet: "+getNaziv());
    }
}

public class Main {
    public static void main(String[] args) {
        PecenoDrvo p = new PecenoDrvo("Hrastova daska",5);
        p.craft();
        p.ispisInfo();
    }
}