package com.lanzhou.wanshou.service.impl;

import com.lanzhou.wanshou.dao.MeritsDirectionMapper;
import com.lanzhou.wanshou.entity.MeritsDirection;
import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.service.MeritsService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;


@Service
public class MeritsServiceImpl implements MeritsService {


    @Resource
    private MeritsDirectionMapper mapper;

    @Override
    public List<MeritsDirection> queryAllMerits() {
        return mapper.queryAllMerits();
    }

    @Override
    public Integer insertMerit(MeritsDirection meritsDirection) {
        return mapper.insert(meritsDirection);
    }

    @Override
    public Integer deleteMerit(MeritsDirection meritsDirection) {
        Integer meritId = meritsDirection.getId();
        if (StringUtils.isEmpty(meritId)) {
            return -1;
        }
        mapper.deleteByPrimaryKey(meritId);
        return 1;
    }

    @Override
    public Integer updateMerit(MeritsDirection meritsDirection) {
        Integer meritId = meritsDirection.getId();
        String meritName = meritsDirection.getName();
        if (StringUtils.isEmpty(meritId) || StringUtils.isEmpty(meritName)) {
            return -1;
        }
        mapper.updateByPrimaryKeySelective(meritsDirection);
        return 1;
    }
}
