package cs2130;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCases {

    @Nested
    class NqueensTest {

        @Test
        void isValidFalse() {
            Nqueens q = new Nqueens(2);
            q.setQueens(new int[]{0, 0});
            assertFalse(q.isValid(2));
            q = new Nqueens(2);
            q.setQueens(new int[]{0, 1});
            assertFalse(q.isValid(2));
            q = new Nqueens(3);
            q.setQueens(new int[]{1, 2, 0});
            assertFalse(q.isValid(3));
            q = new Nqueens(3);
            q.setQueens(new int[]{1, 2, 0});
            assertFalse(q.isValid(3));
            q = new Nqueens(3);
            q.setQueens(new int[]{1, 2, 0});
            assertFalse(q.isValid(3));
            q = new Nqueens(4);
            q.setQueens(new int[]{0, 1, 2, 3});
            assertFalse(q.isValid(4));
            q = new Nqueens(4);
            q.setQueens(new int[]{0, 2, 0, 2});
            assertFalse(q.isValid(4));
            q = new Nqueens(5);
            q.setQueens(new int[]{3,1,4,2,4});
            assertFalse(q.isValid(5));
            q = new Nqueens(7);
            q.setQueens(new int[]{0, 2, 4, 1, 3, 5, 6});
            assertFalse(q.isValid(7));
            q = new Nqueens(8);
            q.setQueens(new int[]{1, 3, 5, 7, 0, 2, 4, 6});
            assertFalse(q.isValid(8));
        }

        @Test
        void isValidTrue(){
            Nqueens q = new Nqueens(1);
            q.setQueens(new int[]{0});
            assertTrue(q.isValid(1));
            q = new Nqueens(4);
            q.setQueens(new int[]{1,3,0,2});
            assertTrue(q.isValid(4));
            q.setQueens(new int[]{2,0,3,1});
            assertTrue(q.isValid(4));
            q = new Nqueens(5);
            q.setQueens(new int[]{3,1,4,2,0});
            assertTrue(q.isValid(5));
            q.setQueens(new int[]{1,3,0,2,4});
            assertTrue(q.isValid(5));
            q.setQueens(new int[]{0,2,4,1,3});
            assertTrue(q.isValid(5));
            q = new Nqueens(7);
            q.setQueens(new int[]{0, 2, 4, 6, 1, 3, 5});
            assertTrue(q.isValid(7));
            q = new Nqueens(8);
            q.setQueens(new int[]{ 2, 5, 7, 0, 3, 6, 4, 1});
            assertTrue(q.isValid(8));

        }

        @Test
        void partialIsValidFalse() {
            Nqueens q = new Nqueens(3);
            q.setQueens(new int[]{0, 0, 2});
            assertFalse(q.isValid(2));
            q = new Nqueens(3);
            q.setQueens(new int[]{0, 1, 2});
            assertFalse(q.isValid(2));
            q = new Nqueens(5);
            q.setQueens(new int[]{0, 2, 4, 3, 1});
            assertFalse(q.isValid(4));
            q = new Nqueens(6);
            q.setQueens(new int[]{1, 2, 0});
            assertEquals(true, q.isValid(1));
            q = new Nqueens(8);
            q.setQueens(new int[]{1, 2, 0});
            assertEquals(true, q.isValid(1));
        }

        @Test
        void partialIsValidTrue(){
            Nqueens q = new Nqueens(2);
            q.setQueens(new int[]{0,1});
            assertTrue(q.isValid(1));
            q = new Nqueens(3);
            q.setQueens(new int[]{0, 2, 2});
            assertTrue(q.isValid(2));
            q = new Nqueens(5);
            q.setQueens(new int[]{0, 2, 4, 3, 1});
            assertTrue(q.isValid(3));
            q = new Nqueens(6);
            q.setQueens(new int[]{0,2,4,1,3,5});
            assertTrue(q.isValid(5));
        }

    }

    @Nested
    class FibTest {

        @Test
        void recurseFib() {
            assertEquals(BigInteger.ZERO, Fib.recurseFib(0));
            assertEquals(BigInteger.ONE, Fib.recurseFib(1));
            assertEquals(BigInteger.ONE, Fib.recurseFib(2));
            assertEquals(BigInteger.TWO, Fib.recurseFib(3));
            assertEquals(BigInteger.valueOf(3), Fib.recurseFib(4));
            assertEquals(BigInteger.valueOf(5), Fib.recurseFib(5));
            assertEquals(BigInteger.valueOf(21), Fib.recurseFib(8));
            assertEquals(BigInteger.valueOf(55), Fib.recurseFib(10));
            assertEquals(BigInteger.valueOf(6765), Fib.recurseFib(20));
            assertEquals(BigInteger.valueOf(832040), Fib.recurseFib(30));
            assertEquals(BigInteger.valueOf(14930352), Fib.recurseFib(36));
        }

        @Test
        void fastFib() {
            assertEquals(BigInteger.ZERO, Fib.fastFib(0));
            assertEquals(BigInteger.ONE, Fib.fastFib(1));
            assertEquals(BigInteger.ONE, Fib.fastFib(2));
            assertEquals(BigInteger.TWO, Fib.fastFib(3));
            assertEquals(BigInteger.valueOf(3), Fib.fastFib(4));
            assertEquals(BigInteger.valueOf(5), Fib.fastFib(5));
            assertEquals(BigInteger.valueOf(21), Fib.fastFib(8));
            assertEquals(BigInteger.valueOf(55), Fib.fastFib(10));
            assertEquals(BigInteger.valueOf(6765), Fib.fastFib(20));
            assertEquals(BigInteger.valueOf(832040), Fib.fastFib(30));
            assertEquals(BigInteger.valueOf(14930352), Fib.fastFib(36));
            assertEquals(new BigInteger("4807526976"), Fib.fastFib(48));
            assertEquals(new BigInteger("10610209857723"), Fib.fastFib(64));
        }
    }
}
