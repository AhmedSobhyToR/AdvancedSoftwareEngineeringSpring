package ServicesProvider.Internet;

import ServicesProvider.IProvider;

public class InternetEtisalat extends IProvider {
    public InternetEtisalat(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
    }
}
