package com.airyisea.jvmtest.day1;

public class MerchantV2<T extends Customer> {

    public double actionPrice(double price, T customer) {
        return 1;
    }


    public static class NaiveMerchant extends MerchantV2<Customer.Vip> {
        @Override
        public double actionPrice(double price, Customer.Vip customer) {
            return 1.0;
        }

    }


}
