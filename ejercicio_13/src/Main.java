public class Main {
    public static void main(String[] args) {
        Robot robotConRuedaDeCaucho = new Robot("KT-2020-P", 10, new RuedaDeCaucho());
        Robot robotConOruga = new Robot("KT-2020-P", 10, new Oruga());

        System.out.println(robotConRuedaDeCaucho);
        System.out.println();
        System.out.println(robotConOruga);
    }
}