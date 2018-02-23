package entities.business.mapper;

import entities.business.ReadyArea;
import entities.business.ReadyAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadyAreaMapper {
    long countByExample(ReadyAreaExample example);

    int deleteByExample(ReadyAreaExample example);

    int deleteByPrimaryKey(String areaId);

    int insert(ReadyArea record);

    int insertSelective(ReadyArea record);

    List<ReadyArea> selectByExample(ReadyAreaExample example);

    ReadyArea selectByPrimaryKey(String areaId);

    int updateByExampleSelective(@Param("record") ReadyArea record, @Param("example") ReadyAreaExample example);

    int updateByExample(@Param("record") ReadyArea record, @Param("example") ReadyAreaExample example);

    int updateByPrimaryKeySelective(ReadyArea record);

    int updateByPrimaryKey(ReadyArea record);
}