package entities.business.mapper;

import entities.business.OrderLogistics;
import entities.business.OrderLogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLogisticsMapper {
    long countByExample(OrderLogisticsExample example);

    int deleteByExample(OrderLogisticsExample example);

    int deleteByPrimaryKey(Integer logisticsId);

    int insert(OrderLogistics record);

    int insertSelective(OrderLogistics record);

    List<OrderLogistics> selectByExample(OrderLogisticsExample example);

    OrderLogistics selectByPrimaryKey(Integer logisticsId);

    int updateByExampleSelective(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByExample(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByPrimaryKeySelective(OrderLogistics record);

    int updateByPrimaryKey(OrderLogistics record);
}