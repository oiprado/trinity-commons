/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.commons.security.payload;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 *
 * @author oiprado
 */
public class Menu {
    
    private Integer id;
    private String name;
    private boolean active;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Option> options;

    public Menu() {
    }

    public Menu(Integer id, String name, boolean active) {
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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
