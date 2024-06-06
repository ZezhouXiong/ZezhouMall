package zezhou.zezhoumall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zezhou.common.utils.PageUtils;
import zezhou.zezhoumall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zezhou
 * @email sunlightcs@gmail.com
 * @date 2024-06-05 20:24:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

