package UserAdmin;

import Payment.IPayment;
import Payment.Wallet;
import ServicesProvider.IProvider;

public class User {
    public AuthenInfo authInfo;
    public String name;
    IPayment payment;
    public Wallet wallet;

    public User(AuthenInfo accountAuthenInfo, String name) {
        this.authInfo = accountAuthenInfo;
        this.name = name;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public boolean pay(double amount, IProvider service) {
        return payment.pay(this, service);
    }
}
