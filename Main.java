public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEM DATA BANK =====");
        Bank bank = new Bank();
        System.out.println("\n--- Menambahkan Nasabah ---");

        bank.addCustomer("Yoga", "Adiguna");
        bank.addCustomer("Budiono", "Siregar");
        bank.addCustomer("Cristiano", "Ronaldo");
        bank.addCustomer("Lionel", "Messi");
        bank.addCustomer("Rizky", "Pratama");

        System.out.println("Jumlah nasabah: "+ bank.getNumberOfCustomers());
        System.out.println("\n--- Pengujian Nasabah Tambahan ---");
        bank.addCustomer("Andi", "Saputra");
        Customer yoga = bank.getCustomer(0);
        System.out.println("\n--- Membuat Rekening Yoga ---");

        yoga.addAccount(new Account(1500000));
        yoga.addAccount(new Account(2500000));
        yoga.addAccount(new Account(3500000));

        System.out.println("Jumlah rekening Yoga: "+ yoga.getNumberOfAccounts());
        System.out.println("\n--- Transaksi Rekening Pertama ---");
        Account rekening = yoga.getAccount(0);
        System.out.println("Saldo awal: " + rekening.getBalance());
        if (rekening.deposit(500000)) {
            System.out.println("Setoran Rp500000 berhasil.");
        }

        System.out.println("Saldo setelah setor: "+ rekening.getBalance());

        if (rekening.withdraw(250000)) {
            System.out.println("Penarikan Rp250000 berhasil.");
        }

        System.out.println("Saldo setelah narik: "+ rekening.getBalance());

        System.out.println("\nMencoba menarik Rp5000000...");

        if (!rekening.withdraw(5000000)) {
            System.out.println("Penarikan gagal karena saldo tidak cukup.");
        }

        System.out.println("\n--- Data Seluruh Nasabah ---");

        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {

            Customer customer = bank.getCustomer(i);

            System.out.println("\nNasabah ke-" + (i + 1));
            System.out.println("Nama: "+ customer.getFirstName() + " "+ customer.getLastName());

            System.out.println("Jumlah rekening: "+ customer.getNumberOfAccounts());

            for (int j = 0;
                 j < customer.getNumberOfAccounts();
                 j++) {

                Account account = customer.getAccount(j);

                System.out.println("Rekening " + (j + 1) + " | Saldo: "+ account.getBalance());
            }
        }
    }
}