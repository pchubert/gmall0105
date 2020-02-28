package cn.nokehubert.gmall.service;

import cn.nokehubert.gmall.bean.PmsBaseAttrInfo;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/28 10:22
 **/
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(BigInteger catalog3Id);
}
