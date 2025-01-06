package com.catface996.ai.domain.business.demo.model;

import lombok.Data;

@Data
public class ExpressDoModel {

    /**
     * 快递公司名称
     * 快递单号
     * 费用
     **/

    private String expressCompany;
    private String expressNumber;
    private String expressCost;

}
