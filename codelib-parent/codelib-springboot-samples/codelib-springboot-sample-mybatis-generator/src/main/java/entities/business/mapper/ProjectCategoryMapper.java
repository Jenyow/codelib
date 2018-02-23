package entities.business.mapper;

import entities.business.ProjectCategory;
import entities.business.ProjectCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectCategoryMapper {
    long countByExample(ProjectCategoryExample example);

    int deleteByExample(ProjectCategoryExample example);

    int deleteByPrimaryKey(String categoryId);

    int insert(ProjectCategory record);

    int insertSelective(ProjectCategory record);

    List<ProjectCategory> selectByExample(ProjectCategoryExample example);

    ProjectCategory selectByPrimaryKey(String categoryId);

    int updateByExampleSelective(@Param("record") ProjectCategory record, @Param("example") ProjectCategoryExample example);

    int updateByExample(@Param("record") ProjectCategory record, @Param("example") ProjectCategoryExample example);

    int updateByPrimaryKeySelective(ProjectCategory record);

    int updateByPrimaryKey(ProjectCategory record);
}