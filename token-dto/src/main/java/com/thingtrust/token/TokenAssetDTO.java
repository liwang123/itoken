package com.thingtrust.token;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tiny on 2018/6/11.
 *
 * @author tiny
 * @date 2018/06/11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenAssetDTO {

    private String assetId;
}
