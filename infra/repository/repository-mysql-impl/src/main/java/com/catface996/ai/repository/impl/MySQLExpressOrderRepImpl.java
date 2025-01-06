package com.catface996.ai.repository.impl;

import com.catface996.ai.repository.ExpressOrderRep;
import com.catface996.ai.repository.model.ExpressOrderRepModel;
import com.catface996.ai.repository.param.ExpressOrderRepParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//@Slf4j
@Service
public class MySQLExpressOrderRepImpl implements ExpressOrderRep {

    @Override
    public ExpressOrderRepModel dispatchExpressOrderToExpressCompany(ExpressOrderRepParam repParam) {
        //log.info("MySQLExpressOrderRepImpl dispatchExpressOrderToExpressCompany. repParam:{}", repParam);
        return build();
    }

    ExpressOrderRepModel build(){
        ExpressOrderRepModel model = new ExpressOrderRepModel();
        model.setExpressNumber("123456789");
        model.setExpressCompany("FedX");
        model.setExpressCost("$1");
        return model;
    }

}
