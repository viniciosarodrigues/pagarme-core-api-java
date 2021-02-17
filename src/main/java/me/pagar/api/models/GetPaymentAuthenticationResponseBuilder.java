/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetPaymentAuthenticationResponseBuilder {
    //the instance to build
    private GetPaymentAuthenticationResponse getPaymentAuthenticationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetPaymentAuthenticationResponseBuilder() {
        getPaymentAuthenticationResponse = new GetPaymentAuthenticationResponse();
    }

    public GetPaymentAuthenticationResponseBuilder type(String type) {
        getPaymentAuthenticationResponse.setType(type);
        return this;
    }

    /**
     * 3D-S payment authentication response
     */
    public GetPaymentAuthenticationResponseBuilder threedSecure(GetThreeDSecureResponse threedSecure) {
        getPaymentAuthenticationResponse.setThreedSecure(threedSecure);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetPaymentAuthenticationResponse build() {
        return getPaymentAuthenticationResponse;
    }
}