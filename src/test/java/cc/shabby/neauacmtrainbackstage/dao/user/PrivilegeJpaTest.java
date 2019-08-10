package cc.shabby.neauacmtrainbackstage.dao.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PrivilegeJpaTest {

    @Autowired
    PrivilegeJpa privilegeJpa;

    @Test
    public void findAll(){
        System.out.println(privilegeJpa.findAll());
    }

    @Test
    public void findAllByUserIdAndRightstr(){
        var all = privilegeJpa.findAll();
        var wyh = privilegeJpa.findAllByUserId("wangyuhan");
        var admin = privilegeJpa.findAllByUserIdAndRightstr("neau_admin","neauoj");
       var adminn = privilegeJpa.findAllByUserIdAndDefunct("neau_admin","N");
        System.out.println();
    }
}