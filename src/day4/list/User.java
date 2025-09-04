package day4.list;

import java.util.Objects;

/**
 * @desc TODO
 * @author chenyi
 * @date 2025/9/4
 */
public class User {

    private String username;    //用户名
    private String password;    //密码

    public User() {
    }

    //构造方法
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //getter方法
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //setter方法
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    //重写hashCode方法
    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    //重写toString方法
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + "****" + '\'' +  // 密码不直接显示
                '}';
    }

}
