package entities.business.mapper;

import entities.business.FinanceVoucherExtend;
import entities.business.FinanceVoucherExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceVoucherExtendMapper {
    long countByExample(FinanceVoucherExtendExample example);

    int deleteByExample(FinanceVoucherExtendExample example);

    int deleteByPrimaryKey(Integer voucherId);

    int insert(FinanceVoucherExtend record);

    int insertSelective(FinanceVoucherExtend record);

    List<FinanceVoucherExtend> selectByExample(FinanceVoucherExtendExample example);

    FinanceVoucherExtend selectByPrimaryKey(Integer voucherId);

    int updateByExampleSelective(@Param("record") FinanceVoucherExtend record, @Param("example") FinanceVoucherExtendExample example);

    int updateByExample(@Param("record") FinanceVoucherExtend record, @Param("example") FinanceVoucherExtendExample example);

    int updateByPrimaryKeySelective(FinanceVoucherExtend record);

    int updateByPrimaryKey(FinanceVoucherExtend record);
}