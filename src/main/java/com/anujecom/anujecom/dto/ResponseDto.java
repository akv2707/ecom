package com.anujecom.anujecom.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> {
    private String status;
    private String message;
    private T data;

    public ResponseDto(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
