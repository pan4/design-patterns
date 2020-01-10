package com.gof.iteration1.holder;

import com.gof.customer.RemoteOutputAPI;

public final class RemoteOutputAPISingleton extends RemoteOutputAPI {

    private RemoteOutputAPISingleton() {
        if (HelperHolder.INSTANCE != null) {
            throw new IllegalStateException("You shall not pass");
        }
    }

    public static RemoteOutputAPISingleton getInstance() {
        return HelperHolder.INSTANCE;
    }

    private static class HelperHolder {
        private static final RemoteOutputAPISingleton INSTANCE = new RemoteOutputAPISingleton();
    }
}
