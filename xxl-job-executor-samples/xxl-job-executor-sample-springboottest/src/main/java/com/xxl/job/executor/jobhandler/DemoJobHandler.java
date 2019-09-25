package com.xxl.job.executor.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.executor.dao.SysCorpMapper;
import com.xxl.job.executor.pojo.MSysCorp;
import com.xxl.job.executor.pojo.SysCorp;
import com.xxl.job.executor.service.SysCorpService;
import com.xxl.job.executor.service1.SysCorpService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/25
 */
@JobHandler(value="demoJobHandler")
@Component
public class DemoJobHandler extends IJobHandler {

    @Resource
    private SysCorpMapper sysCorpMapper;
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        List<MSysCorp> mSysCorpList = sysCorpMapper.selectList(null);
        System.out.println(mSysCorpList.size());
        return SUCCESS;
    }
}
