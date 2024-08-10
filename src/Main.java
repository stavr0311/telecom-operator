public class Main {

    public static void main(String[] args) {

        int initialAccount = 1500;
        int addend = 1100;

        int bonus = addend > 1000 ? addend / 100 : 0;

        int finalAcoount = initialAccount + addend + bonus;
        System.out.println("Итоговый счёт:" + finalAcoount);
        System.out.println("Бонус: " +bonus);

    }
}
