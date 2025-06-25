
class Car {

    /**
     * Access modifier
     * 
     * Cara untuk menentukan akses untuk Atribut dan Method.
     */
    private String name;
    private String licensePlate;
    private String brand;
    private String model;
    private int year;
    private double pricePerDay;
    private boolean isAvailable;

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
        boolean isAvailable
    ) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
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

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "==> Detail Mobil <==" + 
        "\nNama: " + name + 
        "\nBrand: " + brand + 
        "\nModel: " + model + 
        "\nYear: " + year + 
        "\nHarga/Hari: Rp." + pricePerDay + 
        "\nTersedia: " + isAvailable;
    }

}
