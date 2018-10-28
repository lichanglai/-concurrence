package model;

/**
 * @program: test
 * @Date: 2018/10/26 10:55
 * @Author: lichanglai
 * @Description:
 */
public class Student  {
    private  String name;
    private  int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
