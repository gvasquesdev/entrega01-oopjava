public class Numero {
    private long num;

    public Numero() {
        this.num = 0;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public long getNum() {
        return this.num;
    }

    public void whichNumber(long num) {
        if (num % 2 == 0) {
            System.out.print(num + " é par e ");
        } else {
            System.out.print(num + " é ímpar e ");
        }

        if (num > 0) {
            System.out.println("positivo.");
        } else if (num < 0) {
            System.out.println("negativo.");
        } else {
            System.out.println("zero.");
        }
    }
}
