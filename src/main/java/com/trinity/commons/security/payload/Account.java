/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.commons.security.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author oiprado
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {
    
    private Integer id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean credentialsExpired;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean enabled;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean locked;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date credentialsExpiredDate;
    private AccountInfo userInfo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Role> roleUser;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Profile> userProfile;

}
