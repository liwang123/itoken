package com.thingtrust.token.domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TokenApi {
    private String assetName;

    private String ticker;

    private Long cap;

    private String issuserName;

    private String email;

    private String descript;

}
