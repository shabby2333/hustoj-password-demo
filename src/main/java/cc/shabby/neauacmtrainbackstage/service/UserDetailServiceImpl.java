package cc.shabby.neauacmtrainbackstage.service;

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
    @Autowired
    UserJpa userJpa;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = userJpa.findById(username);
        return user.orElse(null);
    }

}
