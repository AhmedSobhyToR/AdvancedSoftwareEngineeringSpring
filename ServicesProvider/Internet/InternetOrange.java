package ServicesProvider.Internet;

import ServicesProvider.IProvider;

public class InternetOrange extends IProvider {
    public InternetOrange(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
    }
}
