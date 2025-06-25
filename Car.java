
// Ingin membuat mobil -> harus memiliki desain/blueprint
// Nama Mobil -> Atribut
// Jumlah roda -> Atribut
// Tipe mesin -> Atribut
// Bisa berjalan -> Method
// Bisa berbelok -> Method
// Bisa mundur -> Method

class Car {

    String name;
    String licensePlate;
    String brand;
    String model;
    int year;
    double pricePerDay;
    boolean isAvailable;

    public Car(String name, String licensePlate, String brand, String model, int year, double pricePerDay,
            boolean isAvailable) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "====> Detail mobil <====" + 
            "\nNama Mobil: " + name + 
            "\nPlat Nomer: " + licensePlate + 
            "\nBrand: " + brand + 
            "\nModel: " + model + 
            "\nTahun: " + year + 
            "\nHarga/Hari: " + pricePerDay + 
            "\nAvailable: " + isAvailable;
    }
}
