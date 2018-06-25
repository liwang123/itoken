package com.thingtrust.token.entity;

import lombok.*;

import java.time.LocalDateTime;

/**
 * Created by tiny on 2018/6/25.
 *
 * @author tiny
 * @date 2018/06/25
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PaymentTokenIssuserEntity {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 资产名称
     */
    private String assetName;

    /**
     * 币种符号
     */
    private String symbol;

    /**
     * 发行者
     */
    private String issuserName;

    /**
     * 资产id
     */
    private String assetId;

    /**
     * 发型数量
     */
    private Long cap;

    /**
     * 描述
     */
    private String descript;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

}
