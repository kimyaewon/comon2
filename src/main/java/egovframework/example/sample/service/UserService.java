package egovframework.example.sample.service;

import javax.enterprise.inject.Model;

public interface UserService {

	/*
	 * 회원가입
	 */
	public void userJoin(UserVO userVO, Model model) throws Exception;
}