package com.google.service;

import com.google.dto.UserLoginResponse;

public interface QrCodeImpl {
    String generateQrCode(UserLoginResponse login);
}
