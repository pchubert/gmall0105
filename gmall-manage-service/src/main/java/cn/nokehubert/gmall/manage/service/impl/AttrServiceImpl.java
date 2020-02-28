package cn.nokehubert.gmall.manage.service.impl;

import cn.nokehubert.gmall.bean.PmsBaseAttrInfo;
import cn.nokehubert.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import cn.nokehubert.gmall.service.AttrService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/28 10:27
 **/
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(BigInteger catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo=new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
    }
}
