package Menus;

import Payment.CashPayment;
import Payment.CreditPayment;
import Payment.WalletPayment;
import ServicesProvider.IProvider;
import ServicesProvider.Mobile.MobEtisalat;
import ServicesProvider.ServicesFactory.*;
import UserAdmin.Authentication;
import UserAdmin.User;

public class UserMenu {
    public void display(Authentication auth, User user) {
        System.out.println("\n ▶Welcome [" + user.name + "] ♥");
        System.out.println("------- User Menu -----");
        System.out.println("1. Services [Search & Pay]");
        System.out.println("2. Ask For Refund");
        System.out.println("3. Recharge Wallet");
        System.out.println("4. Search For Discounts");
        System.out.println("5. Return Home");
        System.out.println("------------------");
        int choice = Read.readChoice("||CHOICE||: ", 1, 5);

        switch (choice) {
            case 1 : {
                IServices servicesFactory;
                IProvider provider = new MobEtisalat(10, true);
                System.out.println("\n ------- Services Category -----");
                System.out.println("1. Mobile recharge services");
                System.out.println("2. Internet Payment services");
                System.out.println("3. Landline services");
                System.out.println("4. Donations");
                int c = Read.readChoice("||CHOICE||: ", 1, 4);
                double money = Read.readMoney("Money: ", 1, 100000);

                switch (c) {
                    case 1 : {
                        servicesFactory = new MobileRechargeFactory();
                        System.out.println("\n ------- Mobile Providers -----");
                        System.out.println("1. Vodafone");
                        System.out.println("2. Etisalat");
                        System.out.println("3. Orange");
                        System.out.println("4. WE");
                        int c2 = Read.readChoice("||Provider||: ", 1, 4);
                        provider = servicesFactory.getService(c2, money);
                    }
                    case 2 : {
                        servicesFactory = new InternetFactory();
                        System.out.println("\n ------- Internet Providers -----");
                        System.out.println("1. Vodafone");
                        System.out.println("2. Etisalat");
                        System.out.println("3. Orange");
                        System.out.println("4. WE");
                        int c2 = Read.readChoice("||Provider||: ", 1, 4);
                        provider = servicesFactory.getService(c2, money);
                    }
                    case 3 : {
                        servicesFactory = new LandlineFactory();
                        System.out.println("\n ------- Landline Providers -----");
                        System.out.println("1. Monthly Receipt");
                        System.out.println("2. Quarter Receipt");
                        int c2 = Read.readChoice("||Provider||: ", 1, 2);
                        provider = servicesFactory.getService(c2, money);
                    }
                    case 4 : {
                        servicesFactory = new DonationFactory();

                        System.out.println("\n ------- Donation Providers -----");
                        System.out.println("1. Cancer Hospital");
                        System.out.println("2. Schools");
                        System.out.println("3. NGOs");
                        int c2 = Read.readChoice("||Provider||: ", 1, 3);

                        provider = servicesFactory.getService(c2, money);

                    }
                }

                int max_input = 2;
                System.out.println("\n ------- Payment Techniques -----");
                System.out.println("1. Wallet Points");
                System.out.println("2. Credit Card");
                if (provider.is_cash) {
                    System.out.println("3. Cash [Valid] ✔");
                    max_input += 1;
                } else {
                    System.out.println("Cash [Not Valid]");
                }
                int c3 = Read.readChoice("||Payment||: ", 1, max_input);
                switch (c3) {
                    case 1 : {
                        user.setPayment(new WalletPayment());
                    }
                    case 2 : {
                        user.setPayment(new CreditPayment());
                    }
                    case 3 : {
                        user.setPayment(new CashPayment());
                    }
                }
                boolean is_success = user.pay(money, provider);
                if (is_success) {
                    // todo create transaction
                    System.out.print("Successful Payment ✅✅ \n");
                } else {
                    System.out.print("Unsuccessful Payment ❌❌ \n");
                }
            }
            case 2 : {

            }
            case 3 : {
                double amount2 = Read.readMoney("Recharge Money: ", 1, 100000);
                CreditPayment credit = new CreditPayment();
                credit.recharge(user.wallet, amount2);
                System.out.print("Successful Recharge ✅✅ \n");
            }

            case 4 : {

            }
            case 5 : {
                new HomeMenu().display(auth);
            }
            default : System.out.println("Wrong Choice");
        }
        if (choice < 5) new UserMenu().display(auth, user);
    }
}