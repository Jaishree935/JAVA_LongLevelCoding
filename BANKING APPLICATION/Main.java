import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    Bank bank=new Bank();
    Account current=null;
    while(true){
        System.out.println("\n1.Register 2.Login 3.Exit");
        int choice = s.nextInt();
        if(choice==1){
            System.out.print("Enter Name: ");
            String name=s.next();
            System.out.print("Set Password: ");
            String pass=s.next();
            System.out.print("Initial Deposit: ");
            double bal=s.nextDouble();
            bank.register(name,pass,bal);
        }
        else if(choice==2){
            System.out.print("Account No: ");
            int accno=s.nextInt();
            System.out.print("Password: ");
            String pass=s.next();
            current=bank.login(accno,pass);
            if(current!=null){
                while(true){
                    System.out.println("\n1.Deposit 2.Withdraw 3.Transfer 4.Statement 5.Balance 6.Logout");
                    int ch=s.nextInt();
                    if(ch==1){
                        System.out.print("Amount: ");
                        current.deposit(s.nextDouble());
                    }
                    else if(ch==2){
                        System.out.print("Amount: ");
                        current.withdraw(s.nextDouble());
                    }
                    else if(ch==3){
                        System.out.print("Receiver Acc No: ");
                        int r=s.nextInt();
                        System.out.print("Amount: ");
                        double amt=s.nextDouble();
                        bank.transfer(current,r,amt);
                    }
                    else if(ch==4){
                        System.out.println("Transactions:");
                        for(String t:current.transactions){
                            System.out.println(t);
                        }
                    }
                    else if (ch == 5) {
    current.checkBalance();
}
                    else break;
                }
            }
        }
        else{
            break;
        }
    }
}
}