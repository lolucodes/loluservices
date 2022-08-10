package com.lolucode.notification;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerEmail,
        String message,
        String toCustomerName
) {
}
