package entities.business.mapper;

import entities.business.FinanceVoucher;
import entities.business.FinanceVoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceVoucherMapper {
    long countByExample(FinanceVoucherExample example);

    int deleteByExample(FinanceVoucherExample example);

    int deleteByPrimaryKey(Integer voucherId);

    int insert(FinanceVoucher record);

    int insertSelective(FinanceVoucher record);

    List<FinanceVoucher> selectByExample(FinanceVoucherExample example);

    FinanceVoucher selectByPrimaryKey(Integer voucherId);

    int updateByExampleSelective(@Param("record") FinanceVoucher record, @Param("example") FinanceVoucherExample example);

    int updateByExample(@Param("record") FinanceVoucher record, @Param("example") FinanceVoucherExample example);

    int updateByPrimaryKeySelective(FinanceVoucher record);

    int updateByPrimaryKey(FinanceVoucher record);
}