package test;

import java.util.concurrent.locks.LockSupport;

public class TestPark {
    public static void main(String[] args) {
        LockSupport.unpark(Thread.currentThread());
        LockSupport.park();
        System.out.println("hello");
        LockSupport.unpark(Thread.currentThread());
        LockSupport.unpark(Thread.currentThread());
        LockSupport.park();
        LockSupport.park();
        System.out.println("hello");
    }
}
