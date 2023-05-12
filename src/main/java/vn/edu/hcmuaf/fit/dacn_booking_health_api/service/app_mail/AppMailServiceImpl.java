package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.app_mail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Appointment;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.infrastructure.AppMailSender;

@Service
@Slf4j
public class AppMailServiceImpl implements AppMailService {
    @Value("${spring.mail.username}")
    private String username;

    private final AppMailSender appMailSender;

    @Autowired
    public AppMailServiceImpl(AppMailSender appMailSender) {
        this.appMailSender = appMailSender;
    }

    @Override
    @Async("threadPoolTaskExecutorForSendAppointmentEmail")
    @Transactional
    public void sendAppointmentEmail(Appointment appointment) {
        boolean success = sendEmail(appointment.getPatient().getEmail(), appointment.getId());

    }

    private boolean sendEmail(String email, Long appointmentId) {
        try {
            appMailSender.sendMail(username, email, String.valueOf(appointmentId), "Appointment", true);
            return true;
        } catch (Exception e) {
            log.error("Send verify email failed: " + e.getMessage());
            return false;
        }
    }
}
