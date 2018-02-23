package entities.business.mapper;

import entities.business.ReadyExpress;
import entities.business.ReadyExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadyExpressMapper {
    long countByExample(ReadyExpressExample example);

    int deleteByExample(ReadyExpressExample example);

    int deleteByPrimaryKey(String expressId);

    int insert(ReadyExpress record);

    int insertSelective(ReadyExpress record);

    List<ReadyExpress> selectByExample(ReadyExpressExample example);

    ReadyExpress selectByPrimaryKey(String expressId);

    int updateByExampleSelective(@Param("record") ReadyExpress record, @Param("example") ReadyExpressExample example);

    int updateByExample(@Param("record") ReadyExpress record, @Param("example") ReadyExpressExample example);

    int updateByPrimaryKeySelective(ReadyExpress record);

    int updateByPrimaryKey(ReadyExpress record);
}