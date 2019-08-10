package cc.shabby.neauacmtrainbackstage.dao.user;

import cc.shabby.neauacmtrainbackstage.domain.cn.neauacm.LoginLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Shabby
 */
@Repository
public interface LoginLogJpa extends JpaRepository<LoginLog, String> {
    List<LoginLog> findAllByUserIdAndLogData(String userId, String logData);
}
