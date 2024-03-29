package com.haotao.onemall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.haotao.onemall.product.entity.BrandEntity;
import com.haotao.onemall.product.service.BrandService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OnemallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//
//        System.out.println("保存成功…………");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
