import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lootList = new ArrayList<>();
        Scanner unos = new Scanner(System.in);
        lootList.add("Yew Log");
        lootList.add("Raw Lobster");
        lootList.add("Clue scroll");
        System.out.println("Unesi item: ");
        String item = unos.nextLine();
        lootList.add(item);
        lootList.remove(0);
        for (String x:lootList){
            System.out.println(x);
        }
        System.out.println("\n"+lootList.size());
    }
} 