package Payment;

import UserAdmin.User;
import UserAdmin.Models.UserModel;
import ServicesProvider.IProvider;

public class CreditPayment extends IPayment {
    @Override
    public boolean pay(User user, IProvider servicesProvider) {
        System.out.println(" Payment has been Done Using Cash");
        return true;
    }
    public void recharge(Wallet wallet, double amount) {
        wallet.add_value(amount);
    }
    @Override
    public boolean pay(UserModel userModel, IProvider servicesProvider) {
        // TODO Auto-generated method stub
        return false;
    }
}
