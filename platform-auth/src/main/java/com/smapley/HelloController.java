package com.smapley;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by EricNts on 2017/8/30.
 */
@RestController
public class HelloController {

    @Value("${eureka.client.service-url.defaultZone}")
    private String url;

    @GetMapping("hello")
    private String hello(){
        return url;
    }
}
