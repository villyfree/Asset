package com.Device1.Asset.repository;

import com.Device1.Asset.entity.device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeviceRepository  extends JpaRepository <device, Long> {





}
