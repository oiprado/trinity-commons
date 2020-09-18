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
public class Option {

    private Integer id;
    private String name;
    private String url;
    private String icon;
    private boolean external;
    private boolean active;

    public Option() {
    }

    public Option(Integer id, String name, String url, String icon, boolean external, boolean active) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.icon = icon;
        this.external = external;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    
}
