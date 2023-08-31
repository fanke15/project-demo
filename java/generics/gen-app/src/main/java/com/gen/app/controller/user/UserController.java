package com.gen.app.controller.user;

import com.gen.beans.dto.user.RespUserInfoDTO;
import com.gen.common.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/user")
@Slf4j
public class UserController {
    public RespUserInfoDTO getUserInfo() throws ApiException {
        log.info("info");


        return new RespUserInfoDTO();
    }
}
