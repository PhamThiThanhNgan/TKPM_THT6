package com.example.springactivemqpublisher.listener;

import com.example.springactivemqpublisher.config.ActiveMQConfiguration;
import com.example.springactivemqpublisher.model.SinhVien;
import org.springframework.jms.annotation.JmsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SinhVienSubcriber {
    private static final Logger log = LoggerFactory.getLogger(SinhVienSubcriber.class);
    @JmsListener(destination = ActiveMQConfiguration.SINHVIEN_TOPIC)
    public void receiveSinhVien(SinhVien sinhVien){
        log.info("Received Customer message: " + sinhVien.toString());
    }
}
