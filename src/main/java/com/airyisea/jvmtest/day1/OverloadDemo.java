
package com.airyisea.jvmtest.day1;

public class OverloadDemo {

    public void invoke(Object o, Object... args) {

        System.out.println("=========invoke(Object o, Object... args)=========");

    }

    public void invoke(String s, Object o, Object... args) {

        System.out.println("=========invoke(String s, Object o, Object... args)=========");

    }

    public void invoke(String s, Integer i, Object... args) {

        System.out.println("=========public void invoke(String s, Integer i, Object... args)=========");

    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        demo.invoke(null, "1");
        demo.invoke(null, "1","2");
        demo.invoke(null, 1);
        demo.invoke(null, 1,2);


    }



}
