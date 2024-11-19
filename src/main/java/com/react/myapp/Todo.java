package com.react.myapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Todo {

    private Number id;
    private String todo;
    private String desc;
    private boolean done;
}
