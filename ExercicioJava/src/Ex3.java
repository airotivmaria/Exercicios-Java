import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("""
            Menu
            [1] Área do quadrado
            [2] Àrea do círculo
            """);
    int escolha = scanner.nextInt();

    if (escolha == 1){
        System.out.println("Lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A área do quadrado é " + areaQuadrado);
    } else if (escolha == 2) {
        System.out.println("Raio do círculo: ");
        double raioCirculo = scanner.nextDouble();
        double areaCirculo = 3.14 * (raioCirculo * raioCirculo);
        System.out.println("A área do círculo é " + areaCirculo);
    } else {
        System.out.println("Opção inválida.");
    }
    }
}
