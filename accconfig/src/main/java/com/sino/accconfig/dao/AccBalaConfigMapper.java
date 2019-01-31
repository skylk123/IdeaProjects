package com.sino.accconfig.dao;

import com.sino.accconfig.model.AccBalaConfig;
import com.sino.accconfig.model.AccBalaConfigExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "AccBalaConfigMapper")
public interface AccBalaConfigMapper {
    int countByExample(AccBalaConfigExample example);

    int deleteByExample(AccBalaConfigExample example);

    int insert(AccBalaConfig record);

    int insertSelective(AccBalaConfig record);

    List<AccBalaConfig> selectByExample(AccBalaConfigExample example);

    int updateByExampleSelective(@Param("record") AccBalaConfig record, @Param("example") AccBalaConfigExample example);

    int updateByExample(@Param("record") AccBalaConfig record, @Param("example") AccBalaConfigExample example);
}