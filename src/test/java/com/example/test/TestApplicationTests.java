package com.example.test;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {
    private static final Log log = LogFactory.getLog(TestApplicationTests.class);

    @Test
    public void contextLoads() throws ParseException {

//        Calendar calendar = Calendar.getInstance();
//
//        String string = "2016-10-24";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date parse = sdf.parse(string);
//        //月
//        int month = parse.getMonth()+1;
//        //年
//        calendar.setTime(parse);
//        int year = calendar.get(Calendar.YEAR);
//
//        System.out.println("月是"+month+"---------年是："+year);
//
//        System.out.println("-------------------------------");
//
//        String string1 = "2016-10-24 21:59:06";
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf1.parse(string1));


//        String str = "bb91 bearing bottom bracket screw type 68/73 mm bicycle axis bike bottom bracket";
//        StringBuffer stringbf = new StringBuffer();
//        Matcher m = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
//        while (m.find()) {
//            m.appendReplacement(stringbf, m.group(1).toUpperCase() + m.group(2).toLowerCase());
//        }
//        System.out.println(m.appendTail(stringbf).toString());


//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(date +"-----------------");
//        calendar.setTime(date);
//        calendar.add(Calendar.DAY_OF_MONTH, -8);
//        date = calendar.getTime();
//        System.out.println(sdf.format(date)+"-----------------");

        //字符串转list<String>
        String str = "'qweqwe','asdasd','asdasd'";
        List<String> lis = Arrays.asList(str.split(","));
        for (String string : lis) {
            System.out.println(string);
        }
        //list<String>转字符串
        System.out.println(String.join("", lis));

    }

}
