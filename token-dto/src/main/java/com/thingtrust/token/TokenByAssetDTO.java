package com.thingtrust.token;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenByAssetDTO {

    private String assetName;

    private String issuserName;

    private String symbol;
}
