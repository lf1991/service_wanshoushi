package com.lanzhou.wanshou.service.impl;

import com.lanzhou.wanshou.dao.MeritsDirectionMapper;
import com.lanzhou.wanshou.entity.MeritsDirection;
import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.service.MeritsService;
import org.springframework.stereotype.Service;

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
}
