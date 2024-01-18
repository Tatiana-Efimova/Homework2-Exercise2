public class Main {

    public static void main(String[] args) {
        int balance = 455; // рублей
        int bonus = 100; // рублей
        int balanceRefill = 1155; // рублей
        int totalBalance; // бонусных рублей
        if (balanceRefill > 1000) {
            totalBalance = balanceRefill / bonus + balance + balanceRefill;
        } else {
            totalBalance = balanceRefill + balance;
        }
        System.out.println("Рублей на счёте с учётом бонусов:" + totalBalance);
    }
}
