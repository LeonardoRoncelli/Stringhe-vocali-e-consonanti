import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        char carattere;
        System.out.println("Inserisci un carattere");
        carattere=input.next().charAt(0);
        isConsonant(carattere);
        isVocal(carattere);
        System.out.println("Consonante:"+ isConsonant(carattere));
        System.out.println("Vocale: " +isVocal(carattere));
    }
    private static boolean isConsonant (char carattere){
        boolean consonante=false;
        if(carattere=='a'||carattere=='e'||carattere=='i'||carattere=='o'||carattere=='u'){
            consonante=false;
        } else if (carattere!='a'||carattere!='e'||carattere!='i'||carattere!='o'||carattere!='u') {
            consonante=true;
        }
        return consonante;
    }
    private static boolean isVocal (char carattere){
        boolean vocale=false;
        if(carattere=='a'||carattere=='e'||carattere=='i'||carattere=='o'||carattere=='u') {
            vocale = true;
        }
        return vocale;
    }
}