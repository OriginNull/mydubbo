package cn.origin;

import cn.origin.mydubbo.service.IMessageService;
import cn.origin.mydubbo.vo.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageService {
    //@Autowired
    @Resource
    private IMessageService messageService;
    @Test
    public void testMessage(){
        Message vo = new Message();
        vo.setContent("haha");
        vo.setTitle("test");
        this.messageService.echo(vo);
    }
}
