package com.example.game.mongodemo;

import com.example.game.mongodemo.model.User;
import com.example.game.mongodemo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userDao;

//    @Test
//    void contextLoads() {
//        System.out.println("开启mongo测试");
//    }

    @Test
    public void testSaveUser() throws Exception {
        try {

            System.out.println("user save init");
            User user = new User();
            user.setId(2l);
            user.setUserName("小明");
            user.setPassWord("fffooo123");
            userDao.saveUser(user);
            System.out.println("user save done");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void findUserByUserName(){
        User user= userDao.findUserByUserName("小明");
        System.out.println("user is "+user);
    }

    @Test
    public void updateUser(){
        User user=new User();
        user.setId(2l);
        user.setUserName("天空");
        user.setPassWord("fffxxxx");
        userDao.updateUser(user);
        user= userDao.findUserByUserName("天空");
        System.out.println("user update is "+user);
    }
//
//    @Test
//    public void deleteUserById(){
//        userDao.deleteUserById(1l);
//    }

}
