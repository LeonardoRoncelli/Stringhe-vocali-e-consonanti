import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String parola;
        System.out.println("Inserisci un carattere");
        parola=input.nextLine();
        isConsonant(parola);
        isVocal(parola);
        System.out.println("Consonanti: "+ isConsonant(parola));
        System.out.println("Vocali: " + isVocal(parola));
    }
    private static String isConsonant (String parola){
        String consonanti="";
        for (int i=0;i<parola.length();i++) {
            if (parola.charAt(i) == 'a' || parola.charAt(i) == 'e' || parola.charAt(i) == 'i' || parola.charAt(i) == 'o' || parola.charAt(i) == 'u') {
                consonanti+=parola.charAt(i);
        }
        return consonanti;
    }
    private static String isVocal (String parola){
            String vocale = "";
            for (int i = 0; i < parola.length(); i++) {
                if (parola.charAt(i) == 'a' || parola.charAt(i) == 'e' || parola.charAt(i) == 'i' || parola.charAt(i) == 'o' || parola.charAt(i) == 'u') {
                    vocale+=parola.charAt(i);
                }
            }
            return vocale;
        }
    }
}