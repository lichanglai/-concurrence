package everydayTest;

import everydayTest.model.Student;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: test
 * @Date: 2018/8/11 10:35
 * @Author: lichanglai
 * @Description:
 */
public class StreamInAction {
    private static final Log log = LogFactory.getLog(StreamInAction.class);

    public static void main(String[] args) {

//        Trader raoul = new Trader("Raoul", "Cambridge");
//        Trader mario = new Trader("Mario", "Milan");
//        Trader alan = new Trader("Alan", "Cambridge");
//        Trader brian = new Trader("Brian", "Cambridge");
//
//
//        List<Transaction> transactions = Arrays.asList(
//                new Transaction(brian, 2011, 300),
//                new Transaction(raoul, 2012, 1000),
//                new Transaction(raoul, 2011, 400),
//                new Transaction(mario, 2012, 710),
//                new Transaction(mario, 2012, 700),
//                new Transaction(alan, 2012, 950)
//        );
//        transactions.stream().filter(e -> e.getYear() == 2011)
//                .sorted(Comparator.comparing(Transaction::getValue))
//                .collect(Collectors.toList());
//        System.out.println(transactions);
//
//        transactions.stream().map(e -> e.getTrader().getCity())
//                .distinct()
//                .forEach(System.out::print);
//        System.out.println("\n" + "=============================");
//
//        transactions.stream()
//                .map(Transaction::getTrader)
//                .filter(t -> t.getCity().equals("Cambridge"))
//                .distinct()
//                .sorted(Comparator.comparing(Trader::getName))
//                .forEach(System.out::print);
//
//        boolean anyMatch = transactions.stream().map(Transaction::getTrader).anyMatch(e -> e.getCity().equals("Cambridge"));
//        System.out.println("\n" + anyMatch);
        Student u1 = new Student(1, "aa", "aap", 23,"TH");
        Student u2 = new Student(2, "aa", "aap", 25,"VN");
        Student u3 = new Student(3, "bb", "aap", 23,"VN");
        Student u4 = new Student(4, "cc", "aap", 23,"VN");
        Student u5 = new Student(5, "cc", "aap", 23,"VN");
        Student u6 = new Student(6, "cc", "aap", 23,"TW");
        Student u7 = new Student(7, "aa", "aap", 24,"TW");
        Student u8 = new Student(7, "ee", "aap", 24,"TW");
        List<Student> list = new ArrayList<Student>();
        list.add(u1);
        list.add(u2);
        list.add(u7);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        list.add(u8);

        Map<String, Map<Integer, Long>> map = list.stream()
                .collect(Collectors.groupingBy(Student::getUserName, Collectors.groupingBy(Student::getAge, Collectors.counting())));
//        Map<String, Map<Integer, Long>> map = new HashMap<String, Map<Integer, Long>>();


        for (Student user1 : list) {
            Map<Integer, Long> value = new HashMap<Integer, Long>();
            long count = 0;
            if (map.containsKey(user1.getUserName())) {
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                if (user1.getUserName().equals(list.get(i).getUserName()) && user1.getAge() == list.get(i).getAge()) {
                    count += 1;
                    value.put(user1.getAge(), count);
                    map.put(user1.getUserName(), value);
                } else if (user1.getUserName().equals(list.get(i).getUserName()) && user1.getAge() != list.get(i).getAge()) {
                    value.put(list.get(i).getAge(), Long.valueOf(1));
                    map.put(user1.getUserName(), value);
                }
            }
        }
        map.forEach((k, v) -> {
            System.out.println(k + ">>>>" + v);
        });
        List<Student> list2 = new ArrayList<Student>();
        list.forEach(user -> {
            map.forEach((k, v) -> {
                if (k == user.getUserName()) {
                    //可以根据K获取value  然后判断这个对象是否满足条件，如果满足条件就ADD上这个LIST的
                    Long remove = v.remove(user.getAge());
                    user.setC(null==remove?0:remove);
                }

            });
            list2.add(user);
        });

        list2.forEach(u -> {
            System.out.println(u.getUserName()+"--"+u.getAge()+"---"+u.getId()+"--"+u.getPassword()+"---"+u.getC());
        });
    }

}
