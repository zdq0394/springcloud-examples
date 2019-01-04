package com.example.zuul.eureka;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.mvc.condition.RequestCondition;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulEurekaApplication.class, args);
	}

	@Bean
	public MyFilter getMyFilter() {
		return new MyFilter();
	}

}

class MyFilter extends ZuulFilter {
	@Override
	public String filterType(){
		return "pre";
	}

	@Override
	public int filterOrder(){
		return 0;
	}

	@Override
	public boolean shouldFilter(){
		return true;
	}
	@Override
	public Object run(){
		RequestContext ctx = RequestContext.getCurrentContext();
		System.out.println("My Custom Filter");
		ctx.setSendZuulResponse(true);
		ctx.setResponseStatusCode(200);
		ctx.set("isSuccess",true);
		return null;
	}
}
