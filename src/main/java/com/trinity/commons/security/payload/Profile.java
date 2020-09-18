/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.commons.security.payload;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oiprado
 */
public class Profile {

    private Integer id;
    private String name;
    private boolean active;
    private boolean actionCreate;
    private boolean actionUpdate;
    private boolean actionRemove;
    private boolean actionRead;

    public Profile() {
    }

    public Profile(Integer id, String name, boolean active, boolean actionCreate, boolean actionUpdate, boolean actionRemove, boolean actionRead) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.actionCreate = actionCreate;
        this.actionUpdate = actionUpdate;
        this.actionRemove = actionRemove;
        this.actionRead = actionRead;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActionCreate() {
        return actionCreate;
    }

    public void setActionCreate(boolean actionCreate) {
        this.actionCreate = actionCreate;
    }

    public boolean isActionUpdate() {
        return actionUpdate;
    }

    public void setActionUpdate(boolean actionUpdate) {
        this.actionUpdate = actionUpdate;
    }

    public boolean isActionRemove() {
        return actionRemove;
    }

    public void setActionRemove(boolean actionRemove) {
        this.actionRemove = actionRemove;
    }

    public boolean isActionRead() {
        return actionRead;
    }

    public void setActionRead(boolean actionRead) {
        this.actionRead = actionRead;
    }

    
    public List<String> toAuthorized() {

        List<String> authorize = new ArrayList<>();

        if (actionCreate) {
            authorize.add(String.format("%s_%s", name.toUpperCase(), "CREATE"));
        }

        if (actionUpdate) {
            authorize.add(String.format("%s_%s", name.toUpperCase(), "EDIT"));
        }

        if (actionRemove) {
            authorize.add(String.format("%s_%s", name.toUpperCase(), "REMOVE"));
        }

        if (actionRead) {
            authorize.add(String.format("%s_%s", name.toUpperCase(), "READ"));
        }

        return authorize;

    }

}
