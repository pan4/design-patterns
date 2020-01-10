package com.gof.iteration1.doublecheck;

import com.gof.customer.RemoteOutputAPI;

public class RemoteOutputAPISingleton extends RemoteOutputAPI {

    private static volatile RemoteOutputAPISingleton instance;

    private RemoteOutputAPISingleton() {
        if (instance != null) {
            throw new IllegalStateException("You shall not pass");
        }
    }

    public static RemoteOutputAPISingleton getInstance(){
        RemoteOutputAPISingleton result = instance;
        if(result == null){
            synchronized (RemoteOutputAPISingleton.class){
                result = instance;
                if(result == null){
                    instance = result = new RemoteOutputAPISingleton();
                }
            }
        }
        return result;
    }
}
