package com.react.myapp.response;
import lombok.Getter;

@Getter
public class SingleResponse<T> extends CommonResponse {
    T data;
}
