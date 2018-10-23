package everydayTest;


/**
 * @program: 聚餐业务
 * @Date: 2018/8/25 13:38
 * @Author: lichanglai
 * @Description:
 */
public class CyclicBarrierDome {

    public static void main(String[] args) {

        String sb = "http://47.88.20.96/img/hefei/201808/HSQ/OS/ZH-SH-OS-0036/WISH/ZH-SH-OS-0036-N5.jpg";

        String sss  = "";

        sss = sb.substring(sb.indexOf("//")+2 , sb.length());
        System.out.println(sss);
        sss = sss.substring(0 , sss.indexOf("/"));


        System.out.println(sss);

        String ddd = sb.replace(sss,"213123123123123");
        System.out.println(ddd);
    }
}
