package com.example.testrestservice.model;

import lombok.Builder;
import lombok.Data;
import org.apache.tomcat.jni.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Data
@Builder
public class Response {

    private String uid;
    private String operationUid;
    private String systemTime;
    private String code;
    private String errorCode;
    private String errorMessage;


}
