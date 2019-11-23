package com.fourkmiles.api.service;

import com.fourkmiles.core.ApiResult;
import com.fourkmiles.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 会员服务接口
 * @author: liuyilei
 * @create: 2019-10-21 14:06
 **/
@RequestMapping("/member")
public interface MemberService {

    @GetMapping("/test")
    public ApiResult test();

    @GetMapping("/testRedis")
    public ApiResult testRedis();

    @PostMapping("/testLog")
    public ApiResult testLog(Student student, String id, Integer pid);
}
