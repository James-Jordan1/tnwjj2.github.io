package cn.itcast.service.impl;

import cn.itcast.dao.IAccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAllAccount() {
        System.out.println("业务层：查询所有账户。。。。");
        return accountDao.findAllAccount();
    }
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户。。。。");
        accountDao.saveAccount(account);
    }
}
