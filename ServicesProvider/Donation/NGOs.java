package ServicesProvider.Donation;

import ServicesProvider.IProvider;

public class NGOs extends IProvider {

    public NGOs(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
    }
}
