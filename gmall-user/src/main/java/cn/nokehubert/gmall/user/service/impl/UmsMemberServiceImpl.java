package cn.nokehubert.gmall.user.service.impl;

import cn.nokehubert.gmall.bean.UmsMember;
import cn.nokehubert.gmall.service.UmsMemberService;
import cn.nokehubert.gmall.user.mapper.UmsMemberMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/13 21:18
 **/
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMember> getById(BigInteger id) {
//        //封装参数对象
        UmsMember umsMember =new UmsMember();
        umsMember.setId(id);

        List<UmsMember> umsMembers = userMapper.select(umsMember);
        return umsMembers;
    }

}
