package cc.shabby.neauacmtrainbackstage.dao.user;

import cc.shabby.neauacmtrainbackstage.domain.cn.neauacm.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Shabby
 */
@Repository
public interface PrivilegeJpa extends JpaRepository<Privilege,String> {
    List<Privilege> findAllByUserIdAndRightstr(String userId, String rightStr);
    List<Privilege> findAllByUserId(String userId);
    List<Privilege> findAllByUserIdAndDefunct(String userId, String defunct);
}
