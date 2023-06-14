public class Main {
    public static void main(String[] args) {

        int amount = 1200;
        if (amount < 1000) {
            amount = 0;
        }

        int balance = 90;

        boolean isRegistered = true;

        int percent;
        if (isRegistered) {
            percent = 100;
        } else {
            percent = 1;
        }

        int bonus = amount / percent;

        System.out.println("Итоговый счёт: " + amount);

        System.out.println("Баланс счета: " + balance);

        System.out.println("Бонусные рубли: " + bonus);
    }

}