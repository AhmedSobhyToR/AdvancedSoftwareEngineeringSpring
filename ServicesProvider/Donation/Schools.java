package ServicesProvider.Donation;

import ServicesProvider.IProvider;

public class Schools extends IProvider {
    public Schools(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
    }
}
