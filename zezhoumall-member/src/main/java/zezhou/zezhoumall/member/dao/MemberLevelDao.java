package zezhou.zezhoumall.member.dao;

import zezhou.zezhoumall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 20:24:04
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
