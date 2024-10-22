package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SetmealMapper {
    /**
     * 根据分类id查询菜品数量
     * @param id
     */
    @Select("select count(id) from setmeal where category_id = #{id};")
    Integer countByCategoryId(Long id);
}
