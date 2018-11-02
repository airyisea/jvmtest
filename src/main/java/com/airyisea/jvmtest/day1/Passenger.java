package com.airyisea.jvmtest.day1;

    // Run with: java -XX:CompileCommand='dontinline,*. exit' 乘客
public abstract class Passenger {
    abstract void exit();

    public static void main(String[] args) {
        Passenger a = new Chinese();
        Passenger b = new Foreinger();
        long current = System.currentTimeMillis();
        for (int i = 1; i <= 2_000_000_000; i++) {
            if (i % 100_000_000 == 0) {
                long temp = System.currentTimeMillis();
                System.out.println(temp - current);
                current = temp;
            }
            Passenger c = (i < 1_000_000_000) ? a : b;
            c.exit();
        }
    }
}
class Chinese extends Passenger { @Override void exit() {} }
class Foreinger extends Passenger { @Override void exit() {} }
