package egovframework.example.sample.service.impl;

import javax.annotation.Resource;
import javax.enterprise.inject.Model;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.UserService;
import egovframework.example.sample.service.UserVO;

@Service("userService")
public class UserServiceImpl  implements UserService{

	@Resource(name="UserDAO")
	public UserDAO UserDAO;
	
	@Override
	public void userJoin(UserVO userVO, Model model) throws Exception {
		UserDAO.userJoin(userVO);
	}

}
