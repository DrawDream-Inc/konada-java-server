package com.konada.Konada.response;

import lombok.Getter;

@Getter
public class CommonResponse {
    boolean success;
    int status;
    String message;
}
