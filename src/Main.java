public class Main {
    public static void main(String[] args) {

        int amount = 90 + 1200;
        if (amount < 1090) {
            amount = 1090;
        }
        boolean isRegistered = true;

        int percent;
        if (isRegistered) {
            percent = 100;
        } else {
            percent = 1;
        }

        int bonus = amount / percent;

        System.out.println("Итоговый счёт: " + amount);

        System.out.println("Бонусные рубли: " + bonus);
    }

}