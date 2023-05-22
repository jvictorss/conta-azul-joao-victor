package com.mars.exception;

import com.mars.exception.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidEntryException.class)
    public ResponseEntity<ErrorResponse> handleInvalidEntryException(InvalidEntryException invalidEntryException) {
        int codigoHttp = HttpStatus.BAD_REQUEST.value();
        String descricaoStatus = HttpStatus.BAD_REQUEST.getReasonPhrase();

        ErrorResponse erroResponse = new ErrorResponse(codigoHttp, descricaoStatus, invalidEntryException.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erroResponse);
    }

    @ExceptionHandler(InvalidMoveException.class)
    public ResponseEntity<ErrorResponse> handleInvalidMoveException(InvalidMoveException invalidMoveException) {
        int codigoHttp = HttpStatus.BAD_REQUEST.value();
        String descricaoStatus = HttpStatus.BAD_REQUEST.getReasonPhrase();

        ErrorResponse erroResponse = new ErrorResponse(codigoHttp, descricaoStatus, invalidMoveException.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erroResponse);
    }
}
