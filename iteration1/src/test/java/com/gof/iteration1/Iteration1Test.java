package com.gof.iteration1;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

public class Iteration1Test  {

    @Test
    public void testRun() {
        Iteration1.run();
    }

    @Test
    public void testOneInstance() {
        RemoteOutputAPISingleton instance1 = RemoteOutputAPISingleton.getInstance();
        RemoteOutputAPISingleton instance2 = RemoteOutputAPISingleton.getInstance();

        assertEquals(instance1, instance2);
    }

    @Test(expected = InvocationTargetException.class)
    public void testProtectionFromReflection() throws Exception {
        Constructor<RemoteOutputAPISingleton> declaredConstructor =
                RemoteOutputAPISingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        RemoteOutputAPISingleton instance1 = declaredConstructor.newInstance();
        RemoteOutputAPISingleton instance2 = RemoteOutputAPISingleton.getInstance();
        assertEquals(instance1, instance2);
    }
}