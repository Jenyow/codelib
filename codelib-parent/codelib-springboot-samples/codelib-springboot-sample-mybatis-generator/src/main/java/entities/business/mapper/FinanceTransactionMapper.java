package entities.business.mapper;

import entities.business.FinanceTransaction;
import entities.business.FinanceTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceTransactionMapper {
    long countByExample(FinanceTransactionExample example);

    int deleteByExample(FinanceTransactionExample example);

    int deleteByPrimaryKey(Integer transactionId);

    int insert(FinanceTransaction record);

    int insertSelective(FinanceTransaction record);

    List<FinanceTransaction> selectByExampleWithBLOBs(FinanceTransactionExample example);

    List<FinanceTransaction> selectByExample(FinanceTransactionExample example);

    FinanceTransaction selectByPrimaryKey(Integer transactionId);

    int updateByExampleSelective(@Param("record") FinanceTransaction record, @Param("example") FinanceTransactionExample example);

    int updateByExampleWithBLOBs(@Param("record") FinanceTransaction record, @Param("example") FinanceTransactionExample example);

    int updateByExample(@Param("record") FinanceTransaction record, @Param("example") FinanceTransactionExample example);

    int updateByPrimaryKeySelective(FinanceTransaction record);

    int updateByPrimaryKeyWithBLOBs(FinanceTransaction record);

    int updateByPrimaryKey(FinanceTransaction record);
}