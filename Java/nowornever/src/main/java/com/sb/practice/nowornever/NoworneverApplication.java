package com.sb.practice.nowornever;

import com.sb.practice.nowornever.collection.queue.PDeQueue;
import com.sb.practice.nowornever.collection.queue.Pqueue;
import com.sb.practice.nowornever.lld.chainofresponsiblity.LogLevel;
import com.sb.practice.nowornever.lld.chainofresponsiblity.LogProcessor;
import com.sb.practice.nowornever.lld.decorator.BasePizza;
import com.sb.practice.nowornever.lld.decorator.ExtraCheeseToppingPizza;
import com.sb.practice.nowornever.lld.decorator.VegOverloadPizza;
import com.sb.practice.nowornever.thread.CompareAndSwap;
import com.sb.practice.nowornever.thread.MonitorLockWorking;
import com.sb.practice.nowornever.thread.RunnableImplementation;
import com.sb.practice.nowornever.thread.ThreadExtend;
import com.sb.practice.nowornever.thread.monitorlock.ResetAvailableThread;
import com.sb.practice.nowornever.thread.monitorlock.SharedResource;
import com.sb.practice.nowornever.thread.monitorlock.UpdateAvailableThread;
import com.sb.practice.nowornever.thread.reentrant.CommonResource;
import com.sb.practice.nowornever.thread.threadpoolexecutor.CompletableFutureCheck;
import com.sb.practice.nowornever.thread.threadpoolexecutor.FutureCheck;
import com.sb.practice.nowornever.thread.threadpoolexecutor.ThreadPoolExecutorPractice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootApplication
public class NoworneverApplication {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		SpringApplication.run(NoworneverApplication.class, args);

		var extraCheesePizza = new ExtraCheeseToppingPizza(new BasePizza());
		System.out.println("Extra cheese pizza will cost :: "+ extraCheesePizza.getCost());

		var extraCheeseWithVegOverLoadPizza = new ExtraCheeseToppingPizza(new VegOverloadPizza(new BasePizza()));
		System.out.println("Extra cheese pizza with veg overload will cost :: "+ extraCheeseWithVegOverLoadPizza.getCost());

//		var logProcessor = new LogProcessor();
//		logProcessor.processLog("Logging :: ERROR ", LogLevel.ERROR);
//		logProcessor.processLog("Logging :: WARNING", LogLevel.WARNING);
//		logProcessor.processLog("Logging :: INFO ", LogLevel.INFO);
//		logProcessor.processLog("Logging :: DEBUG", LogLevel.DEBUG);


//		PDeQueue pDeQueue = new PDeQueue();
//		pDeQueue.check();

//		Pqueue pqueue = new Pqueue();
//		pqueue.check();

//		CompletableFutureCheck completableFutureCheck = new CompletableFutureCheck();
//		completableFutureCheck.checkCompletableFuture();

//		FutureCheck futureCheck = new FutureCheck();
//		futureCheck.submitTask();

//		ThreadPoolExecutorPractice threadPoolExecutorPractice = new ThreadPoolExecutorPractice();
//		threadPoolExecutorPractice.threadTest();


//		CompareAndSwap compareAndSwap = new CompareAndSwap();
//		Thread t1 = new Thread(() -> {
//			for(int i =0; i<200; i++) {
//				compareAndSwap.increment();
//			}
//		});
//
//		Thread t2 = new Thread(() -> {
//			for(int i =0; i<200; i++) {
//				compareAndSwap.increment();
//			}
//		});
//
//		t1.start();
//		t2.start();
//
//		t1.join();
//		t2.join();
//
//		System.out.println("Final value of counter is: " + compareAndSwap.get());


//		CommonResource commonResource = new CommonResource();
//		CommonResource commonResource1 = new CommonResource();
//		ReentrantLock reentrantLock = new ReentrantLock();
//
//		Thread thread1 = new Thread(() -> {
//            try {
//                commonResource.doSomething(reentrantLock);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//		Thread thread2 = new Thread(() -> {
//			try {
//				commonResource1.doSomething(reentrantLock);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		});
//		thread1.start();
//		thread2.start();


//		SharedResource sharedResource = new SharedResource();
//		UpdateAvailableThread updateResource = new UpdateAvailableThread(sharedResource);
//		Thread thread = new Thread(updateResource);
//		Thread thread1 = new Thread(new ResetAvailableThread(sharedResource));
//		thread1.start();
//		thread.start();


		//		RunnableImplementation runnableImplementation = new RunnableImplementation();
//		Thread thread = new Thread(runnableImplementation);
//		thread.start();
//		System.out.println("Current Thread :: " + Thread.currentThread().getName());
//
//		ThreadExtend threadExtend = new ThreadExtend();
//		threadExtend.start();
//		System.out.println("Current Thread :: " + Thread.currentThread().getName());


//		MonitorLockWorking monitorLockWorking = new MonitorLockWorking();
//		Thread thread = new Thread(monitorLockWorking::task1);
//		Thread thread2 = new Thread(monitorLockWorking::task2);
//		Thread thread3 = new Thread(monitorLockWorking::task3);
//
//		thread.start();
//		thread2.start();
//		thread3.start();
	}

}
