package com.gen.core.service;

import com.gen.beans.dto.user.RespUserInfoDTO;
import com.gen.beans.entity.user.UserInfoEntity;

public interface UserService extends BaseService<UserInfoEntity>{
    RespUserInfoDTO getInfo(String userId);
}
