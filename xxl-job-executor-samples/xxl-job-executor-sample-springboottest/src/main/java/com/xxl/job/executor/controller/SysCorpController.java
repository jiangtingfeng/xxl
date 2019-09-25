package com.xxl.job.executor.controller;

import com.xxl.job.executor.pojo.MSysCorp;
import com.xxl.job.executor.pojo.SysCorp;
import com.xxl.job.executor.service.SysCorpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/25
 */
@Controller
public class SysCorpController {

    @Autowired
    private SysCorpService sysCorpService;
    @RequestMapping("/test")
    public void test(){
        List<MSysCorp> sysCorpList = sysCorpService.list();
        sysCorpList.forEach(System.out::println);
    }
}
