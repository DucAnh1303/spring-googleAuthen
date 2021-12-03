package com.google.service;

import com.google.dto.UserLoginResponse;
import com.google.utils.AppUtils;
import org.springframework.stereotype.Service;
import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;

@Service
public class QrCodeService implements QrCodeImpl {
    private static final int ORDER_QR_CODE_SIZE_WIDTH = 200;
    private static final int ORDER_QR_CODE_SIZE_HIGH = 200;

    @Override
    public String generateQrCode(UserLoginResponse login) {

        String prettyData = AppUtils.prettyObject(login);
        String qrCode = AppUtils.generateQrCode(prettyData, ORDER_QR_CODE_SIZE_WIDTH, ORDER_QR_CODE_SIZE_HIGH);
        return qrCode;
    }




}
