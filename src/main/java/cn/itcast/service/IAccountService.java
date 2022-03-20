package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface IAccountService {
    /*查询所有账户信息*/
    public List<Account> findAllAccount();
    /*保存账户信息*/
    public void saveAccount(Account account);
}
