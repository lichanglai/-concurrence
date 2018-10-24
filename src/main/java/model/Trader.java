package model;

/**
 * @program: test
 * @Date: 2018/8/11 10:37
 * @Author: lichanglai
 * @Description:
 */
public class Trader {

    private final String name;
    private final String city;
    private String itemId;

    public Trader(String name, String city, String itemId) {
        this.name = name;
        this.city = city;
        this.itemId = itemId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }
}
