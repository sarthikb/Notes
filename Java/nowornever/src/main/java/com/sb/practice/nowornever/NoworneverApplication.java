package com.sb.practice.nowornever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class NoworneverApplication {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		SpringApplication.run(NoworneverApplication.class, args);
	}

}
