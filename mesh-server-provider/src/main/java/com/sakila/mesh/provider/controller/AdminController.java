package com.sakila.mesh.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Auther: sakila
 * Date: 2020/1/15 20:31
 */
@RestController
@RequestMapping("admin")
public class AdminController {

    @GetMapping("msg/{msgId}")
    public Object getMsgId(@PathVariable Long msgId) {
        System.out.println("请求的MsgId是"+msgId);
        Map<String,Object> map = new HashMap<>();
        map.put("msgId",msgId);
        map.put("header","刘德华");
        map.put("body","hello,world");
        return map;
    }
}
