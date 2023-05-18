package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.app_mail;

import jakarta.mail.MessagingException;
import org.springframework.scheduling.annotation.Async;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Appointment;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.exception.BadRequestException;

import java.io.IOException;

public interface AppMailService {

    @Async("threadPoolTaskExecutorForSendAppointmentEmail")
    void sendAppointmentEmail(Appointment appointment) throws MessagingException, IOException, BadRequestException;
}
