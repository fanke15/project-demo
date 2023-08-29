package com.gen.beans.dto.user;

import com.gen.beans.dto.BaseDTO;
import lombok.Data;

@Data
public class RespUserInfoDTO extends BaseDTO {
    public Integer id;
    private String userID;
    private String authID;
    private String name;
    private String roleName;
}
