package cn.itcast.test;


import cn.itcast.service.IAccountService;
import cn.itcast.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
        //调用方法
        accountService.findAllAccount();
    }
}
