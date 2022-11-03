package com.Device1.Asset.controller;

import com.Device1.Asset.entity.device;
import com.Device1.Asset.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class deviceController {

    @Autowired
    private DeviceService deviceservice;

    @PostMapping("/device")
    public device saveDevice(@RequestBody device device){


        return deviceservice.saveDevice(device);
    }
    @GetMapping("/devices")
    public List<device> fetchDeviceList(){

        return deviceservice.fetchDeviceList();
    }
    @GetMapping("/device/{deviceId}")
    public device fetchDevice(@PathVariable ("deviceId") Long deviceId ){
        return deviceservice.fetchDevice(deviceId);

    }



}
