package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class BeanPostProcessorDemoBean implements BeanPostProcessor,InitializingBean, DisposableBean {


    @PostConstruct
    public void Init ()
    {
        System.out.println("Initialization");
    }
    @PostConstruct
      public  void clean()
    {
        System.out.println("custom create");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("After properties");
    }
}
