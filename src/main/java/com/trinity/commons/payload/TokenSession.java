package com.trinity.commons.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenSession {
    private String token;
    private String error;
    private Date timestamp;

    private TokenSession(String token, String error, Date timestamp) {
        this.token = token;
        this.error = error;
        this.timestamp = timestamp;
    }

    public static TokenSession ok(String token){
        return new TokenSession(token, null, new Date());
    }

    public static TokenSession generate(){
        return new TokenSession(UUID.randomUUID().toString(), null, new Date());
    }

    public static TokenSession error(String error){
        return new TokenSession(null, error, new Date());
    }

}
