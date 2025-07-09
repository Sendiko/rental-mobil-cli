package transaction;

import car.Car;
import customer.Customer;

public class Transaction {
    
    private Customer customer;
    private Car car;
    private String paymentMethod;

    public Transaction(
        Customer customer,
        Car car,
        String paymentMethod
    ) {
        this.customer = customer;
        this.car = car;
        this.paymentMethod = paymentMethod;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public String getCustomerPhoneNumber() {
        return customer.getPhoneNumber();
    }

    public String getCarName() {
        return car.getName();
    }

    public String getLicensePlate() {
        return car.getLicensePlate();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

}
