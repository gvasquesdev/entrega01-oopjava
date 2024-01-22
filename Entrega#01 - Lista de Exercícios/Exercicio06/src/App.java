public class App {
    public static void main(String[] args) throws Exception {
        CalendarioFeriados calendario = new CalendarioFeriados();

        System.out.println("Lista de Feriados");
        calendario.imprimirListaFeriados();

        String dataInserida = "29-03-2024";
        String mensagem = calendario.verificarFeriado(dataInserida);
        System.out.println();
        System.out.println(mensagem);
    }
}
