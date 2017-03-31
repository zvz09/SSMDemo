package com.zvz.service.impl;

import com.zvz.dao.TUserEntityMapper;
import com.zvz.entity.TUserEntity;
import com.zvz.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lilipo on 2017/3/31.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private TUserEntityMapper userDao;

    public TUserEntity getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}
