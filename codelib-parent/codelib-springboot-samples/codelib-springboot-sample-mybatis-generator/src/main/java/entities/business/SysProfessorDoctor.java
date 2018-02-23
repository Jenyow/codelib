package entities.business;

import java.io.Serializable;
import java.util.Date;

public class SysProfessorDoctor implements Serializable {
    private Integer doctorProfessorId;

    private String doctorId;

    private String professorId;

    private String companyId;

    private Boolean isEnabled;

    private Boolean isDeleted;

    private Date createTime;

    private String createUserid;

    private static final long serialVersionUID = 1L;

    public SysProfessorDoctor(Integer doctorProfessorId, String doctorId, String professorId, String companyId, Boolean isEnabled, Boolean isDeleted, Date createTime, String createUserid) {
        this.doctorProfessorId = doctorProfessorId;
        this.doctorId = doctorId;
        this.professorId = professorId;
        this.companyId = companyId;
        this.isEnabled = isEnabled;
        this.isDeleted = isDeleted;
        this.createTime = createTime;
        this.createUserid = createUserid;
    }

    public SysProfessorDoctor() {
        super();
    }

    public Integer getDoctorProfessorId() {
        return doctorProfessorId;
    }

    public void setDoctorProfessorId(Integer doctorProfessorId) {
        this.doctorProfessorId = doctorProfessorId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId == null ? null : professorId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid == null ? null : createUserid.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysProfessorDoctor other = (SysProfessorDoctor) that;
        return (this.getDoctorProfessorId() == null ? other.getDoctorProfessorId() == null : this.getDoctorProfessorId().equals(other.getDoctorProfessorId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getProfessorId() == null ? other.getProfessorId() == null : this.getProfessorId().equals(other.getProfessorId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getIsEnabled() == null ? other.getIsEnabled() == null : this.getIsEnabled().equals(other.getIsEnabled()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserid() == null ? other.getCreateUserid() == null : this.getCreateUserid().equals(other.getCreateUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoctorProfessorId() == null) ? 0 : getDoctorProfessorId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getProfessorId() == null) ? 0 : getProfessorId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUserid() == null) ? 0 : getCreateUserid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctorProfessorId=").append(doctorProfessorId);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", professorId=").append(professorId);
        sb.append(", companyId=").append(companyId);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}