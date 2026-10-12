import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

enum BotState{
    MINING,
    BANKING,
    STOPPED
}


public class Main {
    public static void main(String[] args) {
        int kolicinaRude=32;
        BotState stanje=BotState.MINING;
        if (kolicinaRude>=32) stanje=BotState.BANKING;
        else stanje=BotState.MINING;
        switch (stanje){
            case MINING -> System.out.println("Bot kopa rudu!");
            case BANKING -> System.out.println("Inventar pun! Bot ide u banku!");
            case STOPPED -> System.out.println("Bot je zaustavljen");
        }
    }
} 