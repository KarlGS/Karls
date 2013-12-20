/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.hellomvc.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author apprentice
 */
@Controller
public class HelloController {
    @RequestMapping({"/","/hello"})
    public String sayHi(Map<String,Object>model){
        model.put("message","Hello from the controller.");
        return "hello";
    }
    
}
