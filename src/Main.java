public class Main {
    public static void main(String[] args) {
        int start = 90;
        int replenishment = 1200;
        int bonuscoefficient = 100;
        int threshold = 1000;
        if (replenishment > threshold) {
            int general = replenishment / bonuscoefficient + replenishment + start;
            System.out.println("Итоговый счёт: " + general + "рублей");
        } else {
            int general = replenishment + start;;
            System.out.println("Итоговый счёт: " + general + "рублей");
        }
    }
}
