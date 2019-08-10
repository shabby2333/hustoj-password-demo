package cc.shabby.neauacmtrainbackstage.config;

import cc.shabby.neauacmtrainbackstage.Util.HustPasswordUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author 13089
 */
@Component
public class HustPasswordEncoder implements PasswordEncoder {
    private static final Logger logger = LoggerFactory.getLogger(HustPasswordEncoder.class);

    @Override
    public String encode(CharSequence charSequence) {
        logger.info("encode:" + charSequence);
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        logger.info("matches:{ rawPassword: "+rawPassword + ", savedPassword: "+encodedPassword  +"}");
        return HustPasswordUtil.pwCheck(rawPassword.toString(),encodedPassword);
    }

}
