package cc.shabby.neauacmtrainbackstage.domain.cn.neauacm;

import cc.shabby.neauacmtrainbackstage.dao.user.LoginLogJpa;
import cc.shabby.neauacmtrainbackstage.dao.user.PrivilegeJpa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.*;

@Getter
@Setter
@ToString
@Entity
@Component
@Table(name = "users")
public class User implements UserDetails {


    @Id
    private String userId;
    private String email;
    private String defunct;
    private String ip;
    private Date accesstime;
    @JsonIgnore
    @JsonDeserialize
    private String password;
    private Date regTime;
    private String nick;
    private String school;

    @JsonIgnore
    @OneToMany(mappedBy = "userId",targetEntity = Privilege.class)
    private Set<Privilege> privileges;
    @JsonIgnore
    @OneToMany(mappedBy = "userId", targetEntity = LoginLog.class)
    private Set<LoginLog> loginLogs;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        getPrivileges().forEach(privilege -> authorities.add(new SimpleGrantedAuthority(String.format("ROLE_%s",privilege.getRightstr()))));
        return authorities;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @JsonIgnore
    @Override
    public String getUsername() {
        return userId;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return "A".equals(defunct);
    }
}
