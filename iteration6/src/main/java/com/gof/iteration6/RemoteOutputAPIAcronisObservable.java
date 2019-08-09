package com.gof.iteration6;

import com.gof.customer.RemoteOutputAPIAcronis;
import com.gof.customer.core.DataAPI;
import com.gof.customer.monitors.Monitor;

import java.util.ArrayList;
import java.util.List;

public class RemoteOutputAPIAcronisObservable {

    private List<Monitor> observers;

    public RemoteOutputAPIAcronisObservable() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Monitor monitor){
        observers.add(monitor);
    }

    public void removeObserver(Monitor monitor){
        observers.remove(monitor);
    }

    public void setOutputData(DataAPI dataAPI){
        RemoteOutputAPIAcronis.initSystem();
        RemoteOutputAPIAcronis.preparingConnection();
        RemoteOutputAPIAcronis.connect();
        RemoteOutputAPIAcronis.sendMX(dataAPI.getDataMX());
        RemoteOutputAPIAcronis.sendSX(dataAPI.getDataSX());
        RemoteOutputAPIAcronis.sendBX(dataAPI.getDataBX());
        RemoteOutputAPIAcronis.sendFX(dataAPI.getDataFX());
        RemoteOutputAPIAcronis.stopSystem();
        RemoteOutputAPIAcronis.checkErrors();
        RemoteOutputAPIAcronis.disconnect();

        notifyObservers(dataAPI);
    }

    private void notifyObservers(DataAPI dataAPI) {
        String concat = dataAPI.getDataFX()
                .concat(dataAPI.getDataMX())
                .concat(dataAPI.getDataSX())
                .concat(dataAPI.getDataBX());

        observers.forEach(observer -> observer.showMessage(concat));
    }


}
