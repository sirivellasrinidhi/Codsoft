public class Main {
    public static void main(String[] args) {
        ATM_Interface account = new ATM_Interface(1000.00);
        ATM atm = new ATM(account);
        atm.showMenu();
    }
}