import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Numero num = new Numero();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        String userInput = scan.nextLine();

        long convertedInput = Long.parseLong(userInput);

        num.setNum(convertedInput);

        num.whichNumber(num.getNum());

        scan.close();
    }
}
