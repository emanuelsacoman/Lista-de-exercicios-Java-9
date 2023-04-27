import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        if (palavra.length() < 8) {
            System.out.println("A palavra digitada deve ter pelo menos 8 caracteres.");
        } else {
            String nPalavra = fnPalavra(palavra);
            System.out.println("Nova palavra: " + nPalavra);
        }
        
        scanner.close();
    }
    
    public static String fnPalavra(String palavra) {
        String nPalavra = palavra.substring(0, 2) + palavra.substring(palavra.length() - 2);
        return nPalavra;
    }
}