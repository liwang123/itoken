package com.thingtrust.token;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenByAssetDTO {

    private String assetName;

    private String issuserName;

    private String symbol;
}
