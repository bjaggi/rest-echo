package com.eva.controller;

import com.eva.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class EchoController {

@Autowired
private EchoService echoService;


    @RequestMapping("/")
    @ResponseBody
    String echo() {
        return echoService.getMessage();
    }

    @RequestMapping(method = RequestMethod.POST, value="/")
    @ResponseBody
    void setEcho(@RequestBody String inputStr) {
         echoService.setMessage(inputStr);
    }




}
