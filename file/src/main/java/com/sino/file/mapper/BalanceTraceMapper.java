package com.sino.file.mapper;

import com.sino.file.model.BalanceTrace;
import com.sino.file.model.BalanceTraceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceTraceMapper {
    int countByExample(BalanceTraceExample example);

    int deleteByExample(BalanceTraceExample example);

    int deleteByPrimaryKey(Long serialno);

    int insert(BalanceTrace record);

    int insertSelective(BalanceTrace record);

    List<BalanceTrace> selectByExample(BalanceTraceExample example);

    BalanceTrace selectByPrimaryKey(Long serialno);

    int updateByExampleSelective(@Param("record") BalanceTrace record, @Param("example") BalanceTraceExample example);

    int updateByExample(@Param("record") BalanceTrace record, @Param("example") BalanceTraceExample example);

    int updateByPrimaryKeySelective(BalanceTrace record);

    int updateByPrimaryKey(BalanceTrace record);
}