package com.catface996.ai.traffic.http.express.convert;

import com.catface996.ai.domain.business.express.model.ExpressDoModel;
import com.catface996.ai.domain.business.express.param.ExpressOrderDoParam;
import com.catface996.ai.traffic.http.express.request.DispatchExpressOrderRequest;
import com.catface996.ai.traffic.http.express.response.ExpressOrderResponse;

public class ExpressConvert {

    public static ExpressOrderDoParam convertToDoModel(DispatchExpressOrderRequest repModel) {
        ExpressOrderDoParam doModel = new ExpressOrderDoParam();
        doModel.setSenderName(repModel.getSenderName());
        doModel.setSenderPhone(repModel.getSenderPhone());
        doModel.setSenderAddress(repModel.getSenderAddress());
        return doModel;
    }

    public static ExpressOrderResponse convertToResponse(ExpressDoModel doModel) {
        ExpressOrderResponse response = new ExpressOrderResponse();
        response.setExpressNumber(doModel.getExpressNumber());
        response.setExpressCompany(doModel.getExpressCompany());
        response.setExpressCost(doModel.getExpressCost());
        return response;
    }
}
