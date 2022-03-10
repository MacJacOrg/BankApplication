public class Main {
    public static void main(String[] args) {

        Account user = new Account("Maciej", "Jach", 10000, 1);

        System.out.println(user.getBalance());
        user.withdrawal(15);
        System.out.println(user.getBalance());

    }


}
