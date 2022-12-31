package ServicesProvider.Donation;

import ServicesProvider.IProvider;

public class CancerHospital extends IProvider {
    public CancerHospital(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
    }
}