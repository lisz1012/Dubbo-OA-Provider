package com.lisz.mapper;

import com.lisz.entity.Account;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * AccountMapper继承基类
 */
@Repository
@Mapper
public interface AccountMapper extends MyBatisBaseDao<Account, Integer, AccountExample> {
	Account findById(Integer id);

	void addRolesForAccount(int[] roleIds, int accountId);

	// 虽然变量名与mapper.xml文件中SQL中#{}内的一样的话，有时也能正确得出去而已结果，但有时不行，不知道为什么，最好写上@Param注解
	Account findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}