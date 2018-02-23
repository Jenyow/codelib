package entities.business.mapper;

import entities.business.MobileAdvertisement;
import entities.business.MobileAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileAdvertisementMapper {
    long countByExample(MobileAdvertisementExample example);

    int deleteByExample(MobileAdvertisementExample example);

    int insert(MobileAdvertisement record);

    int insertSelective(MobileAdvertisement record);

    List<MobileAdvertisement> selectByExample(MobileAdvertisementExample example);

    int updateByExampleSelective(@Param("record") MobileAdvertisement record, @Param("example") MobileAdvertisementExample example);

    int updateByExample(@Param("record") MobileAdvertisement record, @Param("example") MobileAdvertisementExample example);
}