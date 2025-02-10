package com.catface996.ai.domain.business.express;

import com.catface996.ai.domain.business.express.model.ExpressDoModel;
import com.catface996.ai.domain.business.express.param.ExpressOrderDoParam;

public interface ExpressService {

    /**
     * Dispatches an express delivery order based on the provided parameters.
     *
     * @param param The parameters required for dispatching an express order
     * @return ExpressModel containing the dispatched order details, the cost of the order, and the express number
     */
    ExpressDoModel dispatchExpressOrder(ExpressOrderDoParam param);
}
