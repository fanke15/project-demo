package com.gen.core.service.impl;

import com.gen.beans.dto.user.RespUserInfoDTO;
import com.gen.beans.entity.user.UserAuthEntity;
import com.gen.beans.entity.user.UserInfoEntity;
import com.gen.common.constants.TableConstants;
import com.gen.core.mapper.BaseMapper;
import com.gen.core.mapper.UserInfoMapper;
import com.gen.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserInfoEntity> implements UserService {
    @Autowired
    private UserInfoMapper daoObj;

    @Override
    public BaseMapper<UserInfoEntity> getDao() {
        return daoObj;
    }

    @Override
    public String getTableName() {
        return TableConstants.UserTableName;
    }

    @Override
    public RespUserInfoDTO getInfo(String userID) {
        UserInfoEntity info = getDao().getByUserId(getTableName(), userID);
        UserAuthEntity authInfo = userAuthMapper.getByAuthId(info.getAuthID());

        RespUserInfoDTO userInfo = new RespUserInfoDTO();
        userInfo.setId(info.getId());
        userInfo.setUserID(info.getUserID());
        userInfo.setAuthID(info.getAuthID());
        userInfo.setName(info.getName());

        userInfo.setRoleName(authInfo.getRoleName());

        return userInfo;
    }
}
