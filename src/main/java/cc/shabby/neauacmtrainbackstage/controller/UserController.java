package cc.shabby.neauacmtrainbackstage.controller;

import cc.shabby.neauacmtrainbackstage.dao.user.UserJpa;
import cc.shabby.neauacmtrainbackstage.domain.cn.neauacm.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class UserController {
    private final UserJpa userJpa;

    @Autowired
    public UserController(UserJpa userJpa) {
        this.userJpa = userJpa;
    }

    @RequestMapping("/users")
    @Transactional
    public List<User> getAllUsers(){
        return userJpa.findAll();
    }
}
