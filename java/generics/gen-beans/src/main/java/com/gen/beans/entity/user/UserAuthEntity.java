package com.gen.beans.entity.user;

import com.gen.beans.entity.BaseEntity;
import lombok.Data;

@Data
public class UserAuthEntity extends BaseEntity {
    private String authID;
    private String roleName;
}
