package com.thingtrust.token.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author wangyu
 * @date 2018-05-05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Token {
	/**
     * 
     */
	 private Integer id; 
		/**
     * 资产名称
     */
	 private String assetName; 
		/**
     * 资产单位
     */
	 private String ticker; 
		/**
     * 发行数量
     */
	 private Long cap; 
		/**
     * 发行者
     */
	 private String issuserName; 
		/**
     * 收款地址
     */
	 private String address; 
		/**
     * 审核地址
     */
	 private Integer reviewStatus; 
		/**
     * 付款地址
     */
	 private Integer payStatus; 
		/**
     * 邮箱
     */
	 private String email; 
		/**
     * 操作者
     */
	 private Integer operator; 
		/**
     * 创建时间
     */
	 private Date crtTime; 
		/**
     * 操作时间
     */
	 private Date operatorTime; 
		/**
     * 邮箱id
     */
	 private Integer emailId; 
		/**
     * 
     */
	 private String tokencol; 
		/**
     * 
     */
	 private String tokencol1; 
	}