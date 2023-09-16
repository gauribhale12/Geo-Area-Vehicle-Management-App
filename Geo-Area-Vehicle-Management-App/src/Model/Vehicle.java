/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gauri
 */
public class Vehicle {
    private boolean avail;
    private String compname;
    private int manfyear;
    private int seats;
    private String serialno;
    private String modelno;
    private boolean uberaff;
    private String updatedt;
    private String city;
    private String expcert;

    public boolean isAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public int getManfyear() {
        return manfyear;
    }

    public void setManfyear(int manfyear) {
        this.manfyear = manfyear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public boolean isUberaff() {
        return uberaff;
    }

    public void setUberaff(boolean uberaff) {
        this.uberaff = uberaff;
    }

    public String getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(String updatedt) {
        this.updatedt = updatedt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExpcert() {
        return expcert;
    }

    public void setExpcert(String expcert) {
        this.expcert = expcert;
    }
    
    
    
}
