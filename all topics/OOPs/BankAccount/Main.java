package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount c1=new BankAccount();
        c1.setBalance(100);
        c1.setEmail("s");
                                                                              c1.setAccountNo(1);
        c1.setName("c1");
        c1.setPhone(55);
        System.out.println(c1.getBalance());
        c1.withdraw(99);
        System.out.println(c1.getBalance());
        c1.withdraw(99);

        Custumer cp1=new Custumer();
        System.out.println(cp1.getName());
    }
}
