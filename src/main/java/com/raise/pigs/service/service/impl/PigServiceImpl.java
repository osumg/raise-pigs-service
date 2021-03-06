package com.raise.pigs.service.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.raise.pigs.service.entity.Pig;
import com.raise.pigs.service.mapper.KindMapper;
import com.raise.pigs.service.mapper.PigMapper;
import com.raise.pigs.service.po.kind.KindFindPO;
import com.raise.pigs.service.po.pig.FindPigPO;
import com.raise.pigs.service.service.IPigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.raise.pigs.service.vo.kind.KindFindVO;
import com.raise.pigs.service.vo.pig.FindPigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 猪表 服务实现类
 * </p>
 *
 * @author osumg
 * @since 2020-08-20
 */
@Service
public class PigServiceImpl extends ServiceImpl<PigMapper, Pig> implements IPigService {
    @Autowired
    private PigMapper pigMapper;

    @Override
    public IPage<FindPigPO> findPig(Page<FindPigPO> page, FindPigVO findPigVO) {
        return pigMapper.findPig(page, findPigVO);
    }
}
