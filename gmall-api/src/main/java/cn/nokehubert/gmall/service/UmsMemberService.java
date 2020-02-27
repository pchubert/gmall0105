package cn.nokehubert.gmall.service;

import cn.nokehubert.gmall.bean.UmsMember;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/13 21:18
 **/
public interface UmsMemberService {
    List<UmsMember> getAllUser();

    List<UmsMember> getById(BigInteger id);
}
