package cn.nokehubert.gmall.manage.controller;

import cn.nokehubert.gmall.bean.PmsBaseCatalog1;
import cn.nokehubert.gmall.bean.PmsBaseCatalog2;
import cn.nokehubert.gmall.bean.PmsBaseCatalog3;
import cn.nokehubert.gmall.service.CatalogService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/27 16:37
 **/
// 跨域处理
@CrossOrigin
@Controller
public class CatalogController {
    @Reference
    private CatalogService catalogService;

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(BigInteger catalog2Id){
        List<PmsBaseCatalog3> catalog3s=catalogService.getCatalog3(catalog2Id);
        return catalog3s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id){
        List<PmsBaseCatalog2> catalog2s=catalogService.getCatalog2(catalog1Id);
        return catalog2s;
    }

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> list=catalogService.getCatalog1();
        return list;
    }

}
