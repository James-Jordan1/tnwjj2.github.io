package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*账户控制器(web)*/
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired  //注入service对象
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("Controller表现层：findAll方法执行了");
        //调用业务层Service的方法
        List<Account> accounts = accountService.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
        model.addAttribute("accounts",accounts);
        return "list";
    }
    /*用来保存用户信息*/
    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");  //重定向到当前项目路径下/account/findAll方法
        return;
    }
}
