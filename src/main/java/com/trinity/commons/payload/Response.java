package com.trinity.commons.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private boolean success;
    private String message;

    public Response(){

    }

    private Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public static Response ok(){
        return new Response(true, null);
    }

    public static Response error(String message){
        return  new Response(false, message);
    }


}
