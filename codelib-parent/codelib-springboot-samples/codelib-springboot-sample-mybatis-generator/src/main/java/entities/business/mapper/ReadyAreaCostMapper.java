package entities.business.mapper;

import entities.business.ReadyAreaCost;
import entities.business.ReadyAreaCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadyAreaCostMapper {
    long countByExample(ReadyAreaCostExample example);

    int deleteByExample(ReadyAreaCostExample example);

    int deleteByPrimaryKey(String areaCostId);

    int insert(ReadyAreaCost record);

    int insertSelective(ReadyAreaCost record);

    List<ReadyAreaCost> selectByExample(ReadyAreaCostExample example);

    ReadyAreaCost selectByPrimaryKey(String areaCostId);

    int updateByExampleSelective(@Param("record") ReadyAreaCost record, @Param("example") ReadyAreaCostExample example);

    int updateByExample(@Param("record") ReadyAreaCost record, @Param("example") ReadyAreaCostExample example);

    int updateByPrimaryKeySelective(ReadyAreaCost record);

    int updateByPrimaryKey(ReadyAreaCost record);
}