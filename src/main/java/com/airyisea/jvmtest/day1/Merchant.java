package com.airyisea.jvmtest.day1;

public class Merchant {

    public Number actionPrice(double price, Customer customer) {
        return 1;
    }


    public static class NaiveMerchant extends Merchant {
        @Override
        public Double actionPrice(double price, Customer customer) {
            return 1.0;
        }

    }


}
