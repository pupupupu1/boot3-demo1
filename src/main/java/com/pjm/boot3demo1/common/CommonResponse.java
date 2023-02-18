package com.pjm.boot3demo1.common;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.util.StringUtils;

@Data
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {
    private String code;
    private String msg;
    private T data;

    public CommonResponse(String code, String msg) {
        if (!StringUtils.isEmpty(code)) {
            this.code = code;
        }

        if (!StringUtils.isEmpty(msg)) {
            this.msg = msg;
        }

    }

    public CommonResponse(T data) {
        if (!StringUtils.isEmpty(data)) {
            this.data = data;
        }

    }
}
