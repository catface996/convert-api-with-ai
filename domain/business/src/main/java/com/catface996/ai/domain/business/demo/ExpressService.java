package com.catface996.ai.domain.business.demo;

import com.catface996.ai.domain.business.demo.model.ExpressDoModel;
import com.catface996.ai.domain.business.demo.param.ExpressOrderDoParam;

public interface ExpressService {

    /**
     * Dispatches an express delivery order based on the provided parameters.
     *
     * @param param The parameters required for dispatching an express order
     * @return ExpressModel containing the dispatched order details, the cost of the order, and the express number
     */
    ExpressDoModel dispatchExpressOrder(ExpressOrderDoParam param);
}
