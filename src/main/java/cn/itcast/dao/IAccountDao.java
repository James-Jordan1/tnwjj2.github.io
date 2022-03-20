package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/*账户dao接口*/
@Repository("accountDao")
public interface IAccountDao {
    /*查询所有账户信息*/
    @Select("select * from account")
    @Results(value = {
            @Result(column = "id",property = "id",id=true),
            @Result(column="name",property = "username"),
            @Result(column="money",property = "money")
    })
    public List<Account> findAllAccount();
    /*保存账户信息*/
    @Insert("insert into account (name,money) values(#{username},#{money})")
    public void saveAccount(Account account);
}
