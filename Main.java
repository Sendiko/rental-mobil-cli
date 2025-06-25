import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         * Membuat bebrapa objek baru sebuah `Car`
         */
        Car car1 = new Car(
            "McLaren Senna",
            "A 1234 B",
            "McLaren", 
            "Senna", 
            2019, 
            10000000, 
            true
        );
        Car car2 = new Car(
            "Mazda RX-7", 
            "D 4567 E", 
            "Mazda", 
            "RX-7", 
            2002, 
            5000000, 
            true
        );
        Car car3 = new Car(
            "Honda NSX", 
            "F 8910 G", 
            "Honda", 
            "NSX", 
            1990, 
            7500000, 
            true
        );

        /**
         * Membuat sebuah array berisi objek car
         * yang telah dibuat.
         */
        Car[] cars = {car1, car2, car3};

        /* Membuat sebuah List untuk menyimpan data Customer */
        List<Customer> customers = new ArrayList<>();

        /**
         * Command-Line Interface
         */
        System.out.println("====> Java Rental Car <====");
        System.out.println("Selamat datang di Java Rental Car, ada yang bisa kami bantu?");
        System.out.println("1. Lihat mobil yang tersedia");
        System.out.println("2. Saya ingin rental mobil");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < cars.length; i++) {
                    System.out.println(cars[i]);
                }
                break;
            case 2:
                System.out.println("Oke! Input data dulu yaaa");

                /* Meminta input nama dan menampungnya dalam variable */
                System.out.print("Nama anda: ");
                String name = scanner.next();

                /* Meminta input NIK dan menampungnya dalam variable */
                System.out.print("NIK anda: ");
                String nik = scanner.next();

                /* Meminta input Nomor HP dan menampungnya dalam variable */
                System.out.print("Nomor HP anda: ");
                String phoneNumber = scanner.next();

                /* Membuat objek `Customer` baru */
                Customer customer = new Customer(name, nik, phoneNumber);
                /* Menambahkan objek baru kedalam List Customer */
                customers.add(customer);
                for (int i = 0; i < customers.size(); i++) {
                    System.out.println(customers.get(i));
                }
                break;

            default:
                System.out.println("Maaf pilihan anda invalid.");
                break;
        }
    }
 }