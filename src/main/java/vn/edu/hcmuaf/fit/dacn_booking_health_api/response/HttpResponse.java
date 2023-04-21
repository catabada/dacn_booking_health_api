package vn.edu.hcmuaf.fit.dacn_booking_health_api.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public abstract class HttpResponse {
    protected HttpStatus status;
    protected Boolean success;
    protected String message;
    protected int statusCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy HH:mm:ss", timezone = "Asia/Ho_Chi_Minh")
    private final ZonedDateTime timestamp = ZonedDateTime.now();

}
