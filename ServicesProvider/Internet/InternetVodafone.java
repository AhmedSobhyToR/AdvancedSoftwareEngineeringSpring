package ServicesProvider.Internet;

import ServicesProvider.IProvider;

public class InternetVodafone extends IProvider {
    public InternetVodafone(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
    }
}
