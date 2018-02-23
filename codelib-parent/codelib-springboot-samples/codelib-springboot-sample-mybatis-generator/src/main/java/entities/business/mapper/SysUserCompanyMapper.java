package entities.business.mapper;

import entities.business.SysUserCompany;
import entities.business.SysUserCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserCompanyMapper {
    long countByExample(SysUserCompanyExample example);

    int deleteByExample(SysUserCompanyExample example);

    int deleteByPrimaryKey(Integer userCompanyId);

    int insert(SysUserCompany record);

    int insertSelective(SysUserCompany record);

    List<SysUserCompany> selectByExample(SysUserCompanyExample example);

    SysUserCompany selectByPrimaryKey(Integer userCompanyId);

    int updateByExampleSelective(@Param("record") SysUserCompany record, @Param("example") SysUserCompanyExample example);

    int updateByExample(@Param("record") SysUserCompany record, @Param("example") SysUserCompanyExample example);

    int updateByPrimaryKeySelective(SysUserCompany record);

    int updateByPrimaryKey(SysUserCompany record);
}