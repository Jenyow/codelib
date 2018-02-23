package entities.business.mapper;

import entities.business.ProjectProduct;
import entities.business.ProjectProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectProductMapper {
    long countByExample(ProjectProductExample example);

    int deleteByExample(ProjectProductExample example);

    int deleteByPrimaryKey(String productId);

    int insert(ProjectProduct record);

    int insertSelective(ProjectProduct record);

    List<ProjectProduct> selectByExample(ProjectProductExample example);

    ProjectProduct selectByPrimaryKey(String productId);

    int updateByExampleSelective(@Param("record") ProjectProduct record, @Param("example") ProjectProductExample example);

    int updateByExample(@Param("record") ProjectProduct record, @Param("example") ProjectProductExample example);

    int updateByPrimaryKeySelective(ProjectProduct record);

    int updateByPrimaryKey(ProjectProduct record);
}