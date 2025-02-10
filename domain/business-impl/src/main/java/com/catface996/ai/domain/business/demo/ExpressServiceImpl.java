package com.catface996.ai.domain.business.demo;

import com.catface996.ai.api.express.ExpressThirdApi;
import com.catface996.ai.api.express.model.ExpressOrderApiModel;
import com.catface996.ai.api.express.param.ExpressOrderApiParam;
import com.catface996.ai.domain.business.demo.convert.ExpressConvert;
import com.catface996.ai.domain.business.demo.model.ExpressDoModel;
import com.catface996.ai.domain.business.demo.param.ExpressOrderDoParam;
import com.catface996.ai.repository.ExpressOrderRep;
import com.catface996.ai.repository.model.ExpressOrderRepModel;
import com.catface996.ai.repository.param.ExpressOrderRepParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExpressServiceImpl implements ExpressService {

    private final ExpressOrderRep expressOrderRep;

    private  final ExpressThirdApi expressThirdApi;

    public ExpressServiceImpl(ExpressOrderRep expressOrderRep, ExpressThirdApi expressThirdApi) {
        this.expressOrderRep = expressOrderRep;
        this.expressThirdApi = expressThirdApi;
    }

    @Override
    public ExpressDoModel dispatchExpressOrder(ExpressOrderDoParam doParam) {

        ExpressOrderRepParam repParam = ExpressConvert.convertToRepParam(doParam);
        ExpressOrderRepModel repModel = expressOrderRep.dispatchExpressOrderToExpressCompany(repParam);

        ExpressOrderApiParam apiParam =  ExpressConvert.convertToApiParam(doParam);
        ExpressOrderApiModel apiModel =expressThirdApi.submitExpressOrderToExpressCompany(apiParam);

        return ExpressConvert.convertToDoModel(repModel);

    }


}
