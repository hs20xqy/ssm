package com.test;

import org.springframework.stereotype.Service;

/**
 * Created by hs on 2016/12/8.
 */
//@Service
public class MessageServiceImpl implements MessageService {
    public String getMessage() {
        return "Hello World!";
    }
}
