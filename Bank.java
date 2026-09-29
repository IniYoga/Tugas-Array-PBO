public class Bank {
    private Customer[] customerList;
    private int customerCount;

    public Bank() {
        customerList = new Customer[5];
        customerCount = 0;
    }

    public void addCustomer(String firstName, String lastName) {
        if (customerCount == customerList.length) {
            System.out.println("Jumlah nasabah sudah mencapai batas.");
            return;
        }

        Customer customer = new Customer(firstName, lastName);
        customerList[customerCount] = customer;
        customerCount++;
    }

    public int getNumberOfCustomers() {
        return customerCount;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= customerCount) {
            System.out.println("Data nasabah tidak ditemukan.");
            return null;
        }

        return customerList[index];
    }
}