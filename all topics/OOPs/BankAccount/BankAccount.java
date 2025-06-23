package BankAccount;

public class BankAccount {
    private int accountNo;
    private int balance;
    private String name;
    private String email;
    private int phone;

    public void deposit(int money){
        balance+=money;
    }

    public void withdraw(int money){
        if(balance-money>=0){
            balance-=money;
        }
       else System.out.println("garib");
    }


    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


}
