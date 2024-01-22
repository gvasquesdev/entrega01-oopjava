import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um tamanho para a pirâmide: ");
        int userInput = scan.nextInt();

        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

                if (i > 9) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scan.close();
    }
}
