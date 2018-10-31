package everydayTest;


import everydayTest.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 聚餐业务
 * @Date: 2018/8/25 13:38
 * @Author: lichanglai
 * @Description:
 */
public class CyclicBarrierDome {

    public static void main(String[] args) {

//          String sb = "http://47.88.20.96/img/hefei/201808/HSQ/OS/ZH-SH-OS-0036/WISH/ZH-SH-OS-0036-N5.jpg";
//
//        String sss  = "";
//
//        sss = sb.substring(sb.indexOf("//")+2 , sb.length());
//        System.out.println(sss);
//        sss = sss.substring(0 , sss.indexOf("/"));
//
//
//        System.out.println(sss);
//
//        String ddd = sb.replace(sss,"213123123123123");
//        System.out.println(ddd);


//        List<Integer> list = new ArrayList() {
//            {
//                add(12);
//                add(20);
//                add(12);
//                add(22);
//                add(22);
//                add(23);
//                add(159);
//                add(12);
//            }
//        };
//
//        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(p -> p,Collectors.counting()));
//        map.forEach((k, v) -> System.out.println(k + ":" + v));

//        List<Student> testList = new ArrayList<Student>();
//
//        List<Student> repeatList = new ArrayList<Student>();//用于存放重复的元素的list
//
//        testList.add(new Student("张五", 4));
//        testList.add(new Student("张五", 4));
//        testList.add(new Student("张四", 5));
//        testList.add(new Student("张一", 2));
//        testList.add(new Student("张五", 4));
//        testList.add(new Student("张三", 3));
//        testList.add(new Student("张七", 5));
//        testList.add(new Student("张一", 2));
//        testList.add(new Student("老王", 6));
//        testList.add(new Student("张八", 3));
//        testList.add(new Student("张九", 6));
//        testList.add(new Student("老王", 7));
//
//        for (int i = 0; i < testList.size() - 1; i++) {
//            for (int j = testList.size() - 1; j > i; j--) {
//                if (testList.get(j).getName().equals(testList.get(i).getName()) && testList.get(j).getId() == testList.get(i).getId()) {
//                    repeatList.add(testList.get(j));
//                }
//            }
//        }
//        repeatList.forEach(e -> System.out.println(e.getName() + "    +++++++++++" + e.getId()));

//        Map<Integer, Long> map = repeatList.stream().collect(Collectors.groupingBy(p -> p,Collectors.counting()));
//        map.forEach((k, v) -> System.out.println(k + ":" + v));
        Student u1 = new Student(1, "aa", "aap", 25, "VN");
        Student u2 = new Student(1, "aa", "aap", 25, "VN");
        Student u3 = new Student(3, "bb", "aap", 23, "VN");
        List<Student> list = new ArrayList<Student>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        List<Student> list1 = new ArrayList<Student>();

        String temp = "";
        for (int i = 0; i < list.size() - 1; i++) {
            Student temp1 = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getUserName().equals(list.get(i).getUserName())) { {
                        System.out.println("第" + (i + 1) + "个跟第" + (j + 1) + "个重复，值是：" + temp1.getUserName()+"++++"+temp1.getPassword()+"++++"+temp1.getAge());
                        list1.add(temp1);
                        list1.add(list.get(j));
                    }
                }
            }
        }
    }
}