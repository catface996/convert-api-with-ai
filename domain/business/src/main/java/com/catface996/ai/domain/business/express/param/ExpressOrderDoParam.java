package com.catface996.ai.domain.business.express.param;


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

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressCost() {
        return expressCost;
    }

    public void setExpressCost(String expressCost) {
        this.expressCost = expressCost;
    }

    public String getExpressWeight() {
        return expressWeight;
    }

    public void setExpressWeight(String expressWeight) {
        this.expressWeight = expressWeight;
    }

    public String getExpressVolume() {
        return expressVolume;
    }

    public void setExpressVolume(String expressVolume) {
        this.expressVolume = expressVolume;
    }

    public String getExpressRemark() {
        return expressRemark;
    }

    public void setExpressRemark(String expressRemark) {
        this.expressRemark = expressRemark;
    }
}
