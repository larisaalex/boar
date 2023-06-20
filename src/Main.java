public class Main {
    public static void main(String[] args) {
        int start = 90;

        int replenishment = 1500;

        int bonus;
        if (replenishment > 1000){
            bonus = 100 * 1;
        } else {
            bonus = 1;
        }
        int check = replenishment + start;

        int general = check + bonus;

        System.out.println("Итоговый счёт: " + general);
    }
}
