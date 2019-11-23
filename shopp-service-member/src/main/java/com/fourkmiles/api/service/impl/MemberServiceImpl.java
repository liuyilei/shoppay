package com.fourkmiles.api.service.impl;

import com.fourkmiles.api.service.MemberService;
import com.fourkmiles.core.ApiResult;
import com.fourkmiles.core.BaseApiService;
import com.fourkmiles.pojo.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 会员服务接口实现
 * @author: liuyilei
 * @create: 2019-10-21 14:11
 **/
@RestController
public class MemberServiceImpl extends BaseApiService implements MemberService {

    @Override
    public ApiResult test() {
        return success();
    }

    @Override
    public ApiResult testRedis() {
        try {
            set("testKey", "testValue", 30000L);
            return success(get("testKey"));
        } catch (Exception e) {
            e.printStackTrace();
            return failed();
        }
    }

    @Override
    public ApiResult testLog(@RequestBody Student student, String id, Integer pid) {
        return success(student);
    }
}
