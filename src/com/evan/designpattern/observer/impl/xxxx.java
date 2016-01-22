package com.evan.designpattern.observer.impl;

import com.evan.designpattern.observer.api.Observer;

/**
 * @Author: Evan on 1/22/2016  19:37.
 * Email: evan.wan@ndpmedia.com
 */
public class xxxx implements Observer {
    private float temperature;
    private float atmospheric;
    private float humidity;


    @Override
    public void update(float temperature, float atmospheric, float humidity)
    {
        this.temperature = temperature;
        this.atmospheric = atmospheric;
        this.humidity = humidity;
        display();
    }

    private void display()
    {
        System.out.println("我是");
    }
}
