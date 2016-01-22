package com.evan.designpattern.observer.impl;

import com.evan.designpattern.observer.api.Observer;
import com.evan.designpattern.observer.api.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Evan on 1/22/2016  19:16.
 * Email: evan.wan@ndpmedia.com
 */
public class WeatherData implements Subject {
    private float mTemperature;
    private float mAtmospheric;
    private float mHumidity;

    private List<Observer> mObservers = new ArrayList<Observer>();


//    public float getmTemperature() {
//        return mTemperature;
//    }
//
//    public void setmTemperature(float mTemperature) {
//        this.mTemperature = mTemperature;
//    }
//
//    public float getmAtmospheric() {
//        return mAtmospheric;
//    }
//
//    public void setmAtmospheric(float mAtmospheric) {
//        this.mAtmospheric = mAtmospheric;
//    }
//
//    public float getmHumidity() {
//        return mHumidity;
//    }
//
//    public void setmHumidity(float mHumidity) {
//        this.mHumidity = mHumidity;
//    }

    public void setData(float temperature, float atmospheric, float humidity)
    {
        this.mTemperature = temperature;
        this.mAtmospheric = atmospheric;
        this.mHumidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(mObservers.contains(observer))
            mObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : mObservers)
        {
            observer.update(mTemperature, mAtmospheric, mHumidity);
        }

    }
}
