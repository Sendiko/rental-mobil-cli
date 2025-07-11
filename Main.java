import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import car.Car;
import car.Luxury;
import car.SUV;
import car.Sedan;
import customer.Customer;
import transaction.Transaction;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         * Membuat sebuah ArrayList berisi objek car
         * yang telah dibuat.
         */
        List<Car> cars = new ArrayList<>();

        /**
         * Membuat sebuah ArrayList berisi objek transaction
         * yang telah dibuat.
         */
        List<Transaction> transactions = new ArrayList<>();

        /**
         * Membuat beberapa objek baru sebuah `Car`
         */
        Luxury mercySClass = new Luxury(
                "Mercedez-Benz S-Class",
                "A 1234 B",
                "Mercedez",
                "S-Class",
                2023,
                2500000,
                true,
                4);
        cars.add(mercySClass);

        Luxury bmw7Series = new Luxury(
                "BMW 7 Series",
                "C 4567 D",
                "BMW", "7 Series",
                2023,
                2200000,
                true,
                2);
        cars.add(bmw7Series);

        Sedan hondaCivic = new Sedan(
                "Honda Civic",
                "F 9101 HIJ",
                "Honda",
                "Civic",
                2021,
                750000.00,
                true,
                5);
        cars.add(hondaCivic);

        Sedan toyotaCamry = new Sedan(
                "Toyota Camry",
                "G 1122 KLM",
                "Toyota",
                "Camry",
                2020,
                800000.00, // Rp. 800,000 per day
                true,
                5);
        cars.add(toyotaCamry);

        Sedan nissanAltima = new Sedan(
                "Nissan Altima",
                "H 3344 NOP",
                "Nissan",
                "Altima",
                2022,
                780000.00, // Rp. 780,000 per day
                false, // This car is currently rented
                5);
        cars.add(nissanAltima);

        SUV toyotaFortuner = new SUV(
                "Toyota Fortuner",
                "I 5566 QRS",
                "Toyota",
                "Fortuner",
                2023,
                1200000.00, // Rp. 1,200,000 per day
                true,
                7);
        cars.add(toyotaFortuner);

        SUV mitsubishiPajero = new SUV(
                "Mitsubishi Pajero Sport",
                "J 7788 TUV",
                "Mitsubishi",
                "Pajero Sport",
                2021,
                1100000.00, // Rp. 1,100,000 per day
                true,
                7);
        cars.add(mitsubishiPajero);

        SUV hondaCrv = new SUV(
                "Honda CR-V",
                "K 9900 WXY",
                "Honda",
                "CR-V",
                2022,
                1000000.00, // Rp. 1,000,000 per day
                false,
                5);
        cars.add(hondaCrv);

        /* Membuat sebuah List untuk menyimpan data Customer */
        List<Customer> customers = new ArrayList<>();

        /**
         * Command-Line Interface
         */

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("====> Java Rental Car <====");
            System.out.println("Selamat datang di Java Rental Car, ada yang bisa kami bantu?");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Mobil yang tersedia");
            System.out.println("2. Buat transaksi Rental");
            System.out.println("3. Lihat daftar Transaksi");
            System.out.println("4. Servis Mobil");
            System.out.println("5. Tandai Mobil selsai servis");

            System.out.print("Pilihan anda: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.print("Sampai jumpa lagi!");
                    isRunning = false;
                    break;

                case 1:
                    for (Car car : cars) {
                        System.out.println(car.displayDetail());
                    }
                    break;
                case 2:
                    System.out.println("Masukan data pelanggan");

                    /* Meminta input nama dan menampungnya dalam variable */
                    System.out.print("Nama pelanggan: ");
                    String name = scanner.next();

                    /* Meminta input NIK dan menampungnya dalam variable */
                    System.out.print("NIK pelanggan: ");
                    String nik = scanner.next();

                    /* Meminta input Nomor HP dan menampungnya dalam variable */
                    System.out.print("Nomor HP pelanggan: ");
                    String phoneNumber = scanner.next();

                    /* Membuat objek `Customer` baru */
                    Customer customer = new Customer(name, nik, phoneNumber);
                    /* Menambahkan objek baru kedalam List Customer */
                    customers.add(customer);

                    for (Car car : cars) {
                        if (car.getIsAvailable() == true) {
                            System.out.println(car.displayDetail());
                        }
                        System.out.println();
                    }

                    System.out.print("Pilih (Plat Nomer) mobil untuk dirental: ");
                    scanner.nextLine();
                    String chosenLicensePlate = scanner.nextLine();
                    for (Car car : cars) {
                        if (car.getLicensePlate().equalsIgnoreCase(chosenLicensePlate)) {
                            System.out.print("Metode Pembayaran: ");
                            String paymentMethod = scanner.next();
                            car.rent();
                            Transaction transaction = new Transaction(customer, car, paymentMethod);
                            transactions.add(transaction);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (Transaction transaction : transactions) {
                        System.out.println(transaction.displayDetail());
                    }
                    break;

                case 4:
                    System.out.print("Cari mobil dengan Plat Nomer: ");
                    scanner.nextLine();
                    String chosenLicensePlate2 = scanner.nextLine();
                    for (Car car : cars) {
                        if (car.getLicensePlate().equalsIgnoreCase(chosenLicensePlate2)) {
                            System.out.println(car.isAvailable());
                            if (car.getIsAvailable()) {
                                car.maintenance();
                                System.out.println("Oke, mobil ini akan segera di servis.");
                            } else {
                                System.out.println("Mobil ini masih dirental.");
                            }
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Cari mobil dengan Plat Nomer: ");
                    scanner.nextLine();
                    String chosenLicensePlate3 = scanner.nextLine();
                    for (Car car : cars) {
                        if (car.getLicensePlate().equalsIgnoreCase(chosenLicensePlate3)) {
                            System.out.println(car.isAvailable());
                            if (!car.getIsAvailable()) {
                                car.doneMaintenance();
                                System.out.println("Mobil berhasil di servis.");
                            } else {
                                System.out.println("Mobil ini sedang tidak di servis.");
                            }
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Maaf pilihan anda invalid.");
                    break;
            }

        }
        scanner.close();
    }
}