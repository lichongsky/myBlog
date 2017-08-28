import com.lichong.service.BloggerService;
import com.lichong.to.Blogger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/8/20.
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:conf/spring-conf.xml")
public class TestProject {
    @Resource   //注入BloggerDao对象
    private BloggerService bloggerService;

    @Test
    public void getBloggerData() throws Exception {
        Blogger blogger = bloggerService.getBloggerById(1);
        System.out.println(blogger);
    }
}
