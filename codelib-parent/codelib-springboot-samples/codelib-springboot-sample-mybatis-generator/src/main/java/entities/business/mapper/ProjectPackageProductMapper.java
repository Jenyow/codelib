package entities.business.mapper;

import entities.business.ProjectPackageProduct;
import entities.business.ProjectPackageProductExample;
import entities.business.ProjectPackageProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectPackageProductMapper {
    long countByExample(ProjectPackageProductExample example);

    int deleteByExample(ProjectPackageProductExample example);

    int deleteByPrimaryKey(ProjectPackageProductKey key);

    int insert(ProjectPackageProduct record);

    int insertSelective(ProjectPackageProduct record);

    List<ProjectPackageProduct> selectByExample(ProjectPackageProductExample example);

    ProjectPackageProduct selectByPrimaryKey(ProjectPackageProductKey key);

    int updateByExampleSelective(@Param("record") ProjectPackageProduct record, @Param("example") ProjectPackageProductExample example);

    int updateByExample(@Param("record") ProjectPackageProduct record, @Param("example") ProjectPackageProductExample example);

    int updateByPrimaryKeySelective(ProjectPackageProduct record);

    int updateByPrimaryKey(ProjectPackageProduct record);
}