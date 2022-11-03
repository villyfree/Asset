package com.Device1.Asset.service;

import com.Device1.Asset.entity.device;

import java.util.List;

public interface DeviceService {

    public  device saveDevice(device device);
    public List<device> fetchDeviceList();

    public device fetchDevice(Long deviceId);
}
