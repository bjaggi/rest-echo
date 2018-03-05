package com.eva.service;


import com.eva.controller.EchoController;
import org.springframework.stereotype.Service;

@Service
public class EchoService {
    public static String message;

    public  String getMessage() {
        if(message == null || message.trim().isEmpty()){
            return "NOTHING SET IN ECHO SERVICE, PLEASE POST SOMETHING BEFORE DOING A GET!";
        }
        return message;
    }

    public  void setMessage(String inputMessage) {
        message = inputMessage;
    }

}
