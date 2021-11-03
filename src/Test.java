public class Test {

    public static void main(String[] args){
        Account a = new Account(0.0);
        Account a2 = new Account(0.0);
        Customer c1 = new Customer("Edgar", "Campuzano");
        Customer c2 = new Customer("Javier", "Hernandez");

        //Customer 1
        c1.setAccount(a);
        System.out.println("Cuenta: " + c1.getAccount());
        System.out.println("Nombre completo: " + c1.getFirstName() + " " + c1.getLastName());
        a.deposit(1500);
        a.withdraw(1200);
        System.out.println("Balance: "+ a.getBalance());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        //Customer 2
        c2.setAccount(a2);
        System.out.println("Cuenta: " + c2.getAccount());
        System.out.println("Nombre completo: " + c2.getFirstName() + " " + c2.getLastName());
        a2.deposit(1500);
        a2.withdraw(1700);
        System.out.println("Balance: "+ a2.getBalance());

    }
}
