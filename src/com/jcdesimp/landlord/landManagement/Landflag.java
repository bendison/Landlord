package com.jcdesimp.landlord.landManagement;

import org.bukkit.event.Listener;

/**
 * File created by jcdesimp on 4/11/14.
 */
public abstract class Landflag implements Listener {
    private String uniqueName = this.getClass().getSimpleName();
    private int permSlot;

    protected Landflag(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public int getPermSlot() {
        return permSlot;
    }

    public void setPermSlot(int permSlot) {
        this.permSlot = permSlot;
    }
}
