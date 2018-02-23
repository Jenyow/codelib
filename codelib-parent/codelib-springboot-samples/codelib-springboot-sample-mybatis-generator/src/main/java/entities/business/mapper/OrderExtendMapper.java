package entities.business.mapper;

import entities.business.OrderExtend;
import entities.business.OrderExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderExtendMapper {
    long countByExample(OrderExtendExample example);

    int deleteByExample(OrderExtendExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderExtend record);

    int insertSelective(OrderExtend record);

    List<OrderExtend> selectByExample(OrderExtendExample example);

    OrderExtend selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") OrderExtend record, @Param("example") OrderExtendExample example);

    int updateByExample(@Param("record") OrderExtend record, @Param("example") OrderExtendExample example);

    int updateByPrimaryKeySelective(OrderExtend record);

    int updateByPrimaryKey(OrderExtend record);
}