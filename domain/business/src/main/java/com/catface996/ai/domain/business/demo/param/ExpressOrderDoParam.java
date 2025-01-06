package com.catface996.ai.domain.business.demo.param;

import lombok.Data;

@Data
public class ExpressOrderDoParam {

    /**
     * 发货人姓名
     * 发货人电话
     * 发货人地址
     * 收货人姓名
     * 收货人电话
     * 收货人地址
     * 快递公司
     * 快递单号
     * 快递重量
     * 快递体积
     * 快递备注
     */
    private String senderName;
    private String senderPhone;
    private String senderAddress;
    private String receiverName;
    private String receiverPhone;
    private String receiverAddress;
    private String expressNumber;
    private String expressCompany;
    private String expressCost;
    private String expressWeight;
    private String expressVolume;
    private String expressRemark;

}
