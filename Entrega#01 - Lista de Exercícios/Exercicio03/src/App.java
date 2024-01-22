import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para a tabela de multiplicação: ");
        int numero = scan.nextInt();

        System.out.println("Tabela de multiplicação por " + numero);

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scan.close();
    }
}
