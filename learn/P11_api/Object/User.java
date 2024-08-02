package learn.P11_api.Object;

import java.util.Arrays;

// User 用于演示对象克隆
// Cloneable
// 如果一个接口里面没有抽象方法
// 表示当前接口是一个标记性接口
// 即如果存在 Cloneable 则可被克隆

public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User(int id, String username, String password, int[] data, String path) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.data = data;
        this.path = path;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", path='" + path + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
