package Excercises.MathExercise;

import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import static jdk.incubator.foreign.ResourceScope.newImplicitScope;

public class MathMain {
    public static void main(String[] args) {
        System.out.println(Math.Pow(10, 2));
        System.out.println(Math.Factorial(1));
        System.out.println(Math.Fibonacci(10));
        int[] a = new int[]{3, 4, 5};
        System.out.println(Math.Max(a));
        System.out.println(Math.fibo(4));
        System.out.println(Math.radianConverter(180));
        System.out.println(Math.degreeConverter(Math.Pi));
    }
}