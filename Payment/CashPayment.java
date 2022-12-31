package Payment;

import ServicesProvider.IProvider;
import UserAdmin.User;
import UserAdmin.Models.UserModel;

public class CashPayment extends IPayment {
    @Override
    public boolean pay(User user, IProvider servicesProvider) {
        System.out.println(" Payment has been Done Using Cash");
        return true;
    }

    @Override
    public boolean pay(UserModel userModel, IProvider servicesProvider) {
        // TODO Auto-generated method stub
        return false;
    }
}
