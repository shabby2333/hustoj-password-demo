package cc.shabby.neauacmtrainbackstage.domain.cn.neauacm;

import cc.shabby.neauacmtrainbackstage.domain.cn.neauacm.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 权限 实体类
 * @author 13089
 */
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@IdClass(Privilege.class)
public class Privilege implements Serializable {

    @Id
    private String userId;
    @Id
    private String rightstr;
    @Id
    private String defunct;

}
