package com.example.features.fninterfaces;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FnInterfaceDemo {
  public static void main(String[] args) throws InterruptedException {
    GreetingInterface1 greetingInterface1 = ()->{
      System.out.println("deinition string");
    };

    greetingInterface1.greetMorning();
    greetingInterface1.greetDefaultMethod1();
    GreetingInterface1.greetStaticMethod1();

    // Java provides default fn interfaces
    Function<String, String > fn = param -> param + " appended";
    Consumer<String> consumer = (param) -> System.out.println(param + "consumed");
    Supplier<String> supplier = () -> "from supplier";
    Predicate<String> predicate = param -> param.equalsIgnoreCase("predicate");
    Predicate<String> predicate1 = param -> param == null;


    System.out.println(FnInterfaceDemo.fnTest("function", fn));
    System.out.println(FnInterfaceDemo.predicateTest("predicate1", predicate));
    System.out.println(FnInterfaceDemo.predicateNullCheck(null, predicate1));

    //common useful fn interfaes - runnable, comparable, callable,
    Runnable runnable1 = () -> System.out.println(Thread.currentThread().getName());
    new Thread(runnable1).start();

    Callable callable = () -> Thread.currentThread().getName() + "---";
    var future = new FutureTask<String>(callable);
    new Thread(future).start();

    // multi threading executor service
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    var future1 = executorService.submit(callable);


    try {
      // thread 0
      System.out.println(future.isDone());
      System.out.println(future.get());
      System.out.println(future.isDone());

      //pool 1-thread-1
      System.out.println(future1.isDone());
      System.out.println(future1.get());
      System.out.println(future1.isDone());

    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }

  public static String fnTest(String ip, Function<String, String> fn) {
    return  fn.apply(ip);
  }

  public static boolean predicateTest(String ip, Predicate<String> predicate) {
    return  predicate.test(ip);

  }

  public static boolean predicateNullCheck(String ip, Predicate<String> predicate) {
    return  predicate.test(ip);

  }
}
