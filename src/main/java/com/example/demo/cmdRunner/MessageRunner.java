package com.example.demo.cmdRunner;

import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		System.out.println("Hi message Runner from cmd line");
	}
	
	

}
