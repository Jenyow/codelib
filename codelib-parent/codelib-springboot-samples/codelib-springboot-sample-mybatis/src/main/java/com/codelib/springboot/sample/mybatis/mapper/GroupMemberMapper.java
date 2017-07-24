package com.codelib.springboot.sample.mybatis.mapper;

import com.codelib.springboot.sample.mybatis.pojo.GroupMember;
import com.codelib.springboot.sample.mybatis.pojo.GroupMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupMemberMapper {
    long countByExample(GroupMemberExample example);

    int deleteByExample(GroupMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GroupMember record);

    int insertSelective(GroupMember record);

    List<GroupMember> selectByExample(GroupMemberExample example);

    GroupMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GroupMember record, @Param("example") GroupMemberExample example);

    int updateByExample(@Param("record") GroupMember record, @Param("example") GroupMemberExample example);

    int updateByPrimaryKeySelective(GroupMember record);

    int updateByPrimaryKey(GroupMember record);
}