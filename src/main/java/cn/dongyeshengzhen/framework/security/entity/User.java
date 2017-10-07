package cn.dongyeshengzhen.framework.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 用户实体类，继承抽象安全实体类
 *
 * @author yuqs
 * @since 0.1
 */
@Entity
@Table(name = "user")
public class User extends SecurityEntity {
    private static final long serialVersionUID = 7446802057673100315L;
    //系统管理员账号类型
    public static final Integer TYPE_ADMIN = 0;
    //普通用户账号类型
    public static final Integer TYPE_GENERAL = 1;


    //登录用户名称
    private String username;
    //密码
    private String password;
    //明文密码
    //salt
    private String salt;
    //用户姓名
    private String fullname;

    @Column(name = "username", unique = true, nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "fullname", length = 100)
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static Integer getTypeAdmin() {
        return TYPE_ADMIN;
    }

    public static Integer getTypeGeneral() {
        return TYPE_GENERAL;
    }


    public void setSalt(String salt) {
        this.salt = salt;
    }

}
