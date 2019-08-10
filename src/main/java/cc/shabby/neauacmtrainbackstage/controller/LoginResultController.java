package cc.shabby.neauacmtrainbackstage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginResultController {

    @RequestMapping("/login_success")
    public String loginSuccess(){
        return "login~!";
    }

}
