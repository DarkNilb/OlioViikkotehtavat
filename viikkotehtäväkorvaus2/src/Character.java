import java.util.Scanner;

public class Character {
    int choise;
    String character = "Illidan";
    String weapon = "Warclaives";
    Scanner scan = new Scanner(System.in);
    public String character(){
		System.out.println("Valitse hahmosi: \n1) Kuningas\n2) Ritari\n3) Kuningatar\n4) Peikko");
		System.out.print("Valintasi: ");
        choise = scan.nextInt();
        if (choise == 1){
            character = "King";
        }
        if (choise == 2){
            character  = "Knight";
        }
        if (choise == 3){
            character = "Queen";
        }
        if (choise == 4){
            character = "Troll";
        }
        return character;
    }
    public String weapon(){
        System.out.println("Valitse aseesi: \n1) Veitsi\n2) Kirves\n3) Miekka\n4) Nuija");
		System.out.print("Valintasi: ");
        choise = scan.nextInt();
        if (choise == 1){
            weapon = "Knife";
        }
        if (choise == 2){
            weapon  = "Axe";
        }
        if (choise == 3){
            weapon = "Sword";
        }
        if (choise == 4){
            weapon = "Club";
        }
        return weapon;
    }
    public void fight(String c,String w){
        System.out.println(c + " tappelee aseella " + w);
    }
}