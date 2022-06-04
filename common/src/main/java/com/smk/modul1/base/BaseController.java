package com.smk.modul1.base;

import com.smk.modul1.base.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BaseController {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public BaseResponse<?>
    handleValidationError(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        FieldError fieldError = bindingResult.getFieldError();
        assert fieldError != null;
        String defaultMessage = fieldError.getDefaultMessage();
        return new BaseResponse<>(HttpStatus.BAD_REQUEST.value(),false,
                defaultMessage);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public BaseResponse<?>
    handleException(Exception ex) {
        return new BaseResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),false,
                ex.getMessage());
    }
}
