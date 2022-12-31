package UserAdmin.Models;

import java.util.Objects;
import UserAdmin.Data.DataBase;

public class AdminModel {
    public String name;
    public String email;
    public String password;

    public AdminModel(String email, String password, String name) {

        this.name = name;
        this.password = password;
        this.email = email;
    }

    public AdminModel getAdmin(int index) {
        for (int i = 0; i < DataBase.admins.size(); i++) {
            if (DataBase.admins.get(i).is_equal(this))
                return DataBase.admins.get(i);
        }
        return this;

    }

    public int searchAdmin() {
        for (int i = 0; i < DataBase.users.size(); i++) {
            if (DataBase.admins.get(i).is_equal(this))
                return i;
        }
        return -1;
    }

    public boolean is_equal(AdminModel accountAuthenInfo) {
        return Objects.equals(accountAuthenInfo.email, email) && Objects.equals(accountAuthenInfo.password, password);
    }

}
