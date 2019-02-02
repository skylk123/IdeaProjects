package com.sino.file.mapper;

import com.sino.file.model.PolcyAccFee;
import com.sino.file.model.PolcyAccFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PolcyAccFeeMapper {
    int countByExample(PolcyAccFeeExample example);

    int deleteByExample(PolcyAccFeeExample example);

    int deleteByPrimaryKey(String costno);

    int insert(PolcyAccFee record);

    int insertSelective(PolcyAccFee record);

    List<PolcyAccFee> selectByExample(PolcyAccFeeExample example);

    PolcyAccFee selectByPrimaryKey(String costno);

    int updateByExampleSelective(@Param("record") PolcyAccFee record, @Param("example") PolcyAccFeeExample example);

    int updateByExample(@Param("record") PolcyAccFee record, @Param("example") PolcyAccFeeExample example);

    int updateByPrimaryKeySelective(PolcyAccFee record);

    int updateByPrimaryKey(PolcyAccFee record);
}