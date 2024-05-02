package com.yash.springdemo;

import org.springframework.boot.jackson.JsonComponent;
import org.springframework.context.annotation.Bean;

@JsonComponent
public class BookSerializerConfig {

	@Bean
	public BookSerializer bookSerializer() {
		return new BookSerializer();
	
	}
}