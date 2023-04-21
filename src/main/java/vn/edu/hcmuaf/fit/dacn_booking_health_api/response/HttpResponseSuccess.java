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
public class HttpResponseSuccess extends HttpResponse{
    private Object data;

    public static HttpResponseSuccess success(Object data) {
        return HttpResponseSuccess.builder().status(HttpStatus.OK).statusCode(HttpStatus.OK.value()).success(true).data(data).build();
    }
}
