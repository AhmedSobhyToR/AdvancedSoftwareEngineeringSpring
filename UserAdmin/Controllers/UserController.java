package UserAdmin.Controllers;

import UserAdmin.Models.UserModel;

public class UserController {

    public UserModel loginUser(String email, String password) {
        UserModel user = new UserModel(email, password, "");
        int index = user.searchUser();

        if (index != -1) {
            return user.getUser(index);
        } else
            return null;
    }

    public boolean signupUser(String userName, String email, String password) {
        UserModel user = new UserModel(email, password, userName);
        int index = user.searchUser();

        if (index == -1) {

            user.add();
            return true;
        } else
            return false;
    }

}
