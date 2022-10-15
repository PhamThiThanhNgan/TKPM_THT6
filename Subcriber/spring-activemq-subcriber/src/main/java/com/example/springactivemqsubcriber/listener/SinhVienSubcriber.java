package com.example.springactivemqsubcriber.listener;

import com.example.springactivemqsubcriber.config.ActiveMQConfiguration;
import com.example.springactivemqsubcriber.model.SinhVien;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class SinhVienSubcriber {
    private static final Logger log = LoggerFactory.getLogger(SinhVienSubcriber.class);

    @JmsListener(destination = ActiveMQConfiguration.SINHVIEN_TOPIC)
    public void receiveSinhVien(SinhVien sinhVien){
        log.info("Receive customer message: " + sinhVien.toString());
    }
}
