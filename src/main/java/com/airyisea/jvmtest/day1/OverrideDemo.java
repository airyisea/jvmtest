package com.airyisea.jvmtest.day1;

public class OverrideDemo {

    interface Customer {
        boolean isVIP();
    }

    class Vip implements Customer {

        public boolean isVIP() {
            return true;
        }
    }

    class Merchant {
        public Number actionPrice(double price, Customer customer) {
            System.out.println("===========Merchant:actionPrice=============");
            return price * 0.8;
        }
    }

    class NaiveMerchant extends Merchant {
        @Override
        public Double actionPrice(double price, Customer customer) {
            System.out.println("===========NaiveMerchant:actionPrice=============");
            return price * 0.8;
        }
    }

    class MerchantV2<T extends Customer> {
        public double actionPrice(double price, T customer) {
            System.out.println("===========MerchantV2:actionPrice=============");
            return price * 0.8;
        }
    }

    class VIPOnlyMerchant extends MerchantV2<Vip> {
        @Override
        public double actionPrice(double price, Vip customer) {
            System.out.println("===========VIPOnlyMerchant:actionPrice=============");
            return price * 0.8;
        }
    }


}
