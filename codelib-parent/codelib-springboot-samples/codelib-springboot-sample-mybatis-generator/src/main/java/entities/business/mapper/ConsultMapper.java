package entities.business.mapper;

import entities.business.Consult;
import entities.business.ConsultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsultMapper {
    long countByExample(ConsultExample example);

    int deleteByExample(ConsultExample example);

    int deleteByPrimaryKey(Integer consultId);

    int insert(Consult record);

    int insertSelective(Consult record);

    List<Consult> selectByExampleWithBLOBs(ConsultExample example);

    List<Consult> selectByExample(ConsultExample example);

    Consult selectByPrimaryKey(Integer consultId);

    int updateByExampleSelective(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByExampleWithBLOBs(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByExample(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKeyWithBLOBs(Consult record);

    int updateByPrimaryKey(Consult record);
}