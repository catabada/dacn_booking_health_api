package vn.edu.hcmuaf.fit.dacn_booking_health_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponse;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponseError;

@ControllerAdvice

public class GlobalException {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<HttpResponse> handleException(Exception e) {
        return ResponseEntity.badRequest().body(HttpResponseError.error(
                HttpStatus.BAD_REQUEST,
                HttpStatus.BAD_REQUEST.value(),
                e.getMessage()
        ));
    }

}
