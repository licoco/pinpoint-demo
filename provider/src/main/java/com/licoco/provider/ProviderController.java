package com.licoco.provider;

;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProviderController {


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        log.info("start>>>");
        log.info("provider add param > a:{},b:{}", a, b);
        return a + b;
    }

    @RequestMapping(value = "/square", method = RequestMethod.GET)
    public Integer square(@RequestParam("a") Integer a) {
        log.info("provider square param > a:{}", a);
        return a * a;
    }

}
