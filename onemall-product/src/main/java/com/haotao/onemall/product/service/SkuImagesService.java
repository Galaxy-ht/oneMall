package com.haotao.onemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haotao.common.utils.PageUtils;
import com.haotao.onemall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * skuͼƬ
 *
 * @author HaoTao
 * @email mrhaotao@gmail.com
 * @date 2023-03-06 20:54:39
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

