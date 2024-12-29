public class Main {
    public static void main(String[] args) {
        Account account = new Account("Jan Kowalski", 500, "123456789");

        try {
            account.transfer(600);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Wyjątek: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił inny wyjątek: " + e.toString());
        } finally {
            System.out.println("Aktualny stan konta: " + account.getBalance());
        }
    }
}