package com.mtsegab.photoapp.api.gateway.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder rlb, AuthorizationHeaderFilter
//            authorizationHeaderFilter) {
//
//        return rlb
//                .routes()
//                .route(p -> p
//                        .path("/users-ws/users/status")
//                        .filters(f -> f.removeRequestHeader("Cookie")
//                                .rewritePath("/users-ws/(?<segment>.*)", "/$\\{segment}")
//                                .filter(authorizationHeaderFilter.apply(new
//                                        AuthorizationHeaderFilter.Config())))
//                        .uri("lb://users-ws")
//                )
//                .build();
//    }

}
