package com.example.nanohttpstestprj;

import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NanoHttpsTestPrjApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NanoHttpsTestPrjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("************");
		System.out.println("");

		System.out.println("Hello world!");

		try {
			new NanoServer();
		} catch (IOException ioe) {
			System.err.println("Couldn't start server:\n" + ioe);
		}

		System.out.println("");
		System.out.println("************");

	}
}
