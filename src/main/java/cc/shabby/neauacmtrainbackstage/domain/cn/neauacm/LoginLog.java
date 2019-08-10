package cc.shabby.neauacmtrainbackstage.domain.cn.neauacm;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.ref.SoftReference;
import java.util.Date;

@Entity
@Table(name = "loginlog")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class LoginLog {

    @Id
    private String userId;
    @Column(name = "password")
    private String logData;
    private String ip;
    private Date time;

}
