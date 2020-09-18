/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.commons.security.payload;

/**
 *
 * @author oiprado
 */
public class Group {
    
    private Integer id;
    private String name;
    private Boolean active;

    public Group() {
    }

    public Group(Integer id, String name, Boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

                
}
