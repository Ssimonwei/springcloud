package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hystrix Dashboard图形化监控服务器8001,8002
 * 访问地址: http://localhost:9001/hystrix
 * 输入的被监控服务地址 http://localhost:8001/hystrix.stream
 * 测试时浏览器输入：http://localhost:8001/payment/circuit/6
 *                http://localhost:8001/payment/circuit/-6
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
