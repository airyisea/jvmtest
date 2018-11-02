package com.airyisea.jvmtest.day1;

public interface Customer {

    boolean isVip();

    public static class Vip implements Customer {

        @Override
        public boolean isVip() {
            return true;
        }
    }

}
