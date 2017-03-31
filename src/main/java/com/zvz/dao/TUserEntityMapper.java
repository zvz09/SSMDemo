package com.zvz.dao;

import com.zvz.entity.TUserEntity;

public interface TUserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserEntity record);

    int insertSelective(TUserEntity record);

    TUserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserEntity record);

    int updateByPrimaryKey(TUserEntity record);
}