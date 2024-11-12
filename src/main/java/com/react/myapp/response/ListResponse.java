package com.react.myapp.response;

import java.util.List;
import lombok.Getter;

@Getter
public class ListResponse <T> extends CommonResponse {
    List<T> dataList;
}
