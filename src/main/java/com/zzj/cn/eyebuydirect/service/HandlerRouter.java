package com.zzj.cn.eyebuydirect.service;

import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.handler.*;
import com.zzj.cn.eyebuydirect.request.BaseRequest;
import com.zzj.cn.eyebuydirect.response.BaseResponse;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class HandlerRouter {

    private static final Map<Action, AbstractHandler> HANDLER_MAP = new HashMap<>();

    @Resource
    private List<AbstractHandler> handlers;

    @PostConstruct
    void init() {
        for (AbstractHandler handler : handlers) {
            HANDLER_MAP.put(handler.getAction(), handler);
        }
    }

    public BaseResponse route(Action action, BaseRequest baseRequest) {
        return HANDLER_MAP.get(action).handle(baseRequest);
    }

}
