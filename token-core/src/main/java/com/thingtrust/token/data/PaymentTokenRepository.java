package com.thingtrust.token.data;

import com.thingtrust.token.common.mybatis.data.CrudRepository;
import com.thingtrust.token.domain.PaymentToken;
import com.thingtrust.token.domain.example.PaymentTokenExample;
import org.springframework.stereotype.Repository;

											/**
 *  数据访问类
 * @author wang yu
 * @date 2018-05-17
 */
@Repository
public interface PaymentTokenRepository
    extends CrudRepository<PaymentToken, PaymentTokenExample, Long> {
}
