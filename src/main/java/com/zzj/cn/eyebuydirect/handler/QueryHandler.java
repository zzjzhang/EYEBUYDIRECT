package com.zzj.cn.eyebuydirect.handler;

import com.zzj.cn.eyebuydirect.dto.BookDto;
import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.BaseRequest;
import com.zzj.cn.eyebuydirect.response.BaseResponse;

import java.util.List;


public class QueryHandler extends AbstractHandler {

    private Action action = Action.QUERY;


    @Override
    public BaseResponse handle(BaseRequest baseRequest) {
        try {
            List<BookDto> bookDtos = super.bookCatalogDao.query(baseRequest.getBook().getCatalog().getName());
            return BaseResponse.success(bookDtos);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResponse.fail(e.getMessage());
        }
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

}
