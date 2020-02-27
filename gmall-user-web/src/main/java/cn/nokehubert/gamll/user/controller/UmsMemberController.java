package cn.nokehubert.gamll.user.controller;

import cn.nokehubert.gmall.bean.UmsMember;
import cn.nokehubert.gmall.service.UmsMemberService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/13 21:21
 **/
@Controller
public class UmsMemberController {

    //注意此处不是 autowired 而是reference 协议代理
    @Reference
    UmsMemberService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "Hello nokehubert!";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers=userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("getById")
    @ResponseBody
    public List<UmsMember> getById(@RequestParam(value = "id")BigInteger id){
        List<UmsMember> umsMembers=userService.getById(id);
        return umsMembers;
    }
}
