package ServicesProvider.Internet;

import ServicesProvider.IProvider;

public class InternetWe extends IProvider {
    public InternetWe(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
    }
}
