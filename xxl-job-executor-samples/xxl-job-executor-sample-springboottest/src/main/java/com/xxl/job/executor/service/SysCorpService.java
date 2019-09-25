package com.xxl.job.executor.service;

import com.xxl.job.executor.dao.SysCorpMapper;
import com.xxl.job.executor.pojo.MSysCorp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/25
 */
@Service
public class SysCorpService  {

    @Resource
    private  SysCorpMapper sysCorpMapper;
    public List<MSysCorp> list() {
        return sysCorpMapper.selectList(null);
    }

}
