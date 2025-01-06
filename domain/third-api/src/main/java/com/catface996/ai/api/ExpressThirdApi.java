package com.catface996.ai.api;

import com.catface996.ai.api.model.ExpressOrderApiModel;
import com.catface996.ai.api.param.ExpressOrderApiParam;

public interface ExpressThirdApi {

    /**
     * Submit express order to express company
     *
     * @param apiParam express order param
     * @return express order model. Including express number...
     */
    ExpressOrderApiModel submitExpressOrderToExpressCompany(ExpressOrderApiParam apiParam);
}
