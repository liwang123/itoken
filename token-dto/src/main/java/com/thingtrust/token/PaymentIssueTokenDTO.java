package com.thingtrust.token;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tiny on 2018/6/25.
 *
 * @author tiny
 * @date 2018/06/25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentIssueTokenDTO {

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
     * 资产id
     */
    private String assetId;

    /**
     * 发行者
     */
    private String issuserName;

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
    private Long createTime;
}
