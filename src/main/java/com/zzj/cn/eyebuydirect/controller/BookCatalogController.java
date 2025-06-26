package com.zzj.cn.eyebuydirect.controller;

import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.BaseRequest;
import com.zzj.cn.eyebuydirect.response.BaseResponse;
import com.zzj.cn.eyebuydirect.service.HandlerRouter;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/book-catalog")
public class BookCatalogController {

    @Resource
    private HandlerRouter handlerRouter;


    @PostMapping("/create")
    public BaseResponse create(@RequestBody BaseRequest baseRequest) {
        return handlerRouter.route(Action.CREATE, baseRequest);
    }

    @PostMapping("/query")
    public BaseResponse query(@RequestBody BaseRequest baseRequest) {
        return handlerRouter.route(Action.QUERY, baseRequest);
    }

    @PostMapping("/change")
    public BaseResponse update(@RequestBody BaseRequest baseRequest) {
        return handlerRouter.route(Action.CHANGE, baseRequest);
    }

    @PostMapping("/remove")
    public BaseResponse delete(@RequestBody BaseRequest baseRequest) {
        return handlerRouter.route(Action.REMOVE, baseRequest);
    }

}
