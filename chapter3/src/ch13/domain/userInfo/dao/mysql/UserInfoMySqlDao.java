package ch13.domain.userInfo.dao.mysql;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println(" insert into Mysql DB userId = " + userInfo.getUserId() );
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println(" update into Mysql DB userId = " + userInfo.getUserId() );
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println(" delete into Mysql DB userId = " + userInfo.getUserId() );		
	}

}
