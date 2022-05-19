package egovframework.example.sample.service.impl;

import javax.enterprise.inject.Model;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.UserVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("UserDAO")
public class UserDAO extends EgovAbstractDAO {

	public void userJoin(UserVO userVO) {
		insert("UserDAO.userJoin", userVO);
	}

}
