import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        if (n1 > 0){
            System.out.println("O número " + n1 + " é um número positivo.");
        } else {
            System.out.println("O número " + n1 + " é um número negativo.");
        }

    }
}
