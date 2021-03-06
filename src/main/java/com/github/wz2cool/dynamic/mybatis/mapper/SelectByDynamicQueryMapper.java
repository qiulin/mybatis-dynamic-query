package com.github.wz2cool.dynamic.mybatis.mapper;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.github.wz2cool.dynamic.mybatis.mapper.constant.MapperConstants;
import com.github.wz2cool.dynamic.mybatis.mapper.provider.DynamicQueryProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Frank
 * \* Date: 8/8/2017
 * \* Time: 5:39 PM
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface SelectByDynamicQueryMapper<T> {

    @SelectProvider(type = DynamicQueryProvider.class, method = "dynamicSQL")
    List<T> selectByDynamicQuery(@Param(MapperConstants.DYNAMIC_QUERY) DynamicQuery<T> dynamicQuery);
}