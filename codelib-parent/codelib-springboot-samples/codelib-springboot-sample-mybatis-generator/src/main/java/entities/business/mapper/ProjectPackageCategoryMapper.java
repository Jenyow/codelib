package entities.business.mapper;

import entities.business.ProjectPackageCategory;
import entities.business.ProjectPackageCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectPackageCategoryMapper {
    long countByExample(ProjectPackageCategoryExample example);

    int deleteByExample(ProjectPackageCategoryExample example);

    int deleteByPrimaryKey(String categoryId);

    int insert(ProjectPackageCategory record);

    int insertSelective(ProjectPackageCategory record);

    List<ProjectPackageCategory> selectByExample(ProjectPackageCategoryExample example);

    ProjectPackageCategory selectByPrimaryKey(String categoryId);

    int updateByExampleSelective(@Param("record") ProjectPackageCategory record, @Param("example") ProjectPackageCategoryExample example);

    int updateByExample(@Param("record") ProjectPackageCategory record, @Param("example") ProjectPackageCategoryExample example);

    int updateByPrimaryKeySelective(ProjectPackageCategory record);

    int updateByPrimaryKey(ProjectPackageCategory record);
}