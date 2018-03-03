package com.pay.independent.controller;

import com.pay.independent.entity.UserInfo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下
public class UserController {

    // 创建线程安全的Map
    ThreadLocal<Map<Long, UserInfo>> local=new ThreadLocal<>();
    //static Map<Long, UserInfo> users = Collections.synchronizedMap(new HashMap<Long, UserInfo>());

    @RequestMapping(value="/getUserList", method= RequestMethod.GET)
    public List<UserInfo> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<UserInfo> r = new ArrayList<UserInfo>(local.get().values());
        return r;
    }

    @RequestMapping(value="/postUser", method=RequestMethod.POST)
    public String postUser(@ModelAttribute UserInfo user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        local.get().put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value="/getUser{id}", method=RequestMethod.GET)
    public UserInfo getUser(@PathVariable Long id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return local.get().get(id);
    }

    @RequestMapping(value="/putUser{id}", method=RequestMethod.GET)
    public String putUser(@PathVariable Long id, @ModelAttribute UserInfo user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        Map<Long, UserInfo> maps=new HashMap<>();
        local.set(maps);
        UserInfo u = new UserInfo();
        u.setId(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        local.get().put(id, u);
        return "success";
    }

    @RequestMapping(value="/deleteUser{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        local.get().remove(id);
        return "success";
    }

}
