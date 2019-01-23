package com.sino.bussniess.entity;

import java.util.List;
import java.util.stream.Collectors;

public class ProductAccInfo {
    private String productNo;
    private String productCode;
    private List<AccInfo> AccInfos;

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public List<AccInfo> getAccInfos() {
        return AccInfos;
    }

    public void setAccInfos(List<AccInfo> accInfos) {
        AccInfos = accInfos;
    }

    public AccInfo getAccInfoBYAccType(String acctype)
    {
        List<AccInfo> res = AccInfos.stream().filter(accInfo -> accInfo.getAcctype().equals(acctype)).collect(Collectors.toList());
        return res==null ? null:res.get(0);
    }
}
