package cc.shabby.neauacmtrainbackstage.service;

import cc.shabby.neauacmtrainbackstage.dao.user.UserJpa;
import cc.shabby.neauacmtrainbackstage.domain.cn.neauacm.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDetailServiceImplTest {

    @Autowired
    UserDetailServiceImpl userDetailsService;

    @Test
    public void loadUserByUsername() {
        var detail = userDetailsService.loadUserByUsername("neau_admin");

        System.out.println(detail.isEnabled());
    }
}