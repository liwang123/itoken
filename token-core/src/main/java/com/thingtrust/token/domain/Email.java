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
public class Email {
		/**
     * 
     */
	 private Integer id;
		/**
     * 
     */
	 private String email;
		/**
     * 
     */
	 private Integer status;
		/**
     * 
     */
	 private Integer operator;
		/**
     * 
     */
	 private LocalDateTime time;
		/**
     * 
     */
	 private String emailcol;
		/**
     * 
     */
	 private String emailcol1;
	}
