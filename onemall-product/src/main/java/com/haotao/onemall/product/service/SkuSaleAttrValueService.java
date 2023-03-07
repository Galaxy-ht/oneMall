package com.haotao.onemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haotao.common.utils.PageUtils;
import com.haotao.onemall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku????????&ֵ
 *
 * @author HaoTao
 * @email mrhaotao@gmail.com
 * @date 2023-03-06 20:54:38
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

