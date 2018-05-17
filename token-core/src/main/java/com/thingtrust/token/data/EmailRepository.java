package com.thingtrust.token.data;

import com.thingtrust.token.common.mybatis.data.CrudRepository;
import com.thingtrust.token.domain.Email;
import com.thingtrust.token.domain.example.EmailExample;
import org.springframework.stereotype.Repository;

								/**
 *  数据访问类
 * @author wang yu
 * @date 2018-05-17
 */
@Repository
public interface EmailRepository
    extends CrudRepository<Email, EmailExample, Integer> {
}
