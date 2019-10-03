package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {


    @PostConstruct
    public void Init ()
    {
        System.out.println("Initialization");
    }
    @PostConstruct
      public  void clean()
    {
        System.out.println("custom destroy");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }


    public void afterPropertiesSet() throws Exception {

        System.out.println("After properties");
    }
}
