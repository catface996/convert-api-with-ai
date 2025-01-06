package com.catface996.ai.api.param;

import lombok.Data;

@Data
public class ExpressOrderApiParam {

    private String senderName;
    private String senderPhone;
    private String senderAddress;
    private String receiverName;
    private String receiverPhone;
    private String receiverAddress;
    private String expressCompany;
    private String expressWeight;
    private String expressVolume;
    private String expressRemark;
}
