package UserAdmin.Controllers;

import UserAdmin.Models.AdminModel;
import UserAdmin.Data.DataBase;

public class AdminController {

    public AdminModel loginAdmin(String email, String password) {
        AdminModel admin = new AdminModel(email, password, "");
        int index = admin.searchAdmin();

        if (index != -1) {
            return admin.getAdmin(index);
        } else
            return null;
    }

}
