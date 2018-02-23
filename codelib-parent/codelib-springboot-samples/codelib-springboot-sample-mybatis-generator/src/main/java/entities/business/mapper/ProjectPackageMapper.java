package entities.business.mapper;

import entities.business.ProjectPackage;
import entities.business.ProjectPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectPackageMapper {
    long countByExample(ProjectPackageExample example);

    int deleteByExample(ProjectPackageExample example);

    int deleteByPrimaryKey(String packageId);

    int insert(ProjectPackage record);

    int insertSelective(ProjectPackage record);

    List<ProjectPackage> selectByExample(ProjectPackageExample example);

    ProjectPackage selectByPrimaryKey(String packageId);

    int updateByExampleSelective(@Param("record") ProjectPackage record, @Param("example") ProjectPackageExample example);

    int updateByExample(@Param("record") ProjectPackage record, @Param("example") ProjectPackageExample example);

    int updateByPrimaryKeySelective(ProjectPackage record);

    int updateByPrimaryKey(ProjectPackage record);
}