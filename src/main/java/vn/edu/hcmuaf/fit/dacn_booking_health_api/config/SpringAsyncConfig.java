package vn.edu.hcmuaf.fit.dacn_booking_health_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class SpringAsyncConfig {
    @Bean(name = "threadPoolTaskExecutorForSendAppointmentEmail")
    public TaskExecutor getTaskExecutorForSendAppointmentEmail() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(2);
        threadPoolTaskExecutor.setMaxPoolSize(10);
        return threadPoolTaskExecutor;
    }
}
