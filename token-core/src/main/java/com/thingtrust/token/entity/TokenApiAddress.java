package com.thingtrust.token.entity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TokenApiAddress {
    private String assetName;

    private String ticker;

    private Long cap;

    private String issuserName;

    private String address;


    @Override
    public String toString() {
        return "TokenApiAddress{" +
                "assetName='" + assetName + '\'' +
                ", ticker='" + ticker + '\'' +
                ", cap=" + cap +
                ", issuserName='" + issuserName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
