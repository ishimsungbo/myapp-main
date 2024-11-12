package com.react.myapp;

import com.react.myapp.response.ResponseService;
import com.react.myapp.response.SingleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    private final ResponseService responseService;

    @RequestMapping("/test")
    public String test(){
        return "리액트 공부용 스프링";
    }

    @RequestMapping("/rest_api/testApi")
    public String testApi(){
        log.info("Controller testApi call ---------------------------------");
        return "리액트 공부용 스프링 ===========";
    }

    @RequestMapping("/api/userinfo")
    public SingleResponse<String> demoWeb(){
        String user = "{\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"김재완\",\n" +
                "    \"username\": \"lastrites2018\",\n" +
                "    \"email\": \"jaewan@gmail.com\",\n" +
                "    \"phone\": \"02-879-5000\",\n" +
                "    \"website\": \"https://github.com/lastrites2018\",\n" +
                "    \"province\": \"\",\n" +
                "    \"city\": \"서울특별시\",\n" +
                "    \"district\": \"관악구\",\n" +
                "    \"street\": \"관악로 145\",\n" +
                "    \"zipcode\": \"08832\",\n" +
                "    \"createdAt\": \"2019-02-24T16:17:47.000Z\",\n" +
                "    \"updatedAt\": \"2019-02-24T16:17:47.000Z\"\n" +
                "  }";
        return responseService.getSingleResponse(user);
    }

    @RequestMapping("/api/demo-web2")
    public SingleResponse<String> demoWeb2(){
        return responseService.getSingleResponse("안녕하세요");
    }
}
