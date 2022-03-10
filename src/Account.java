public class Account {
    private String name;
    private String surname;
    private int balance;
    private int ID;

    public Account(String name, String surname, int balance, int ID) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.ID = ID;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int money){
        this.balance = balance-money;
    }

}
