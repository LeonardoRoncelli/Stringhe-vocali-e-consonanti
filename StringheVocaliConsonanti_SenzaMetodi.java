import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String parola;
        String vocali="";
        String consonanti="";
        System.out.println("Inserisci una parola");
        parola = input.nextLine();
        for (int i = 0; i < parola.length(); i++) {
            if (parola.charAt(i) == 'a' || parola.charAt(i) == 'e' || parola.charAt(i) == 'i' || parola.charAt(i) == 'o' || parola.charAt(i) == 'u') {
                vocali+=parola.charAt(i);
            }
            else if (parola.charAt(i)!='a' || parola.charAt(i) == 'e' || parola.charAt(i) == 'i' || parola.charAt(i) == 'o' || parola.charAt(i) == 'u'){
                consonanti+=parola.charAt(i);
            }
        }
        System.out.println("Le vocali sono: "+vocali);
        System.out.println("Le consonanti sono: "+consonanti);
    }
}