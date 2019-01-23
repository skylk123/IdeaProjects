package com.sino.bussniess.common;

import com.alibaba.fastjson.JSON;
import com.sino.bussniess.entity.ResultEntity;

public class ResultTool {
    public static String succ(String info)
    {
        return JSON.toJSONString(new ResultEntity("SUCC","0000",info));
    }
    public static String fail(String code,String reason)
    {
        return JSON.toJSONString(new ResultEntity("FAIL",code,reason));
    }
}
