package com.feng.zuulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wufeng@chetong.net
 * @date 2017/11/27 17:57
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiApplication.class, args);
	}
}
