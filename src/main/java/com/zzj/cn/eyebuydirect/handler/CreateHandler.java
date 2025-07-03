package com.zzj.cn.eyebuydirect.handler;

import com.zzj.cn.eyebuydirect.converter.BookConvertor;
import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.OpenRequest;
import com.zzj.cn.eyebuydirect.response.OpenResponse;


public class CreateHandler extends AbstractHandler {

    private Action action = Action.CREATE;

    @Override
    public OpenResponse handle(OpenRequest openRequest) {
        try {
            super.bookCatalogDao.insert(BookConvertor.convert(openRequest.getBook()));
            return OpenResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return OpenResponse.fail(e.getMessage());
        }
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

}
