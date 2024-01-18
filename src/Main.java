public class Main {

    public static void main(String[] args) {
        int balance = 455; // рублей
        int bonus = 100; // рублей
        int balanceRefill = 1155; // рублей
        int x; // бонусных рублей
        if (balanceRefill > 1000) {
            x = balanceRefill / bonus + balance + balanceRefill;
        } else {
            x = balanceRefill + balance;
        }
        System.out.println("Рублей на счёте с учётом бонусов:" + x);
    }
}
