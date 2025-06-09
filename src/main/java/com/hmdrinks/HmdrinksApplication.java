package com.hmdrinks;

import com.hmdrinks.Config.RateLimitingFilter;
import com.hmdrinks.Service.ElasticsearchSyncService;
import com.hmdrinks.Service.ShipperComissionDetailService;
import com.hmdrinks.Service.VNPayIpnHandler;
import com.hmdrinks.Service.ZaloPayService;
import com.hmdrinks.SupportFunction.SupportFunction;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "HMDrinks Server URL")})
@SpringBootApplication(scanBasePackages = "com.hmdrinks")
//@EnableAsync
//@EnableScheduling
public class HmdrinksApplication {

//	@Autowired
//	private SupportFunction supportFunction;

	public static void main(String[] args) {

		SpringApplication.run(HmdrinksApplication.class, args);

	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void onApplicationReady() {
//		supportFunction.resetShipperDaily();
//	}




}
