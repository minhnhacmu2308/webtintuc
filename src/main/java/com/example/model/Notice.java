package com.example.model;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Notice {
    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Notice(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Notice() {
    }

    @Override
    public String toString() {
        return "Notice{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}
