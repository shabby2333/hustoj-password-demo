package cc.shabby.neauacmtrainbackstage.dao.user;

import cc.shabby.neauacmtrainbackstage.domain.cn.neauacm.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpa extends JpaRepository<User, String> {
    
}
