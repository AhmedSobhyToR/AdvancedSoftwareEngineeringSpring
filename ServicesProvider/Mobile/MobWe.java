package ServicesProvider.Mobile;

import ServicesProvider.IProvider;

public class MobWe extends IProvider {
    public MobWe(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
    }
}
