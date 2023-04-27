public class Exercicio1 {
    public static void main(String args[]) {
            verificar("Hoje tem aula de POOI");
            verificar("verdade");
            verificar("aeiou");
        }
        public static void verificar(String frase) {
            int tam = frase.length();
            int qtde = 0;
            System.out.println("Total de caracteres da string: " + frase + " = " +
            tam);
            for (int i = 0; i < tam; i++) {
                if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A'
                || frase.charAt(i) == 'e' || frase.charAt(i) == 'E'
                || frase.charAt(i) == 'i' || frase.charAt(i) == 'I'
                || frase.charAt(i) == 'o' || frase.charAt(i) == 'O'
                || frase.charAt(i) == 'u' || frase.charAt(i) == 'U')
                qtde++;
            }
            System.out.println("Quantidade de vogais = " + qtde);
    }
}