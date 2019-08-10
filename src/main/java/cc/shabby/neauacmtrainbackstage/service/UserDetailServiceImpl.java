package cc.shabby.neauacmtrainbackstage.service;

import cc.shabby.neauacmtrainbackstage.dao.user.LoginLogJpa;
import cc.shabby.neauacmtrainbackstage.dao.user.PrivilegeJpa;
import cc.shabby.neauacmtrainbackstage.dao.user.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author 13089
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    private final UserJpa userJpa;

    @Autowired
    public UserDetailServiceImpl(UserJpa userJpa) {
        this.userJpa = userJpa;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = userJpa.findById(username);
        if(user.isEmpty()) {
            throw new UsernameNotFoundException("User Not Found, Please Register");
        }
        return user.get();
    }



}
