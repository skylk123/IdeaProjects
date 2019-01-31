package com.sino.bussniess.service.impl;

import com.alibaba.fastjson.JSON;
import com.sino.bussniess.common.ResultTool;
import com.sino.bussniess.entity.AccCreatePar;
import com.sino.bussniess.entity.AccInfo;
import com.sino.bussniess.entity.PolicyAccInfo;
import com.sino.bussniess.remote.AccConfigTool;
import com.sino.bussniess.repository.PolicyAccInfoRepository;
import com.sino.bussniess.service.AccCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
@Service
public class AccCreateServiceImpl implements AccCreateService {

    @Autowired
    private PolicyAccInfoRepository rep ;
    @Autowired
    private KafkaTemplate kafkaTemplate;
    @Autowired
    private AccConfigTool tool;
    @Override
    public String accCreate(AccCreatePar par) {
        String res;
        AccInfo info;
        PolicyAccInfo policy =  rep.findPolicyAccInfoByContno(par.getPolicyno());
        if (policy != null) {
            info = policy.getAccByProANDType(par.getProductno()).getAccInfoBYAccType(par.getAcctype());
            if (info != null) {
                return ResultTool.fail("1001", "创建账户失败，账户已经存在");
            }
        }
        if("false".equals(tool.checkRiskcodeToAccType(par.getRiskcode(),par.getAcctype())))
        {
            return ResultTool.fail("1002", "险种不能添加此账户类型");
        }
        info = new AccInfo();

        //MQ消息发送
        ListenableFuture future = kafkaTemplate.send("acc_create", JSON.toJSON(info).toString());
        future.addCallback(o -> System.out.println("sendd-消息发送成功：" ), throwable -> System.out.println("消息发送失败："));

        return ResultTool.succ("创建成功");
    }
}
