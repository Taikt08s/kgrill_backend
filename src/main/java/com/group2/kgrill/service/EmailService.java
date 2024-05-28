package com.group2.kgrill.service;

import com.group2.kgrill.enums.EmailTemplateName;
import jakarta.mail.MessagingException;

public interface EmailService {
     void sendEmail(
            String to,
            String username,
            EmailTemplateName emailTemplateName,
            String confirmationUrl,
            String activationCode,
            String subject
    ) throws MessagingException;
}