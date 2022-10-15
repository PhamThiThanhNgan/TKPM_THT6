package com.example.springactivemqpublisher.controller;

import com.example.springactivemqpublisher.service.PublishSinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PublisherController {
    @Autowired
    private PublishSinhVienService sinhVienService;

    @PostMapping(path = "/guisinhvien/{masv}/{tensv}/{lop}")
    public String publishSinhVien(@RequestParam("masv") String maSV, @RequestParam("tensv") String tenSV, @RequestParam("lop") String lop){
        sinhVienService.publishSinhVien(maSV, tenSV, lop);
        return "Publish successfull";
    }
}
