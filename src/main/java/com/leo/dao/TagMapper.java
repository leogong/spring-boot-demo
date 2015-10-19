package com.leo.dao;

import com.leo.dataobject.TagDO;
import org.apache.ibatis.annotations.Param;

public interface TagMapper {

    // @Select("select `id`, `name`, `regdt`, `modidt` from `study` where `id` = #{id}")
    TagDO findById(@Param("id") Long id);

}
