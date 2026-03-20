import java.util.*;

class Account {
    int accno;
    String name;
    String password;
    double balance;
    List<String> transactions=new ArrayList<>();
    Account(int accno,String name,String password,double balance){
        this.accno=accno;
        this.name=name;
        this.password=password;
        this.balance=balance;
    }    
    void deposit(double amount){
        balance+=amount;
        transactions.add("Deposited: "+amount);
    }
    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            transactions.add("Withdrawn: "+amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void checkBalance() {
    System.out.println(" Current Balance: " + balance);
}
}
