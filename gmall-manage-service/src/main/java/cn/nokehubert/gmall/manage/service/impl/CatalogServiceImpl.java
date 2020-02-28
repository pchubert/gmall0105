package cn.nokehubert.gmall.manage.service.impl;

import cn.nokehubert.gmall.bean.PmsBaseCatalog1;
import cn.nokehubert.gmall.bean.PmsBaseCatalog2;
import cn.nokehubert.gmall.bean.PmsBaseCatalog3;
import cn.nokehubert.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import cn.nokehubert.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import cn.nokehubert.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import cn.nokehubert.gmall.service.CatalogService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/27 16:54
 **/
@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog3> getCatalog3(BigInteger catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3=new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        return pmsBaseCatalog3Mapper.select(pmsBaseCatalog3);
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2=new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        return pmsBaseCatalog2Mapper.select(pmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }
}
