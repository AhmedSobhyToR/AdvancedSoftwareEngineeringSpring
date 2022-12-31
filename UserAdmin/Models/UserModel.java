package UserAdmin.Models;

import java.util.Objects;
import Payment.IPayment;
import Payment.Wallet;
import ServicesProvider.IProvider;
import UserAdmin.Data.DataBase;

public class UserModel {

    public String name;
    public String email;
    public String password;
    IPayment payment;
    public Wallet wallet;

    public UserModel(String email, String password, String name) {

        this.name = name;
        this.password = password;
        this.email = email;
    }

    public void add() {
        DataBase.users.add(this);
    }

    public UserModel getUser(int index) {
        for (int i = 0; i < DataBase.users.size(); i++) {
            if (DataBase.users.get(i).is_equal(this))
                return DataBase.users.get(i);
        }
        return this;

    }

    public int searchUser() {
        for (int i = 0; i < DataBase.users.size(); i++) {
            if (DataBase.users.get(i).is_equal(this))
                return i;
        }
        return -1;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public boolean pay(double amount, IProvider service) {
        return payment.pay(this, service);
    }

    public boolean is_equal(UserModel accountAuthenInfo) {
        return Objects.equals(accountAuthenInfo.email, email) && Objects.equals(accountAuthenInfo.password, password);
    }

}
