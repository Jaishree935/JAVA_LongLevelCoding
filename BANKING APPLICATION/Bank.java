import java.util.*;

class Bank{
    Map<Integer,Account> accounts=new HashMap<>();
    int acccounter=1001;
    public Account register(String name,String password,double balance){
        Account acc=new Account(acccounter++,name,password,balance);
        accounts.put(acc.accno,acc);
        System.out.println("Account Created. Acc No: "+acc.accno);
        return acc;
    }
    public Account login(int accno,String password){
        Account acc=accounts.get(accno);
        if(acc!=null && acc.password.equals(password)){
            System.out.println("Login Success");
            return acc;
        }
        System.out.println("Invalid Credentials");
        return null;
    }
    public void transfer(Account sender,int receiveraccno,double amount){
        Account receiver=accounts.get(receiveraccno);
        if(receiver==null){
            System.out.println("Receiver not found");
            return;
        }
        if(sender.balance>=amount){
            sender.balance-=amount;
            receiver.balance+=amount;
            sender.transactions.add("Transferred: "+amount+" to "+receiveraccno);
            receiver.transactions.add("Received: "+amount+" from "+sender.accno);
            System.out.println("Transfer Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}