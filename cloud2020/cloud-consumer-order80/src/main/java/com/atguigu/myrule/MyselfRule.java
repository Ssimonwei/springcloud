package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyselfRule {

    public IRule myRule(){
        //负载均衡定义为随机
        return new RandomRule();
    }
}
