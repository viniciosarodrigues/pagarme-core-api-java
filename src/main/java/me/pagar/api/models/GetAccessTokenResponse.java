/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import me.pagar.api.DateTimeHelper;
import org.joda.time.DateTime;

@JsonInclude(Include.ALWAYS)
public class GetAccessTokenResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4206722850369089623L;
    private String id;
    private String code;
    private String status;
    private DateTime createdAt;
    private GetCustomerResponse customer;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt (DateTime value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customer")
    public GetCustomerResponse getCustomer ( ) { 
        return this.customer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customer")
    public void setCustomer (GetCustomerResponse value) { 
        this.customer = value;
    }
 
}
