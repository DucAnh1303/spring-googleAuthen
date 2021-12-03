package com.google.controller;

import com.google.dto.UserLoginResponse;
import com.google.service.QrCodeService;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private QrCodeService qrCodeService;

    @GetMapping(value = "code")
    public String getQrCode() {
        return null;
    }

    @PostMapping(value = "Qr-code")
    public String generateQRCode(
            @RequestBody UserLoginResponse login
    ) {
        return qrCodeService.generateQrCode(login);
    }
}
