package io.renren.modules.luck.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.modules.luck.entity.LuckEntity;

/**
 * @auther:zwg
 * @Data:2019/8/13
 **/

public interface LuckService{
    LuckEntity queryNum();
}
