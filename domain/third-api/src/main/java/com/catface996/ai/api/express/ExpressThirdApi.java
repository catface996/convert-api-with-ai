package com.catface996.ai.api.express;

import com.catface996.ai.api.express.model.ExpressOrderApiModel;
import com.catface996.ai.api.express.param.ExpressOrderApiParam;

public interface ExpressThirdApi {

    /**
     * Submit express order to express company
     *
     * @param apiParam express order param
     * @return express order model. Including express number...
     */
    ExpressOrderApiModel submitExpressOrderToExpressCompany(ExpressOrderApiParam apiParam);
}
