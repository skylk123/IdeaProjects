package com.sino.accconfig.mapper;

import com.sino.accconfig.model.AccDefinition;
import com.sino.accconfig.model.AccDefinitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "AccDefinitionMapper")
public interface AccDefinitionMapper {
    int countByExample(AccDefinitionExample example);

    int deleteByExample(AccDefinitionExample example);

    int deleteByPrimaryKey(String acccode);

    int insert(AccDefinition record);

    int insertSelective(AccDefinition record);

    List<AccDefinition> selectByExample(AccDefinitionExample example);

    AccDefinition selectByPrimaryKey(String acccode);

    int updateByExampleSelective(@Param("record") AccDefinition record, @Param("example") AccDefinitionExample example);

    int updateByExample(@Param("record") AccDefinition record, @Param("example") AccDefinitionExample example);

    int updateByPrimaryKeySelective(AccDefinition record);

    int updateByPrimaryKey(AccDefinition record);
}