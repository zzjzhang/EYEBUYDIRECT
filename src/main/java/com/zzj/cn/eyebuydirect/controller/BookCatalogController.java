package com.zzj.cn.eyebuydirect.controller;

import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.OpenRequest;
import com.zzj.cn.eyebuydirect.response.OpenResponse;
import com.zzj.cn.eyebuydirect.service.HandlerRouter;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("book-catalog")
public class BookCatalogController {

    @Resource
    private HandlerRouter handlerRouter;


    @PostMapping("create")
    public OpenResponse create(@RequestBody OpenRequest openRequest) {
        return handlerRouter.route(Action.CREATE, openRequest);
    }

    @PostMapping("/query")
    public OpenResponse query(@RequestBody OpenRequest openRequest) {
        return handlerRouter.route(Action.QUERY, openRequest);
    }

    @PostMapping("/change")
    public OpenResponse change(@RequestBody OpenRequest openRequest) {
        return handlerRouter.route(Action.CHANGE, openRequest);
    }

    @PostMapping("/remove")
    public OpenResponse remove(@RequestBody OpenRequest openRequest) {
        return handlerRouter.route(Action.REMOVE, openRequest);
    }


    public HandlerRouter getHandlerRouter() {
        return handlerRouter;
    }

    public void setHandlerRouter(HandlerRouter handlerRouter) {
        this.handlerRouter = handlerRouter;
    }
}
