package Payment;

import UserAdmin.User;
import UserAdmin.Models.UserModel;
import ServicesProvider.IProvider;

public abstract class IPayment {
    public abstract boolean pay(UserModel userModel, IProvider servicesProvider);

    public boolean pay(User user, IProvider service) {
        return false;
    }
}
