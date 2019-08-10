package cc.shabby.neauacmtrainbackstage.dao.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "privilege")
@Entity
@Getter
@Setter
@ToString
public class Privilege {

    private String userId;
    private String rightstr;
    private char defunct;


}
