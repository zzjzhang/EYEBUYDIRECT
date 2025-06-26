package com.zzj.cn.eyebuydirect.handler;

import com.zzj.cn.eyebuydirect.converter.BookConvertor;
import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.BaseRequest;
import com.zzj.cn.eyebuydirect.response.BaseResponse;


public class ChangeHandler extends AbstractHandler {

    private Action action = Action.CHANGE;

    @Override
    public BaseResponse handle(BaseRequest baseRequest) {
        try {
            super.bookCatalogDao.update(BookConvertor.convert(baseRequest.getBook()));
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

}
