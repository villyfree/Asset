package com.Device1.Asset.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class device {

   //private final Long MitabeiterId;
    private String deviceType;
    private String deviceModell;
    private String deviceHersteller;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long deviceId;
    //private Long  MitabeiterId;



    //@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "mitabeiter_id" )
    @JoinColumn(name = "MitabeiterId" )
    //@JoinColumn(name = "_id" )
    @JsonBackReference
    private users usr;

    //Getter and setter

   public void setUser(users usr){
        this.usr = usr;
    }


    public users getUsr(){
        return usr;
    }



    @Override
    public String toString() {
        return "device{" +
                "deviceType='" + deviceType + '\'' +
                ", deviceModell='" + deviceModell + '\'' +
                ", deviceHersteller='" + deviceHersteller + '\'' +
                ", deviceId=" + deviceId +
                ", usr=" + usr +
                '}';
    }

public device(){

}


    public  device(String deviceType, String deviceModell, String deviceHersteller) {
       super();
        this.deviceType = deviceType;
        this.deviceModell = deviceModell;
        this.deviceHersteller = deviceHersteller;




    }

    public Long getDeviceId(long deviceId) {
        return this.deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;

    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceModell() {
        return deviceModell;
    }

    public void setDeviceModell(String deviceModell) {
        this.deviceModell = deviceModell;
    }

    public String getDeviceHersteller() {
        return deviceHersteller;
    }

    public void setDeviceHersteller(String deviceHersteller) {
        this.deviceHersteller = deviceHersteller;
    }
}
