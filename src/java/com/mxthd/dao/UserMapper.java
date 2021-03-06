package com.mxthd.dao;

import com.mxthd.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //按用户名查找
    List<User> findByUsername(String username);
    //按邮件查找
    List<User> findByEmail(String mail);
    //添加用户
    void addUser(User user);
    //用户登陆
    User loginCheck(String username,String password);
    //按id查询
    User findById(Integer id);
    //用户绑定qq账号
    void updateQQOpenid(@Param("id") Integer id,@Param("qqopenid") String qqopenid);
    User qqlogin(String qqopenid);
    //在后台查询所有用户的信息
    //
    List<User> findAllUser(User user);

    int Addcredit(@Param("id") Integer id,@Param("credit") Double credit);

    //在后台根据姓名来模糊查询
    public List<User> getUsername(@Param("username") String username);

    //后台根据用户的id来进行查询用户的积分信息
    public List<User> selectByPay(@Param("id") Integer id);
    //修改头像
    public void updateByavatar(@Param("id") Integer id,@Param("avatar") String avatar);
}
