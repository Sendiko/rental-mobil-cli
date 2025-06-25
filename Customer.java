public class Customer {

    /**
     * Access modifier
     * 
     * Cara untuk menentukan akses untuk Atribut dan Method.
     */
    private String name;
    private String nik;
    private String phoneNumber;

    /**
     * Constructor untuk membuat object `Customer`
     * @param name
     * @param nik
     * @param phoneNumber
     */

    public Customer(String name, String nik, String phoneNumber) {
        this.name = name;
        this.nik = nik;
        this.phoneNumber = phoneNumber;
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

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "==> Data Pelanggan <==" + 
        "\nNama: " + name +
        "\nNIK: " + nik + 
        "\nNomor HP: " + phoneNumber;
    }

}
