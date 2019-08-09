package com.gof.iteration6;

import com.gof.customer.core.DataAPI;
import com.gof.customer.monitors.MonitorFR;
import com.gof.customer.monitors.MonitorSE;
import com.gof.customer.monitors.MonitorUK;
import com.gof.customer.monitors.MonitorUS;

import java.util.List;

public class Iteration6 {

    private static RemoteOutputAPIAcronisObservable observable = new RemoteOutputAPIAcronisObservable();

    public static void run(List<DataAPI> data) {
        observable.addObserver(new MonitorFR());
        observable.addObserver(new MonitorSE());
        observable.addObserver(new MonitorUK());
        observable.addObserver(new MonitorUS());

        data.forEach(dataAPI -> observable.setOutputData(dataAPI));
    }

}
