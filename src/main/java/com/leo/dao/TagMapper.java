package com.leo.dao;

import com.leo.dataobject.TagDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TagMapper {

    @Select("SELECT * FROM tag WHERE oId = #{id}")
    TagDO findById(@Param("id") Long id);

}
