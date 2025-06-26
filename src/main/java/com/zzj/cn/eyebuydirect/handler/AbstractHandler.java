package com.zzj.cn.eyebuydirect.handler;

import com.zzj.cn.eyebuydirect.dao.BookCatalogDao;
import com.zzj.cn.eyebuydirect.enums.Action;
import com.zzj.cn.eyebuydirect.request.BaseRequest;
import com.zzj.cn.eyebuydirect.response.BaseResponse;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractHandler {

    @Resource
    protected BookCatalogDao bookCatalogDao;

    public abstract BaseResponse handle(BaseRequest baseRequest);

    public abstract Action getAction();

    abstract void setAction(Action action);

}
