import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> statistika = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String n;
        int k;

        statistika.put("Oak log", 50);
        statistika.put("Willow log", 120);

        System.out.println("Unesi naziv: ");
        n=scanner.nextLine();
        System.out.println("Unesi kolicinu: ");
        k=scanner.nextInt();

        statistika.put(n,k);

        scanner.nextLine();

        System.out.println("Unesi naziv: ");
        n=scanner.nextLine();

        if(statistika.containsKey(n)) System.out.println("Sakupljeno je "+statistika.get(n)+" komada");
        else System.out.println("Taj resurs ne postoji!");



        
    }
} 