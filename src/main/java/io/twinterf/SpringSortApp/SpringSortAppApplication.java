package io.twinterf.SpringSortApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSortAppApplication {

	public static void main(String[] args) {

		int[] nums = {11, 1, -50, 122, 49, 13, 133, -99, 10, 3, 100, 23, 10000, 99999};

		ApplicationContext ctx = SpringApplication.run(SpringSortAppApplication.class, args);

		BinarySearcher bubbleSearcher = ctx.getBean(BinarySearcher.class);

		System.out.println(bubbleSearcher.binarySearch(nums, 3));
		bubbleSearcher.getType();

	}

}
