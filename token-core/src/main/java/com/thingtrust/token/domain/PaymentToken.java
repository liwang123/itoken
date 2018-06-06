package com.thingtrust.token.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 
 * @author wang yu
 * @date 2018-06-05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PaymentToken {
		/**
     * 主键id
     */
	 private Long id;
		/**
     * token表id
     */
	 private Long tokenId;
		/**
     * 币种符号
     */
	 private String symbol;
		/**
     * 资产名称
     */
	 private String assetName;
		/**
     * 资产id
     */
	 private String assetId;
		/**
     * 发行者
     */
	 private String issuserName;
		/**
     * email外键
     */
	 private Long emailId;
		/**
     * 收款地址
     */
	 private String address;
		/**
     * 描述
     */
	 private String descript;
		/**
     * 创建时间
     */
	 private LocalDateTime createTime;
	}
