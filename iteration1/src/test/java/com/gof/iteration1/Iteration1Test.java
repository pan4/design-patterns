package com.gof.iteration1;

import com.gof.customer.RemoteOutputAPI;
import com.gof.iteration1.doublecheck.RemoteOutputAPISingleton;
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
        RemoteOutputAPI instance1 = com.gof.iteration1.holder.RemoteOutputAPISingleton.getInstance();
        RemoteOutputAPI instance2 = com.gof.iteration1.holder.RemoteOutputAPISingleton.getInstance();

        assertEquals(instance1, instance2);
    }

    @Test
    public void testDoubleCheckOneInstance() {
        RemoteOutputAPI instance1 = RemoteOutputAPISingleton.getInstance();
        RemoteOutputAPI instance2 = RemoteOutputAPISingleton.getInstance();

        assertEquals(instance1, instance2);
    }

    @Test(expected = InvocationTargetException.class)
    public void testProtectionFromReflection() throws Exception {
        Constructor<com.gof.iteration1.holder.RemoteOutputAPISingleton> declaredConstructor =
                com.gof.iteration1.holder.RemoteOutputAPISingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        com.gof.iteration1.holder.RemoteOutputAPISingleton instance1 = declaredConstructor.newInstance();
        com.gof.iteration1.holder.RemoteOutputAPISingleton instance2 = com.gof.iteration1.holder.RemoteOutputAPISingleton.getInstance();
        assertEquals(instance1, instance2);
    }
}