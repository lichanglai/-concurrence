package youjian;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: test
 * @Date: 2018/10/31 17:10
 * @Author: lichanglai
 * @Description:
 */
@RestController
public class EmailController {

    private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

    @RequestMapping("sendEmail")
    public static void main(String[] args) {
        boolean isSend = EmailUtils.sendEmail("这是一封测试邮件", new String[]{"769720623@qq.com"}, null, "<h3><a href='http://www.baidu.com'>你猜我是谁</a></h3>", null);
//        return "发送邮件:" + isSend;
    }

}
