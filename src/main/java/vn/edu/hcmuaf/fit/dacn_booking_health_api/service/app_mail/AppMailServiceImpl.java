package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.app_mail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Appointment;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.exception.BadRequestException;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.infrastructure.AppMailSender;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

@Service
@Slf4j
public class AppMailServiceImpl implements AppMailService {
    @Value("${spring.mail.username}")
    private String username;

    private final AppMailSender appMailSender;

    private final SpringTemplateEngine templateEngine;

    @Autowired
    public AppMailServiceImpl(AppMailSender appMailSender, SpringTemplateEngine templateEngine) {
        this.appMailSender = appMailSender;
        this.templateEngine = templateEngine;
    }

    @Override
    @Async("threadPoolTaskExecutorForSendAppointmentEmail")
    @Transactional
    public void sendAppointmentEmail(Appointment appointment) throws BadRequestException {
        try {
            String birthDay = new SimpleDateFormat("dd/MM/yyyy").format(appointment.getPatient().getBirthDay());
            String appointmentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(appointment.getSchedule().getAppointmentDate());
            Context context = new Context();
            context.setVariable("name", appointment.getPatient().getName());
            context.setVariable("gender", appointment.getPatient().getIsMale() ? "Nam" : "Nữ");
            context.setVariable("birthDay", birthDay);
            context.setVariable("symptoms", appointment.getSymptoms());
            context.setVariable("doctor", appointment.getSchedule().getDoctor().getName());
            context.setVariable("specialist", appointment.getSchedule().getDoctor().getSpecialist().getName());
            context.setVariable("datetime", appointmentDate);

            String template = templateEngine.process("appointment", context);

            appMailSender.sendMail(username, appointment.getPatient().getEmail(), template, "Appointment", true);
        } catch (Exception e) {
            log.error("Send email booking ticket failed: " + e.getMessage());
            throw new BadRequestException("Không thể gửi email xác nhận đặt lịch khám");
        }
    }
}
