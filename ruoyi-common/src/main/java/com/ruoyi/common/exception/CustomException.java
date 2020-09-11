package com.ruoyi.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 自定义异常
 *
 * @author ruoyi
 */
@AllArgsConstructor
@Getter
public class CustomException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final String message;

    private Integer code;

    public CustomException(String message) {
        this.message = message;
    }

    public CustomException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }
}
