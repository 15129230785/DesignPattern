package com.evan.designpattern.observer.test;

import com.evan.designpattern.observer.api.Observer;
import com.evan.designpattern.observer.api.Subject;
import com.evan.designpattern.observer.impl.CurrentCondition;
import com.evan.designpattern.observer.impl.ForcastCondition;
import com.evan.designpattern.observer.impl.WeatherData;
import com.evan.designpattern.observer.impl.xxxx;

/**
 * @Author: Evan on 1/22/2016  19:21.
 * Email: evan.wan@ndpmedia.com
 */
public class Test {
    public static void main(String[] args)
    {
        Observer currentCondition = new CurrentCondition();
        Observer forcastCondition = new ForcastCondition();
        xxxx  x= new xxxx();

        WeatherData subject = new WeatherData();
        subject.registerObserver(currentCondition);
        subject.registerObserver(forcastCondition);
        subject.registerObserver(x);

        subject.setData(20,30,40);


    }
}
