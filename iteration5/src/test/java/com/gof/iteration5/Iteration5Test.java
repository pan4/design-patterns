package com.gof.iteration5;

import com.gof.customer.RemoteOutputAPIAcronis;
import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.verify;

@PrepareForTest({RemoteOutputAPIAcronis.class})
@RunWith(PowerMockRunner.class)
public class Iteration5Test {

    @Mock
    private DataAPI dataAPIMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRun() {
        Channel2 channel2 = new Channel2();
        Iteration5.run(channel2.getDataAPI());
    }

    @Test
    public void testRemoteOutputAPIAcronisFacade() {
        RemoteOutputAPIAcronisFacade acronisFacade = new RemoteOutputAPIAcronisFacade();
        PowerMockito.mockStatic(RemoteOutputAPIAcronis.class);

        acronisFacade.setOutputData(dataAPIMock);

        verify(dataAPIMock).getDataFX();
        verify(dataAPIMock).getDataMX();
        verify(dataAPIMock).getDataSX();
        verify(dataAPIMock).getDataBX();

        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.initSystem();
        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.preparingConnection();
        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.connect();
        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.sendMX(dataAPIMock.getDataMX());
        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.sendSX(dataAPIMock.getDataSX());
        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.sendBX(dataAPIMock.getDataBX());
        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.sendFX(dataAPIMock.getDataFX());
        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.stopSystem();
        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.checkErrors();
        PowerMockito.verifyStatic(RemoteOutputAPIAcronis.class);
        RemoteOutputAPIAcronis.disconnect();
    }
}