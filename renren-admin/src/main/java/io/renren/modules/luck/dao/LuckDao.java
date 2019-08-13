package io.renren.modules.luck.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.luck.entity.LuckEntity;
import io.renren.modules.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;


/**
 * @auther:zwg
 * @Data:2019/8/13
 **/
@Mapper
public interface LuckDao extends BaseMapper<SysUserEntity> {
    LuckEntity queryNum();
}
