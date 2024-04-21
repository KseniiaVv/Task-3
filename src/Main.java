//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int account = 500; // текущий счет клиента
        int replenishment = 1200; // сумма пополнения счета


        int bonus; // бонус
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println((account + replenishment + bonus) + "итоговый счет");
        System.out.println((bonus) + "бонусные рубли");
    }
}