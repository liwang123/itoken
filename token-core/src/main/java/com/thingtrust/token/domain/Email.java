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
	 private Date time; 
		/**
     * 
     */
	 private String emailcol; 
		/**
     * 
     */
	 private String emailcol1; 
	}