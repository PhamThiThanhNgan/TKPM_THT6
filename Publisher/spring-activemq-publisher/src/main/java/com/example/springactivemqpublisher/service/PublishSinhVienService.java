package com.example.springactivemqpublisher.service;

import com.example.springactivemqpublisher.config.ActiveMQConfiguration;
import com.example.springactivemqpublisher.model.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublishSinhVienService {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void publishSinhVien(String maSV, String tenSV, String lop){
        SinhVien sinhVien = new SinhVien(maSV, tenSV, lop);
        jmsTemplate.convertAndSend(ActiveMQConfiguration.SINHVIEN_TOPIC, sinhVien);
    }
}
