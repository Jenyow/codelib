package entities.business.mapper;

import entities.business.OrderCart;
import entities.business.OrderCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCartMapper {
    long countByExample(OrderCartExample example);

    int deleteByExample(OrderCartExample example);

    int deleteByPrimaryKey(Integer cartId);

    int insert(OrderCart record);

    int insertSelective(OrderCart record);

    List<OrderCart> selectByExample(OrderCartExample example);

    OrderCart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") OrderCart record, @Param("example") OrderCartExample example);

    int updateByExample(@Param("record") OrderCart record, @Param("example") OrderCartExample example);

    int updateByPrimaryKeySelective(OrderCart record);

    int updateByPrimaryKey(OrderCart record);
}