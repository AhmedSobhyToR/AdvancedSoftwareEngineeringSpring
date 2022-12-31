package ServicesProvider.Mobile;

import ServicesProvider.IProvider;

public class MobEtisalat extends IProvider {
    public MobEtisalat(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
    }
}