package com.licoco.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ConsumerController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/add")
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        log.info("consumer add param > a:{},b:{}", a, b);
        return providerService.add(a, b);
    }

    @RequestMapping(value = "/square", method = RequestMethod.GET)
    public Integer square(@RequestParam("a") Integer a) {
        log.info("consumer square param > a:{}", a);
        return providerService.square(a);
    }

}
