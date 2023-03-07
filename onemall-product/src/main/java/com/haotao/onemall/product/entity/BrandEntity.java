package com.haotao.onemall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Ʒ?
 * 
 * @author HaoTao
 * @email mrhaotao@gmail.com
 * @date 2023-03-06 20:54:39
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Ʒ??id
	 */
	@TableId
	private Long brandId;
	/**
	 * Ʒ????
	 */
	private String name;
	/**
	 * Ʒ??logo??ַ
	 */
	private String logo;
	/**
	 * ???
	 */
	private String descript;
	/**
	 * ??ʾ״̬[0-????ʾ??1-??ʾ]
	 */
	private Integer showStatus;
	/**
	 * ????????ĸ
	 */
	private String firstLetter;
	/**
	 * ???
	 */
	private Integer sort;

}
