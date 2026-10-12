import java.util.Scanner;

interface MogucnostBorbe{
    void napadni();
}

abstract class NpcEntity{
    private String ime;

    public NpcEntity(String ime){
        this.ime=ime;
    }
    public String getIme(){
        return ime;
    }
    public abstract void interakcija();
}

class Ratnik extends NpcEntity implements MogucnostBorbe{
    public Ratnik(String ime){
        super(ime);
    }
    public void interakcija(){
        System.out.println(getIme() + " te pozdravlja!");

    }
    public void napadni(){
        System.out.println(getIme() + " zamahuje macem!");
    }

}

public class Main {
    public static void main(String[] args) {
        Ratnik r = new Ratnik("Ork");
        r.interakcija();
        r.napadni();
    }
}