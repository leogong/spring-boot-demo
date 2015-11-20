package com.leo.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.leo.dataobject.PreferenceDO;

/**
 * Created by leo on 11/19/15.
 */
public interface PreferenceMapper {

    @Select("select * from blog_preference where oId=${id}")
    PreferenceDO findById(@Param("id") String id);
}
