package entities.business.mapper;

import entities.business.SysProfessorDoctor;
import entities.business.SysProfessorDoctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProfessorDoctorMapper {
    long countByExample(SysProfessorDoctorExample example);

    int deleteByExample(SysProfessorDoctorExample example);

    int deleteByPrimaryKey(Integer doctorProfessorId);

    int insert(SysProfessorDoctor record);

    int insertSelective(SysProfessorDoctor record);

    List<SysProfessorDoctor> selectByExample(SysProfessorDoctorExample example);

    SysProfessorDoctor selectByPrimaryKey(Integer doctorProfessorId);

    int updateByExampleSelective(@Param("record") SysProfessorDoctor record, @Param("example") SysProfessorDoctorExample example);

    int updateByExample(@Param("record") SysProfessorDoctor record, @Param("example") SysProfessorDoctorExample example);

    int updateByPrimaryKeySelective(SysProfessorDoctor record);

    int updateByPrimaryKey(SysProfessorDoctor record);
}