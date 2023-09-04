package com.rpy.Alvin.p.DTO.responsedto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO<T> {

    private String status;
    private int statusCode;
    private T data;
    private String msg;
}
