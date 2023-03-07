package com.haotao.onemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haotao.common.utils.PageUtils;
import com.haotao.onemall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * ??Ʒ???ۻظ???ϵ
 *
 * @author HaoTao
 * @email mrhaotao@gmail.com
 * @date 2023-03-06 20:54:39
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

