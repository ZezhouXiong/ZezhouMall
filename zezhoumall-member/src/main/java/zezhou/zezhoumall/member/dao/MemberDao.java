package zezhou.zezhoumall.member.dao;

import zezhou.zezhoumall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 20:24:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
