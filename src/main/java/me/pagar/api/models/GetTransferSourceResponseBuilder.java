/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetTransferSourceResponseBuilder {
    //the instance to build
    private GetTransferSourceResponse getTransferSourceResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetTransferSourceResponseBuilder() {
        getTransferSourceResponse = new GetTransferSourceResponse();
    }

    public GetTransferSourceResponseBuilder sourceId(String sourceId) {
        getTransferSourceResponse.setSourceId(sourceId);
        return this;
    }

    public GetTransferSourceResponseBuilder type(String type) {
        getTransferSourceResponse.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTransferSourceResponse build() {
        return getTransferSourceResponse;
    }
}