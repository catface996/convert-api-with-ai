package com.catface996.ai.repository;

import com.catface996.ai.repository.model.ExpressOrderRepModel;
import com.catface996.ai.repository.param.ExpressOrderRepParam;

public interface ExpressOrderRep {

    /**
     * Dispatch express order to express company
     *
     * @param repParam express order param
     * @return express order rep model. Including express number...
     */
    ExpressOrderRepModel dispatchExpressOrderToExpressCompany(ExpressOrderRepParam repParam);
}
