package lab_exercise.objects_labsheet;

public class BankAccount {
    private Person name;
    private int accountNumber;
    private double balance;
    private static int nextAccountNumbert;
    public BankAccount(Person name) {
        this.name = name;
        balance=0.0;
        this.accountNumber=nextAccountNumbert;
        nextAccountNumbert++;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }

    public String getName(){
        return name.getName();
    }

    public void inPut(double number){
        this.balance=this.balance+number;
    }

    public void outPut(double number){
        this.balance=this.balance-number;
    }
    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + "]";
    }
    public void transferFunds(double amount,BankAccount bankAccount){
        this.balance=this.balance-amount;
        bankAccount.inPut(amount);
    }






    


    
    
    
    
}
