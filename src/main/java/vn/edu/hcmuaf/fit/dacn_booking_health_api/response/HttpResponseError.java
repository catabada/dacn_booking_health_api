package vn.edu.hcmuaf.fit.dacn_booking_health_api.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class HttpResponseError extends HttpResponse{
    private String message;

    public static HttpResponseError error(HttpStatus status, int statusCode, String message) {
        return HttpResponseError.builder()
                .status(status).statusCode(statusCode).success(true).message(message).build();
    }
}
