package com.example.task.fib;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fibonacci {
    public static BigInteger fib(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) == -1 || n.compareTo(BigInteger.ONE) == 0) return n;
        else
            return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.ONE).subtract(BigInteger.ONE)));
    }

}


