package example.inflearn_starter.chap1.lect4;

public class Lect4Main {
    public static void main(String[] args) {
        JavaMoney m1 = new JavaMoney(2_000L);
        JavaMoney m2 = new JavaMoney(1_000L);

        JavaMoney m3 = m1.plus(m2);
        System.out.println(m3);

        if (m1.compareTo(m2) > 0) {
            System.out.println("m1이 m2보다 크다.");
        }
    }
}
