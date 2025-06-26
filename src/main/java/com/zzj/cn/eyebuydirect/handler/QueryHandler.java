package com.zzj.cn.eyebuydirect.handler;

import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.BaseRequest;
import com.zzj.cn.eyebuydirect.response.BaseResponse;


public class QueryHandler extends AbstractHandler {

    private Action action = Action.QUERY;


    @Override
    public BaseResponse handle(BaseRequest baseRequest) {
        super.bookCatalogDao.query();
        return null;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

}
