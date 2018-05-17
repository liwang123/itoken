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
 * @author wang yu
 * @date 2018-05-17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class EmailTemplate {
		/**
     * 主键id
     */
	 private Long id; 
		/**
     * 邮件类型
     */
	 private Integer type; 
		/**
     * 主题
     */
	 private String subject; 
		/**
     * 邮件内容
     */
	 private String content; 
		/**
     * 模板名称
     */
	 private String templateName; 
		/**
     * 
     */
	 private Date createTime; 
	}