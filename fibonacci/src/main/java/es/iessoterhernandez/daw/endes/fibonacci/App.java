package es.iessoterhernandez.daw.endes.fibonacci;

public class App {

public static int fib(int n) {

if (n <= 1) return n;

else return fib(n-1) + fib(n-2);

}
}
