package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLB implements  LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 本方法作用参考RoundRobinRule.incrementAndGetModulo()方法
     * @return
     */
    public final int getAndIncrement(){
        int current;
        int nextIndex;
        do{
            current = this.atomicInteger.get();
            nextIndex = current + 1;

        }while(!this.atomicInteger.compareAndSet(current,nextIndex));

        return nextIndex;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
