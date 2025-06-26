package com.zzj.cn.eyebuydirect.handler;

import com.zzj.cn.eyebuydirect.request.BaseRequest;
import com.zzj.cn.eyebuydirect.response.BaseResponse;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractHandler {

    public abstract BaseResponse handle(BaseRequest baseRequest);

}
