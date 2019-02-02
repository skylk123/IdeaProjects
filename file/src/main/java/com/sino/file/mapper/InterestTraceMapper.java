package com.sino.file.mapper;

import com.sino.file.model.InterestTrace;
import com.sino.file.model.InterestTraceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterestTraceMapper {
    int countByExample(InterestTraceExample example);

    int deleteByExample(InterestTraceExample example);

    int deleteByPrimaryKey(Long serialno);

    int insert(InterestTrace record);

    int insertSelective(InterestTrace record);

    List<InterestTrace> selectByExample(InterestTraceExample example);

    InterestTrace selectByPrimaryKey(Long serialno);

    int updateByExampleSelective(@Param("record") InterestTrace record, @Param("example") InterestTraceExample example);

    int updateByExample(@Param("record") InterestTrace record, @Param("example") InterestTraceExample example);

    int updateByPrimaryKeySelective(InterestTrace record);

    int updateByPrimaryKey(InterestTrace record);
}