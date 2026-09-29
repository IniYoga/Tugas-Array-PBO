public class Customer {
    private String firstName;
    private String lastName;

    private Account[] accounts;
    private int accountCount;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new Account[5];
        accountCount = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfAccounts() {
        return accountCount;
    }

    public void addAccount(Account account) {
        if (accountCount == accounts.length) {
            System.out.println("Rekening sudah mencapai batas maksimal.");
            return;
        }

        accounts[accountCount] = account;
        accountCount++;
    }

    public Account getAccount(int index) {
        if (index < 0 || index >= accountCount) {
            System.out.println("Nomor rekening tidak ditemukan.");
            return null;
        }

        return accounts[index];
    }
}