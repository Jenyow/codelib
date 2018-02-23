package entities.business.mapper;

import entities.business.FinanceFund;
import entities.business.FinanceFundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceFundMapper {
    long countByExample(FinanceFundExample example);

    int deleteByExample(FinanceFundExample example);

    int deleteByPrimaryKey(Integer fundId);

    int insert(FinanceFund record);

    int insertSelective(FinanceFund record);

    List<FinanceFund> selectByExample(FinanceFundExample example);

    FinanceFund selectByPrimaryKey(Integer fundId);

    int updateByExampleSelective(@Param("record") FinanceFund record, @Param("example") FinanceFundExample example);

    int updateByExample(@Param("record") FinanceFund record, @Param("example") FinanceFundExample example);

    int updateByPrimaryKeySelective(FinanceFund record);

    int updateByPrimaryKey(FinanceFund record);
}