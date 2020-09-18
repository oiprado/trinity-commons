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
public class RequestOption {
    
    private Role role;
    private Menu menu;
    private Option option;

    public RequestOption() {
    }

    public RequestOption(Role role, Menu menu, Option option) {
        this.role = role;
        this.menu = menu;
        this.option = option;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
    
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
    
}
