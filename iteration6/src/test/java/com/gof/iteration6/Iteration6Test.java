package com.gof.iteration6;

import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import com.gof.customer.monitors.MonitorFR;
import com.gof.customer.monitors.MonitorSE;
import com.gof.customer.monitors.MonitorUK;
import com.gof.customer.monitors.MonitorUS;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Iteration6Test {

    private Channel2 channel2 = new Channel2();

    @Test
    public void testRun() {
        Iteration6.run(channel2.getDataAPI());
    }

    @Test
    public void testRemoteOutputAPIAcronisObservable() {
        RemoteOutputAPIAcronisObservable observable = new RemoteOutputAPIAcronisObservable();
        MonitorFR mockFR = mock(MonitorFR.class);
        MonitorSE mockSE = mock(MonitorSE.class);
        MonitorUK mockUK = mock(MonitorUK.class);
        MonitorUS mockUS = mock(MonitorUS.class);
        observable.addObserver(mockFR);
        observable.addObserver(mockSE);
        observable.addObserver(mockUK);
        observable.addObserver(mockUS);

        List<DataAPI> data = channel2.getDataAPI();
        data.forEach(dataAPI -> observable.setOutputData(dataAPI));

        data.forEach(dataAPI -> {
            String concat = dataAPI.getDataFX()
                    .concat(dataAPI.getDataMX())
                    .concat(dataAPI.getDataSX())
                    .concat(dataAPI.getDataBX());
            verify(mockFR).showMessage(concat);
            verify(mockSE).showMessage(concat);
            verify(mockUK).showMessage(concat);
            verify(mockUS).showMessage(concat);
        });
    }
}