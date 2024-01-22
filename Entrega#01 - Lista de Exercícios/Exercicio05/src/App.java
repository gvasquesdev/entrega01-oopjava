import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for (String elemento : array1) {
            set1.add(elemento);
        }

        for (String elemento : array2) {
            set2.add(elemento);
        }

        System.out.println("Elementos comuns:");

        for (String elemento : set1) {
            if (set2.contains(elemento)) {
                System.out.println(elemento);
            }
        }
    }
}
