public class Customer extends Account{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        super(0);
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }
}
