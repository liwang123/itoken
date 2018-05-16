package com.thingtrust.token.common.mybatis.data;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface  InsertRepository<T> {
    int insert(@Param("record") T var1);

    int batchInsert(@Param("records") List<T> var1);

    int batchInsertOnDuplicateKey(@Param("records") List<T> var1);
}
