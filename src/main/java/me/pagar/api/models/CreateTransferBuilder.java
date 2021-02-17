/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CreateTransferBuilder {
    //the instance to build
    private CreateTransfer createTransfer;

    /**
     * Default constructor to initialize the instance
     */
    public CreateTransferBuilder() {
        createTransfer = new CreateTransfer();
    }

    public CreateTransferBuilder amount(int amount) {
        createTransfer.setAmount(amount);
        return this;
    }

    public CreateTransferBuilder sourceId(String sourceId) {
        createTransfer.setSourceId(sourceId);
        return this;
    }

    public CreateTransferBuilder targetId(String targetId) {
        createTransfer.setTargetId(targetId);
        return this;
    }

    public CreateTransferBuilder metadata(List<String> metadata) {
        createTransfer.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateTransfer build() {
        return createTransfer;
    }
}