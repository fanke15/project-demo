package com.gen.beans.entity.example;

import com.gen.beans.entity.BaseEntity;
import lombok.Data;

@Data
public class DefaultExampleEntity extends BaseEntity {
    private String userId;
    @Override
    public String toString(){
        return "User [id=" + id + ", userId=" + userId + "]";
    }
}
