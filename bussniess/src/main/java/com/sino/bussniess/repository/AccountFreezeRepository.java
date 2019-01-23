package com.sino.bussniess.repository;

import com.sino.bussniess.entity.AccountFreeze;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountFreezeRepository extends MongoRepository<AccountFreeze,String> {
    AccountFreeze findAccountFreezeByAccno(String accno);
}
