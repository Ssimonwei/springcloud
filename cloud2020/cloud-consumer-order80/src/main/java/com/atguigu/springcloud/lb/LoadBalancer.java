package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @手写轮询算法步骤
 *  1、ApplicationContextBean 去掉@LoadBalanced注解
 *  2、LoadBalancer接口
 *  3、MyLB
 *  4、OrderController
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
