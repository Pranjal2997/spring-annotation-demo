package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    Actor actor;

    public Actor getActor() {
        return actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void getDisplay(){
        System.out.println("Movie on display..");
        actor.display();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Inside Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Inside Bean Name Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Inside Application Context Aware");
    }
}
