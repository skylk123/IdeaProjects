package com.sino.file.mapper;

import com.sino.file.model.CostTrace;
import com.sino.file.model.CostTraceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostTraceMapper {
    int countByExample(CostTraceExample example);

    int deleteByExample(CostTraceExample example);

    int deleteByPrimaryKey(Long serialno);

    int insert(CostTrace record);

    int insertSelective(CostTrace record);

    List<CostTrace> selectByExample(CostTraceExample example);

    CostTrace selectByPrimaryKey(Long serialno);

    int updateByExampleSelective(@Param("record") CostTrace record, @Param("example") CostTraceExample example);

    int updateByExample(@Param("record") CostTrace record, @Param("example") CostTraceExample example);

    int updateByPrimaryKeySelective(CostTrace record);

    int updateByPrimaryKey(CostTrace record);
}