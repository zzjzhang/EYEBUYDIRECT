package com.zzj.cn.eyebuydirect.service;

import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.handler.*;
import com.zzj.cn.eyebuydirect.request.OpenRequest;
import com.zzj.cn.eyebuydirect.response.OpenResponse;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Component
public class HandlerRouter {

    public static final Map<Action, AbstractHandler> HANDLER_MAP = new HashMap<>();


    @PostConstruct
    public void init() {
        HANDLER_MAP.put(Action.CREATE, new CreateHandler());
        HANDLER_MAP.put(Action.CHANGE, new ChangeHandler());
        HANDLER_MAP.put(Action.REMOVE, new RemoveHandler());
        HANDLER_MAP.put(Action.QUERY, new QueryHandler());
    }

    public OpenResponse route(Action action, OpenRequest openRequest) {
        return HANDLER_MAP.get(action).handle(openRequest);
    }

}
