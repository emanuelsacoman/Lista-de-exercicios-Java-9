import java.util.Scanner;

public class DuasPalavras {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int n=0; n<n+1; n++){ //for apenas para fazer infinitamente by Emanuel
            System.out.println("Digite a palavra1: ");
            String p1 = scanner.nextLine();
            System.out.println("Digite a palavra2: ");
            String p2 = scanner.nextLine();
    
            if(p1.equals(p2)){
                System.out.println("As Strings são iguais");
            }else{
                System.out.println("As Strings são diferentes");
            }
            if(p1.equalsIgnoreCase(p2)){
                System.out.println("As Strings são iguais");
            }else{
                System.out.println("As Strings são diferentes");
            }
        }
    }
}