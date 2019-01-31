package com.sino.accconfig.dao;

import com.sino.accconfig.model.AccRate;
import com.sino.accconfig.model.AccRateExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "AccRateMapper")
public interface AccRateMapper {
    int countByExample(AccRateExample example);

    int deleteByExample(AccRateExample example);

    int deleteByPrimaryKey(Long serialno);

    int insert(AccRate record);

    int insertSelective(AccRate record);

    List<AccRate> selectByExample(AccRateExample example);

    AccRate selectByPrimaryKey(Long serialno);

    int updateByExampleSelective(@Param("record") AccRate record, @Param("example") AccRateExample example);

    int updateByExample(@Param("record") AccRate record, @Param("example") AccRateExample example);

    int updateByPrimaryKeySelective(AccRate record);

    int updateByPrimaryKey(AccRate record);
}