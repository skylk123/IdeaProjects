package com.sino.file.mapper;

import com.sino.file.model.BusinessFile;
import com.sino.file.model.BusinessFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessFileMapper {
    int countByExample(BusinessFileExample example);

    int deleteByExample(BusinessFileExample example);

    int deleteByPrimaryKey(String businessno);

    int insert(BusinessFile record);

    int insertSelective(BusinessFile record);

    List<BusinessFile> selectByExample(BusinessFileExample example);

    BusinessFile selectByPrimaryKey(String businessno);

    int updateByExampleSelective(@Param("record") BusinessFile record, @Param("example") BusinessFileExample example);

    int updateByExample(@Param("record") BusinessFile record, @Param("example") BusinessFileExample example);

    int updateByPrimaryKeySelective(BusinessFile record);

    int updateByPrimaryKey(BusinessFile record);
}