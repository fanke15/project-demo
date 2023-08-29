package com.gen.beans.entity.user;

import com.gen.beans.entity.BaseEntity;
import lombok.Data;

@Data
public class UserInfoEntity extends BaseEntity {
   private String userID;
   private String authID;
   private String name;
}
