package cn.nokehubert.gmall.manage.controller;

import cn.nokehubert.gmall.bean.PmsBaseAttrInfo;
import cn.nokehubert.gmall.service.AttrService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/28 10:32
 **/
@Controller
@CrossOrigin
public class AttrController {
    @Reference
    private AttrService attrService;

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        return "success";
    }

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(BigInteger catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos=attrService.attrInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }
}
