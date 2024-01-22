import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para o tamanho da sequência: ");
        String userInput = scan.nextLine();

        int convertedInput = Integer.parseInt(userInput);

        int[] resultado = fibonacci(convertedInput);
        for (int i : resultado) {
            System.out.print(i + " ");
        }

        scan.close();
    }

    public static int[] fibonacci(int n) {
        int[] fibSequence = new int[n];
        fibSequence[0] = 0;
        fibSequence[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }

        return fibSequence;
    }
}
