import UserAdmin.AuthenInfo;
import UserAdmin.Authentication;
import Menus.HomeMenu;

public class Main {
    public static void main(String[] args) {
        String adminEmail = "software.com";
        String password = "1234";

        AuthenInfo adminInfo = new AuthenInfo(adminEmail, password);
        Authentication authentication = new Authentication(adminInfo);

        new HomeMenu().display(authentication);
    }
}
