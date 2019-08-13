package io.renren.modules.luck.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.luck.dao.LuckDao;
import io.renren.modules.luck.entity.LuckEntity;
import io.renren.modules.luck.service.LuckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther:zwg
 * @Data:2019/8/13
 **/
@Service("luckService")
public class LuckServiceImpl implements LuckService {
    @Autowired
    private LuckDao LuckDao;

    @Override
    public LuckEntity queryNum() {
        return LuckDao.queryNum();
    }
}
