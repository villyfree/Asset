package com.Device1.Asset.service;

import com.Device1.Asset.entity.device;
import com.Device1.Asset.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeviceServiceImpl  implements DeviceService{

    @Autowired
    private DeviceRepository devicerepository;


    @Override
    public device saveDevice(device device) {

        return devicerepository.save(device);
        }

    @Override
    public List<device> fetchDeviceList() {
        return devicerepository.findAll();

    }

    @Override
    public device fetchDevice(Long deviceId) {
        return devicerepository.findById(deviceId).orElseThrow();
    }







}
