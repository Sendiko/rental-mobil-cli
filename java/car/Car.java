package car;

public class Car implements Rentable {

    /**
     * Access modifier
     * 
     * Cara untuk menentukan akses untuk Atribut dan Method.
     */
    protected String name;
    protected String licensePlate;
    protected String brand;
    protected String model;
    protected int year;
    protected double pricePerDay;
    protected boolean isAvailable;
    protected int seat;

    /**
     * Constructor untuk membuat object `Car`
     * @param name
     * @param licensePlate
     * @param brand
     * @param model
     * @param year
     * @param pricePerDay
     * @param isAvailable
     */

    public Car(
        String name,
        String licensePlate,
        String brand,
        String model,
        int year,
        double pricePerDay,
        boolean isAvailable,
        int seat
    ) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
        this.seat = seat;
    }

    /**
     * 
     * Getter dan Setter
     * 
     * Fungsi untuk membantu mengakses Atribut.
     * 
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String displayDetail() {
        return "==> Detail Mobil <==" + 
        "\nNama: " + name + 
        "\nBrand: " + brand + 
        "\nModel: " + model + 
        "\nPlat Nomer: " + licensePlate + 
        "\nYear: " + year + 
        "\nHarga/Hari: Rp." + pricePerDay + 
        "\nTersedia: " + isAvailable +
        "\nJumlah Kursi: " + seat;
    }

    /**
     * Implementasi method 
     * Interface Rentable
     */

    @Override
    public void rent() {
        this.isAvailable = false;
    }

    @Override
    public void returnVehicle() {
        this.isAvailable = true;
    }

    @Override
    public String isAvailable() {
        if (isAvailable) {
            return "Mobil ini tersedia.";
        } else {
            return "Mobil ini tidak tersedia";
        }
    }

    @Override
    public void maintenance() {
        this.isAvailable = false;
    }

    @Override
    public void doneMaintenance() {
        this.isAvailable = true;
    }

}
