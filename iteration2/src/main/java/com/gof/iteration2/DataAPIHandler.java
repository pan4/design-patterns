package com.gof.iteration2;

public abstract class DataAPIHandler {
    private DataAPIHandler next;

    public DataAPIHandler(DataAPIHandler next) {
        this.next = next;
    }

    public final DataAPIRequest handle(DataAPIRequest dataAPIRequest) {
        handleInternal(dataAPIRequest);
        if (!dataAPIRequest.isHandled() && next != null) {
            next.handle(dataAPIRequest);
        }
        return dataAPIRequest;
    }

    protected abstract DataAPIRequest handleInternal(DataAPIRequest dataAPI);
}
