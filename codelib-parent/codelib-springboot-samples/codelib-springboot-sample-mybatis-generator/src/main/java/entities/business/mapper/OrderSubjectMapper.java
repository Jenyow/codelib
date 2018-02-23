package entities.business.mapper;

import entities.business.OrderSubject;
import entities.business.OrderSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSubjectMapper {
    long countByExample(OrderSubjectExample example);

    int deleteByExample(OrderSubjectExample example);

    int deleteByPrimaryKey(Integer subjectId);

    int insert(OrderSubject record);

    int insertSelective(OrderSubject record);

    List<OrderSubject> selectByExample(OrderSubjectExample example);

    OrderSubject selectByPrimaryKey(Integer subjectId);

    int updateByExampleSelective(@Param("record") OrderSubject record, @Param("example") OrderSubjectExample example);

    int updateByExample(@Param("record") OrderSubject record, @Param("example") OrderSubjectExample example);

    int updateByPrimaryKeySelective(OrderSubject record);

    int updateByPrimaryKey(OrderSubject record);
}