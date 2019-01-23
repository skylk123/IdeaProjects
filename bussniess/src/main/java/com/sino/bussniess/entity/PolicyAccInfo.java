package com.sino.bussniess.entity;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.stream.Collectors;

public class PolicyAccInfo {
    @Id
    private String contno;
    private List<ProductAccInfo> productAccInfos;

    public String getContno() {
        return contno;
    }

    public void setContno(String contno) {
        this.contno = contno;
    }

    public List<ProductAccInfo> getProductAccInfos() {
        return productAccInfos;
    }

    public void setProductAccInfos(List<ProductAccInfo> productAccInfos) {
        this.productAccInfos = productAccInfos;
    }

    public ProductAccInfo getAccByProANDType(String productno) {

        List<ProductAccInfo> resPro = productAccInfos.stream().filter(productAccInfo -> productAccInfo.getProductNo().equals(productno)
        ).collect(Collectors.toList());

        return resPro==null ? null:resPro.get(0);
    }
}
