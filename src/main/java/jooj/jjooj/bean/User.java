package jooj.jjooj.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "n_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private  Integer u_id;
    private  String uname;
    private Integer  age;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }
}
