package cc.shabby.neauacmtrainbackstage.dao.user;

import cc.shabby.neauacmtrainbackstage.NeauacmTrainBackstageApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest(classes = NeauacmTrainBackstageApplication.class)
@RunWith(SpringRunner.class)
public class UserJpaTest {

    @Autowired
    UserJpa userJpa;

    @Test
    public void findOne(){
        System.out.println(userJpa.findAll());
        System.out.println(userJpa.findById("neau_admin"));
    }
}