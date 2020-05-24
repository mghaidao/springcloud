package com.xyz.springcloud.mapper;

import com.xyz.springcloud.entity.Pay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;

@Mapper
public interface PayMapper {
    @Select("select * from pay where id = #{id}")
    Pay selectById(Serializable id);
}
