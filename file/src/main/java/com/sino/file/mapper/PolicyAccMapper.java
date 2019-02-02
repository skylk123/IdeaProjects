package com.sino.file.mapper;

import com.sino.file.model.PolicyAcc;
import com.sino.file.model.PolicyAccExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PolicyAccMapper {
    int countByExample(PolicyAccExample example);

    int deleteByExample(PolicyAccExample example);

    int deleteByPrimaryKey(String accno);

    int insert(PolicyAcc record);

    int insertSelective(PolicyAcc record);

    List<PolicyAcc> selectByExample(PolicyAccExample example);

    PolicyAcc selectByPrimaryKey(String accno);

    int updateByExampleSelective(@Param("record") PolicyAcc record, @Param("example") PolicyAccExample example);

    int updateByExample(@Param("record") PolicyAcc record, @Param("example") PolicyAccExample example);

    int updateByPrimaryKeySelective(PolicyAcc record);

    int updateByPrimaryKey(PolicyAcc record);
}