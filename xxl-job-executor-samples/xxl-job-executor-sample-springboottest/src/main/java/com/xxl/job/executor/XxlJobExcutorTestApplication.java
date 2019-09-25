package com.xxl.job.executor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author jiangtingfeng
 * @description
 * @date 2019/9/24/024
 */
@SpringBootApplication
@EnableConfigurationProperties
@EnableScheduling

@MapperScan("com.xxl.job.executor.dao")
public class XxlJobExcutorTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(XxlJobExcutorTestApplication.class, args);
    }
}
