package cn.itcast.test;

import cn.itcast.dao.IAccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    InputStream in=null;
    SqlSession sqlSession=null;
    IAccountDao dao=null;
    @Before
    public void init() throws IOException {
        //加载mybatis配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlSession对象
        sqlSession = factory.openSession();
        //获取到代理对象
        dao = sqlSession.getMapper(IAccountDao.class);
    }
    @After
    public void destroy() throws IOException {
        //将事务提交至数据库
        sqlSession.commit();
        //关闭资源，释放资源
        sqlSession.close();
        in.close();
    }
    /*测试查询所有*/
    @Test
    public void run1() throws IOException {
        List<Account> accounts = dao.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    /*测试插入操作*/
    @Test
    public void testInsert(){
        Account account=new Account();
        account.setMoney(1000f);
        account.setUsername("王五");
        dao.saveAccount(account);
        System.out.println("插入成功");
    }
}
