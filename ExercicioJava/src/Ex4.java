import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber sua tabuada: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int calculo = i * num;
            System.out.println(i + "x" + num + "=" + calculo);
        }
    }
}
