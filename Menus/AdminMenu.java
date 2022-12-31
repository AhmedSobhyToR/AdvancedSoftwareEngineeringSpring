package Menus;

import UserAdmin.Authentication;

public class AdminMenu {
    public void display(Authentication authentication) {
        System.out.println("\n ------- Admin Menu -----");
        System.out.println("1. Add Discount");
        System.out.println("2. Show All Refund Requests");
        System.out.println("3. Logout");

        System.out.println("------------------");
        int choice = Read.readChoice("||CHOICE||: ", 1, 3);

        switch (choice) {
            case 1 : {

            }
            case 2 : {

            }
            case 3 : {
                new HomeMenu().display(authentication);
            }
            default : System.out.println("Wrong Choice");
        }
        if (choice < 5) new AdminMenu().display(authentication);
    }
}