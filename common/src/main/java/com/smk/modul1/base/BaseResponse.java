package com.smk.modul1.base;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private int status;
    private boolean success;
    private String message;
    private T data;

    public BaseResponse(int status, boolean success, String message) {
        this.status = status;
        this.success = success;
        this.message = message;
        this.data = null;
    }

    public BaseResponse(T data) {
        this.status = 200;
        this.success = true;
        this.message = "Success";
        this.data = data;
    }
}
