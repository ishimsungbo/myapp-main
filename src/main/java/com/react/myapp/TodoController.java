package com.react.myapp;

import com.react.myapp.response.ListResponse;
import com.react.myapp.response.ResponseService;
import com.react.myapp.response.SingleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TodoController {

    private final ResponseService responseService;

    @RequestMapping("/api/todolist_long/gdhong")
    public ListResponse<Todo> getTodoList(){

        List todoList = new ArrayList<Todo>();

        for(int i=0; i < 10 ;i++){
            String numberTostring = String.valueOf(i);
            Todo todo = new Todo(i+1,"todo"+numberTostring,"desc" + numberTostring,true);
            todoList.add(todo);
        }

        return responseService.getListResponse(todoList);
    }

    @RequestMapping("/api/todolist_long/gdhong/{id}")
    public SingleResponse<Todo> getTodo(@PathVariable Number id){
        String vId = String.valueOf(id);
        Todo todo = new Todo(id,"todo"+ vId,"desc" +vId,true);
        return responseService.getSingleResponse(todo);
    }
}
