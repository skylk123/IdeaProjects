package com.sino.bussniess.repository;

import com.sino.bussniess.entity.PolicyAccInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PolicyAccInfoRepository extends MongoRepository<PolicyAccInfo,String> {
    PolicyAccInfo findPolicyAccInfoByContno(String contno);
}
