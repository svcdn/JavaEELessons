package com.dnsoft.chapter04.jdbc;

import java.util.List;

public interface AccountDao {
    // 添加
    int addAccount(Account account);
    // 更新
    int updateAccount(Account account);
    // 删除
    int deleteAccount(int id);

    // 通过id查询
    Account findAccountById(int id);
    // 查询所有账户
    List<Account> findAllAccount();
}
