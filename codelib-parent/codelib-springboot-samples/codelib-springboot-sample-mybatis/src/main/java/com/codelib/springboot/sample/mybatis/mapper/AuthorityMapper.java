package com.codelib.springboot.sample.mybatis.mapper;

import com.codelib.springboot.sample.mybatis.pojo.Authority;
import com.codelib.springboot.sample.mybatis.pojo.AuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityMapper {
    long countByExample(AuthorityExample example);

    int deleteByExample(AuthorityExample example);

    int insert(Authority record);

    int insertSelective(Authority record);

    List<Authority> selectByExample(AuthorityExample example);

    int updateByExampleSelective(@Param("record") Authority record, @Param("example") AuthorityExample example);

    int updateByExample(@Param("record") Authority record, @Param("example") AuthorityExample example);
}