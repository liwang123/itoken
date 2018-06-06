package com.thingtrust.token;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenForPaymentInfoDTO {

    private Long id;

    private Integer errCode;

}
