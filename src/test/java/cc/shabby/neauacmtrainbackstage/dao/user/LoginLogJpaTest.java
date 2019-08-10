package cc.shabby.neauacmtrainbackstage.dao.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LoginLogJpaTest {

    @Autowired
    LoginLogJpa loginLogJpa;

    @Test
    public void findAll(){
        System.out.println(loginLogJpa.findAll());
    }
}