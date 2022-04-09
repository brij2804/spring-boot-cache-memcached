package com.brijesh.cache.springbootcachememcached;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootCacheMemcachedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCacheMemcachedApplication.class, args);
	}

}
