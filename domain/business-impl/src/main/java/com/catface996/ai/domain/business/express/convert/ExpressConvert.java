package com.catface996.ai.domain.business.express.convert;

import com.catface996.ai.api.express.param.ExpressOrderApiParam;
import com.catface996.ai.domain.business.express.model.ExpressDoModel;
import com.catface996.ai.domain.business.express.param.ExpressOrderDoParam;
import com.catface996.ai.repository.model.ExpressOrderRepModel;
import com.catface996.ai.repository.param.ExpressOrderRepParam;

public class ExpressConvert {

    public static ExpressOrderRepParam convertToRepParam(ExpressOrderDoParam doParam) {
        ExpressOrderRepParam repParam = new ExpressOrderRepParam();

        repParam.setSenderName(doParam.getSenderName());
        repParam.setSenderPhone(doParam.getSenderPhone());
        repParam.setSenderAddress(doParam.getSenderAddress());

        repParam.setReceiverName(doParam.getReceiverName());
        repParam.setReceiverPhone(doParam.getReceiverPhone());
        repParam.setReceiverAddress(doParam.getReceiverAddress());

        repParam.setExpressCompany(doParam.getExpressCompany());
        repParam.setExpressVolume(doParam.getExpressVolume());
        repParam.setExpressWeight(doParam.getExpressWeight());
        repParam.setExpressRemark(doParam.getExpressRemark());

        return repParam;
    }

    public static ExpressOrderApiParam convertToApiParam(ExpressOrderDoParam doParam) {
        ExpressOrderApiParam apiParam = new ExpressOrderApiParam();

        apiParam.setSenderName(doParam.getSenderName());
        apiParam.setSenderPhone(doParam.getSenderPhone());
        apiParam.setSenderAddress(doParam.getSenderAddress());

        apiParam.setReceiverName(doParam.getReceiverName());
        apiParam.setReceiverPhone(doParam.getReceiverPhone());
        apiParam.setReceiverAddress(doParam.getReceiverAddress());

        apiParam.setExpressCompany(doParam.getExpressCompany());
        apiParam.setExpressVolume(doParam.getExpressVolume());
        apiParam.setExpressWeight(doParam.getExpressWeight());
        apiParam.setExpressRemark(doParam.getExpressRemark());

        return apiParam;
    }

    public static ExpressDoModel convertToDoModel(ExpressOrderRepModel repModel) {
        ExpressDoModel doModel = new ExpressDoModel();
        doModel.setExpressCompany(repModel.getExpressCompany());
        doModel.setExpressNumber(repModel.getExpressNumber());
        doModel.setExpressCost(repModel.getExpressCost());
        return doModel;
    }
}
