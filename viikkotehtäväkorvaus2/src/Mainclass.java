import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args) {
        String character = "Illidan";
        String weapon = "warclaives of azzinoth";
        int choise;
        Scanner scan = new Scanner(System.in);
        Character c = new Character();
        int i = 1;
        while (i == 1){
            System.out.println("*** TAISTELUSIMULAATTORI ***\n1) Luo hahmo\n2) Taistele hahmolla\n0) Lopeta");
			System.out.print("Valintasi: ");
            choise = scan.nextInt();
            if (choise == 1){
                character = c.character();
                weapon = c.weapon();
            }
            if (choise == 2){
                c.fight(character, weapon);
            }
            if (choise == 0){
                i = 0;
                break;
            }
        }
    }
}
