package com.hao.friendmatching;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 */
@SpringBootApplication
@MapperScan("com.hao.friendmatching.mapper")
//  开启定时任务
@EnableScheduling
public class FriendmatchingApplication {

    public static void main(String[] args) {
        SpringApplication.run(FriendmatchingApplication.class, args);
    }

}
