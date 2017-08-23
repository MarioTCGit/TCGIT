package server.impl.userImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import pojo.SMJP_USER;
import server.dao.userDAO.UserMapper;
import server.service.userService.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userDao;

	@Override
	public Integer login(SMJP_USER SMJP_USER_) {
		return this.userDao.login(SMJP_USER_);
	}
}
