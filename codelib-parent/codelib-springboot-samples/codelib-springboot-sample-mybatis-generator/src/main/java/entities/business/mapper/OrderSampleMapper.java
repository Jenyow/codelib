package entities.business.mapper;

import entities.business.OrderSample;
import entities.business.OrderSampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSampleMapper {
    long countByExample(OrderSampleExample example);

    int deleteByExample(OrderSampleExample example);

    int deleteByPrimaryKey(Integer sampleId);

    int insert(OrderSample record);

    int insertSelective(OrderSample record);

    List<OrderSample> selectByExample(OrderSampleExample example);

    OrderSample selectByPrimaryKey(Integer sampleId);

    int updateByExampleSelective(@Param("record") OrderSample record, @Param("example") OrderSampleExample example);

    int updateByExample(@Param("record") OrderSample record, @Param("example") OrderSampleExample example);

    int updateByPrimaryKeySelective(OrderSample record);

    int updateByPrimaryKey(OrderSample record);
}