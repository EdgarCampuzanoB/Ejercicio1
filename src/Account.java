public class Account {
    double balance;

    public Account( double initBalance ){
        this.balance = initBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit( double amt ){
        balance = balance + amt;
    }

    public void withdraw(double amt ){
        if( balance > amt ){
            balance = balance - amt;
        }else{
            System.out.println("insufficient balance");
        }
    }
}
