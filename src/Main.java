public class Main {
    public static void main(String[] args) {

        int amount = 100 + 1500;
        boolean isRegistered = true;

        int percent;
        if (isRegistered) {
            percent = 100;
        } else {
            percent = 1000;
        }

        int bonus = amount / percent * 1;

        System.out.println("Итоговый счёт: " + amount);

        System.out.println("Бонусные рубли: " + bonus);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}