package car;

public class Luxury extends Car {

    public Luxury(
        String name,
        String licensePlate,
        String brand,
        String model,
        int year,
        double pricePerDay,
        boolean isAvailable,
        int seat
    ) {
        super(
            name, 
            licensePlate,
            brand, 
            model, 
            year, 
            pricePerDay, 
            isAvailable, 
            seat
        );
    }

    @Override
    public String displayDetail() {
                return "==> Detail Mobil <==" +
                "\nTipe Mobil: Luxury" +
                "\nNama: " + name +
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nPlat Nomer: " + licensePlate + 
                "\nYear: " + year +
                "\nHarga/Hari: Rp." + pricePerDay +
                "\nTersedia: " + isAvailable +
                "\nJumlah Kursi: " + seat;
    }

}
