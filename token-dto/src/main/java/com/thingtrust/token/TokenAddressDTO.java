package com.thingtrust.token;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈tokenaddress〉
 *
 * @author WangYu
 * @create 2018/6/5
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenAddressDTO {

    private String address;
}
