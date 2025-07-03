package com.zzj.cn.eyebuydirect.handler;

import com.zzj.cn.eyebuydirect.dto.BookDto;
import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.OpenRequest;
import com.zzj.cn.eyebuydirect.response.OpenResponse;

import java.util.List;


public class QueryHandler extends AbstractHandler {

    private Action action = Action.QUERY;


    @Override
    public OpenResponse handle(OpenRequest openRequest) {
        try {
            List<BookDto> bookDtos = super.bookCatalogDao.query(openRequest.getBook().getCatalog().getName());
            return OpenResponse.success(bookDtos);
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
