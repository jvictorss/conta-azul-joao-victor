package com.mars.exception.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

    private int codigoStatus;
    private String status;
    private String message;

    public ErrorResponse(int codigoStatus, String status, String message){
        this.codigoStatus = codigoStatus;
        this.message = message;
        this.status = status;
    }
}
