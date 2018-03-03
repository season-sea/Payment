package com.pay.independent.service;

import com.pay.independent.entity.UserInfo;

import java.util.List;

public interface UserService {

    public UserInfo queryUserInfo(Long userId);

    public List<UserInfo> queryAllUser();


}
