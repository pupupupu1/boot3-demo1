package com.pjm.boot3demo1.controller;

import com.mongodb.client.MongoDatabase;
import com.pjm.boot3demo1.common.CommonResponse;
import com.pjm.boot3demo1.dao.UserInfoDao;
//import com.pjm.boot3demo1.feign.DemoFeignClient;
import com.pjm.boot3demo1.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("0")
    public String init() throws UnknownHostException {
        String res = "hello native,hello java17,hello k8s";
        InetAddress localHost = InetAddress.getLocalHost();
        var data = "CanonicalHostName:" + localHost.getCanonicalHostName() + "\n" + ",hostname:" + localHost.getHostName() + "\n" + ",hostip:" + localHost.getHostAddress();
        return res + "\n" + data;
    }

    @RequestMapping("1")
    public String demo1() {
        return "Hello Native~";
    }

    @RequestMapping("2")
    public String demo2(String key) {
        Object o = redisTemplate.opsForValue().get(key);
        return String.valueOf(o);
    }

    @RequestMapping("3")
    public Object demo3(String key) {
        return jdbcTemplate.queryForObject("select phone from user_info where user_id = 1554753241718169602", String.class);
    }

//    @RequestMapping("4")
//    public Object demo4(){
//        return userInfoMapper.selectAll();
//    }

    @RequestMapping("5")
    public Object demo5(String key) {
        return jdbcTemplate.queryForMap("select phone from user_info where user_id = 1554753241718169602");
    }

    @RequestMapping("6")
    public Object demo6(String key) {
        return userInfoDao.findAll();
    }


    @RequestMapping("7")
    public Object demo7(String key) {
        MongoDatabase db = mongoTemplate.getDb();
        String name = db.getName();
        return name;
    }

    //    @RequestMapping("8")
//    public Object demo8(String key){
//        return demoFeignClient.getUserInfo();
//    }

}
