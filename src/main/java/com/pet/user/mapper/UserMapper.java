package com.pet.user.mapper;

import com.pet.command.UserVO;

public interface UserMapper {

	public int idCheck(UserVO vo);
	public int join(UserVO vo);
	public UserVO userLogin(UserVO vo);
}
