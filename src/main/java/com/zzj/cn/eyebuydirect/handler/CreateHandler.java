package com.zzj.cn.eyebuydirect.handler;

import com.zzj.cn.eyebuydirect.converter.BookConvertor;
import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.BaseRequest;
import com.zzj.cn.eyebuydirect.response.BaseResponse;


public class CreateHandler extends AbstractHandler {

    private Action action = Action.CREATE;

    @Override
    public BaseResponse handle(BaseRequest baseRequest) {
        super.bookCatalogDao.insert(BookConvertor.convert(baseRequest.getBook()));
        return null;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

}
