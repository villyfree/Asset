package com.Device1.Asset.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class users {


    private String vorname;
    private String nachname;
    private String abteilung;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long MitabeiterId;
    //@JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usr")
    private List<device> devices;
    //private device deviceId;

    public users() {
    }

    public users(String vorname, String nachname, String abteilung) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.abteilung = abteilung;



    }
    /*
    public users(String vorname, String nachname, String abteilung ) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.abteilung = abteilung;
      //  this.devices = devices;
*/



    @Override
    public String toString() {
        return "users{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", abteilung='" + abteilung + '\'' +
                ", MitabeiterId=" + MitabeiterId +
                ", devices=" + devices +
                '}';
    }
//@JsonIgnore
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    //private List<device> devices;
    //Getter and setter


    private List<device> getDevices(){
        return devices;
    }
    public void setDevices(List<device> devices){
        this.devices = devices;

    }

    public Long getMitabeiterId() {
        return MitabeiterId;
    }

    public void setMitabeiterId(Long MitabeiterId) {
        this.MitabeiterId = MitabeiterId;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
       this.abteilung  = abteilung;
    }
}
