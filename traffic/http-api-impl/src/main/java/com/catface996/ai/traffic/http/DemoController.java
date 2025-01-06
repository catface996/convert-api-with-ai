package com.catface996.ai.traffic.http;

import com.catface996.ai.domain.business.demo.ExpressService;
import com.catface996.ai.domain.business.demo.model.ExpressDoModel;
import com.catface996.ai.domain.business.demo.param.ExpressOrderDoParam;
import com.catface996.ai.traffic.http.convert.ExpressConvert;
import com.catface996.ai.traffic.http.request.DispatchExpressOrderRequest;
import com.catface996.ai.traffic.http.response.ExpressOrderResponse;
import com.catface996.ai.traffic.model.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class DemoController {

    private final ExpressService expressService;

    public DemoController(ExpressService expressService) {
        this.expressService = expressService;
    }

    @ResponseBody
    @RequestMapping(value = "/demo")
    public JsonResult<String> demo() {
        return JsonResult.success("hello world");
    }

    @ResponseBody
    @PostMapping(value = "/dispatch")
    public JsonResult<ExpressOrderResponse> dispatch(@RequestBody DispatchExpressOrderRequest request) {
        ExpressOrderDoParam doParam = ExpressConvert.convertToDoModel(request);
        ExpressDoModel doModel = expressService.dispatchExpressOrder(doParam);
        ExpressOrderResponse response = ExpressConvert.convertToResponse(doModel);
        return JsonResult.success(response);
    }
}
