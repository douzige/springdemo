package chen.firstSpring.service.Impl;

import chen.firstSpring.dao.UserDao;
import chen.firstSpring.po.User;
import chen.firstSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private  UserDao  userDao;

    @Override
    public User findUserId(int id) {

        return userDao.findUserId(id);
    }
}
