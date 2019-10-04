package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBranch;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]) throws Exception {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Config file loaded..");

        BeanLifecycleDemoBranch life = factory.getBean(BeanLifecycleDemoBranch.class);


        Movie movie = factory.getBean("movie1",Movie.class);
        movie.getDisplay();

        Movie movie2 = factory.getBean("movie2",Movie.class);
        movie2.getDisplay();

        ((AnnotationConfigApplicationContext) factory).registerShutdownHook();
    }
}
