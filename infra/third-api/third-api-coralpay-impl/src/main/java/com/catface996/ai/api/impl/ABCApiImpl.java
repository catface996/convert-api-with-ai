package com.catface996.ai.api.impl;

import com.catface996.ai.api.ExpressThirdApi;
import com.catface996.ai.api.impl.payment.client.CoralPayClient;
import com.catface996.ai.api.model.ExpressOrderApiModel;
import com.catface996.ai.api.param.ExpressOrderApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//@Slf4j
@Service
public class ABCApiImpl implements ExpressThirdApi {

    private CoralPayClient coralPayClient;

    @Override
    public ExpressOrderApiModel submitExpressOrderToExpressCompany(ExpressOrderApiParam apiParam) {
        //log.info("ABC express company submit express order success. expressOrderApiParam:{}", apiParam);
        return build();
    }

    private ExpressOrderApiModel build(){
        ExpressOrderApiModel apiModel = new ExpressOrderApiModel();
        apiModel.setExpressNumber("123456789");
        apiModel.setExpressCompany("FedX");
        apiModel.setExpressCost("$1");
        return apiModel;
    }

}
