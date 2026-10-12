import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> resursi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        resursi.add("Zlato");
        resursi.add("Srebro");
        resursi.add("Bakar");

        try {
            System.out.println("Unesi broj resursa(0,1,2): ");
            int n = scanner.nextInt();
            System.out.println(resursi.get(n));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("GRESKA: Uneseni indeks ne postoji!");
        }
        catch (InputMismatchException e){
            System.out.println("GRESKA: Morate unijeti cijeli broj!");
        }
    }
}