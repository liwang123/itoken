package com.thingtrust.token.entity;

import lombok.*;

/**
 * Created by tiny on 2018/6/27.
 *
 * @author tiny
 * @date 2018/06/27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WxLoginEntity {

    private String code;

    private String rawData;

    private String signature;

    private String encryptedData;

    private String iv;
}
