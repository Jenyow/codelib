package com.codelib.springboot.sample.mybatis.mapper;

import com.codelib.springboot.sample.mybatis.pojo.GroupAuthority;
import com.codelib.springboot.sample.mybatis.pojo.GroupAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupAuthorityMapper {
    long countByExample(GroupAuthorityExample example);

    int deleteByExample(GroupAuthorityExample example);

    int insert(GroupAuthority record);

    int insertSelective(GroupAuthority record);

    List<GroupAuthority> selectByExample(GroupAuthorityExample example);

    int updateByExampleSelective(@Param("record") GroupAuthority record, @Param("example") GroupAuthorityExample example);

    int updateByExample(@Param("record") GroupAuthority record, @Param("example") GroupAuthorityExample example);
}