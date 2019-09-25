package com.xxl.job.executor.service1;

import com.xxl.job.executor.mdao.SysCorpMapper1;
import com.xxl.job.executor.pojo.SysCorp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/25
 */
@Service
public class SysCorpService1 {

    @Resource
    private SysCorpMapper1 sysCorpMapper1;

    public List<SysCorp> list() {
        return sysCorpMapper1.selectList(null);
    }

}
