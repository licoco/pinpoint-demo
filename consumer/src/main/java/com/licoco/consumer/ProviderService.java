package com.licoco.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "licoco-provider")
public interface ProviderService {

    @RequestMapping(
            value = {"/add"},
            method = {RequestMethod.GET}
    )
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

    @RequestMapping(
            value = {"/square"},
            method = {RequestMethod.GET}
    )
    Integer square(@RequestParam("a") Integer a);
}
