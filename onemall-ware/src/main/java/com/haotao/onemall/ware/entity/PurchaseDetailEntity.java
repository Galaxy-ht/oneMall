package com.haotao.onemall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author HaoTao
 * @email mrhaotao@gmail.com
 * @date 2023-03-07 15:16:06
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * ?ɹ???id
	 */
	private Long purchaseId;
	/**
	 * ?ɹ???Ʒid
	 */
	private Long skuId;
	/**
	 * ?ɹ?????
	 */
	private Integer skuNum;
	/**
	 * ?ɹ??
	 */
	private BigDecimal skuPrice;
	/**
	 * ?ֿ?id
	 */
	private Long wareId;
	/**
	 * ״̬[0?½???1?ѷ??䣬2???ڲɹ???3?????ɣ?4?ɹ?ʧ??]
	 */
	private Integer status;

}
