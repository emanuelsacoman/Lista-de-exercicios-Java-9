import java.util.Scanner;

public class Processo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o valor de 's': ");
        String s = scanner.nextLine();

        String ss = processar(s);
        System.out.println(ss);
        
        scanner.close();
    }
    public static String processar(String s) {
        if (s == null) {
            return null;
        }
        return s.toUpperCase();
    }    
}
