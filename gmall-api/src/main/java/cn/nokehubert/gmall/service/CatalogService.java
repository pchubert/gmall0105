package cn.nokehubert.gmall.service;


import cn.nokehubert.gmall.bean.PmsBaseCatalog1;
import cn.nokehubert.gmall.bean.PmsBaseCatalog2;
import cn.nokehubert.gmall.bean.PmsBaseCatalog3;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/27 16:51
 **/
public interface CatalogService {
    List<PmsBaseCatalog3> getCatalog3(BigInteger catalog2Id);
    List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id);
    List<PmsBaseCatalog1> getCatalog1();
}
