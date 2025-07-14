package car;

public class SUV extends Car {

    public SUV(
            String name,
            String licensePlate,
            String brand,
            String model,
            int year,
            double pricePerday,
            boolean isAvailable,
            int seat) {
        super(
                name,
                licensePlate,
                brand,
                model,
                year,
                pricePerday,
                isAvailable,
                seat);
    }

    @Override
    public String displayDetail() {
        return "==> Detail Mobil <==" +
                "\nTipe Mobil: SUV" +
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
