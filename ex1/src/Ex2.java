import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        int n2 = scanner.nextInt();
    
        if(n1 == n2){
            System.out.println("Os números são iguais.");
        } else if (n1 > n2) {
            System.out.println("O número " + n1 + " é maior que " + n2);
        } else if (n2 > n1) {
            System.out.println("O número " + n2 + " é maior que " + n1);
        } else if (n1 != n2) {
            System.out.println("Os números são diferentes.");
        } else {
            System.out.println("Números inválidos.");
        }
    }

};
