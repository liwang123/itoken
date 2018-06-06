package com.thingtrust.token.data;

import com.thingtrust.token.common.mybatis.data.CrudRepository;
import com.thingtrust.token.domain.Token;
import com.thingtrust.token.domain.example.TokenExample;
import org.springframework.stereotype.Repository;

																		/**
 *  数据访问类
 * @author wang yu
 * @date 2018-06-05
 */
@Repository
public interface TokenRepository
    extends CrudRepository<Token, TokenExample, Long> {
}
