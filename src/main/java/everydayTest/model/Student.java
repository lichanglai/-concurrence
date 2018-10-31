package everydayTest.model;

/**
 * @program: test
 * @Date: 2018/10/26 10:55
 * @Author: lichanglai
 * @Description:
 */
public class Student {
    private  String userName;
    private  int id;
    private String password;
    private  String zhandian;
    private  int age;
    private  long c;

    public Student(Integer id, String userName, String password, Integer age, long c) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.c = c;
    }

    public Student(Integer id, String userName, String password, Integer age, String zhandian) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.zhandian = zhandian;
    }

    public String getZhandian() {
        return zhandian;
    }

    public void setZhandian(String zhandian) {
        this.zhandian = zhandian;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
    }
}
