package entities.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderMain implements Serializable {
    private Integer orderId;

    private String orderUuid;

    private String orderCode;

    private BigDecimal projectAmount;

    private BigDecimal logisticsAmount;

    private BigDecimal orderAmount;

    private String userId;

    private String userName;

    private String gender;

    private String mobile;

    private Byte age;

    private String address;

    private String hospitalCode;

    private String bedCode;

    private String attendingPhysician;

    private Short invoiceType;

    private String reportType;

    private String logisticsType;

    private Short paidType;

    private Integer orderStatus;

    private String memo;

    private String introduction;

    private String companyId;

    private String doctorId;

    private String professorId;

    private Date createTime;

    private String createUserid;

    private Date modifiedTime;

    private String modifiedUserid;

    private static final long serialVersionUID = 1L;

    public OrderMain(Integer orderId, String orderUuid, String orderCode, BigDecimal projectAmount, BigDecimal logisticsAmount, BigDecimal orderAmount, String userId, String userName, String gender, String mobile, Byte age, String address, String hospitalCode, String bedCode, String attendingPhysician, Short invoiceType, String reportType, String logisticsType, Short paidType, Integer orderStatus, String memo, String introduction, String companyId, String doctorId, String professorId, Date createTime, String createUserid, Date modifiedTime, String modifiedUserid) {
        this.orderId = orderId;
        this.orderUuid = orderUuid;
        this.orderCode = orderCode;
        this.projectAmount = projectAmount;
        this.logisticsAmount = logisticsAmount;
        this.orderAmount = orderAmount;
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.mobile = mobile;
        this.age = age;
        this.address = address;
        this.hospitalCode = hospitalCode;
        this.bedCode = bedCode;
        this.attendingPhysician = attendingPhysician;
        this.invoiceType = invoiceType;
        this.reportType = reportType;
        this.logisticsType = logisticsType;
        this.paidType = paidType;
        this.orderStatus = orderStatus;
        this.memo = memo;
        this.introduction = introduction;
        this.companyId = companyId;
        this.doctorId = doctorId;
        this.professorId = professorId;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.modifiedTime = modifiedTime;
        this.modifiedUserid = modifiedUserid;
    }

    public OrderMain() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid == null ? null : orderUuid.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public BigDecimal getProjectAmount() {
        return projectAmount;
    }

    public void setProjectAmount(BigDecimal projectAmount) {
        this.projectAmount = projectAmount;
    }

    public BigDecimal getLogisticsAmount() {
        return logisticsAmount;
    }

    public void setLogisticsAmount(BigDecimal logisticsAmount) {
        this.logisticsAmount = logisticsAmount;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getBedCode() {
        return bedCode;
    }

    public void setBedCode(String bedCode) {
        this.bedCode = bedCode == null ? null : bedCode.trim();
    }

    public String getAttendingPhysician() {
        return attendingPhysician;
    }

    public void setAttendingPhysician(String attendingPhysician) {
        this.attendingPhysician = attendingPhysician == null ? null : attendingPhysician.trim();
    }

    public Short getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Short invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType == null ? null : reportType.trim();
    }

    public String getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(String logisticsType) {
        this.logisticsType = logisticsType == null ? null : logisticsType.trim();
    }

    public Short getPaidType() {
        return paidType;
    }

    public void setPaidType(Short paidType) {
        this.paidType = paidType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
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

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getModifiedUserid() {
        return modifiedUserid;
    }

    public void setModifiedUserid(String modifiedUserid) {
        this.modifiedUserid = modifiedUserid == null ? null : modifiedUserid.trim();
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
        OrderMain other = (OrderMain) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderUuid() == null ? other.getOrderUuid() == null : this.getOrderUuid().equals(other.getOrderUuid()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getProjectAmount() == null ? other.getProjectAmount() == null : this.getProjectAmount().equals(other.getProjectAmount()))
            && (this.getLogisticsAmount() == null ? other.getLogisticsAmount() == null : this.getLogisticsAmount().equals(other.getLogisticsAmount()))
            && (this.getOrderAmount() == null ? other.getOrderAmount() == null : this.getOrderAmount().equals(other.getOrderAmount()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getHospitalCode() == null ? other.getHospitalCode() == null : this.getHospitalCode().equals(other.getHospitalCode()))
            && (this.getBedCode() == null ? other.getBedCode() == null : this.getBedCode().equals(other.getBedCode()))
            && (this.getAttendingPhysician() == null ? other.getAttendingPhysician() == null : this.getAttendingPhysician().equals(other.getAttendingPhysician()))
            && (this.getInvoiceType() == null ? other.getInvoiceType() == null : this.getInvoiceType().equals(other.getInvoiceType()))
            && (this.getReportType() == null ? other.getReportType() == null : this.getReportType().equals(other.getReportType()))
            && (this.getLogisticsType() == null ? other.getLogisticsType() == null : this.getLogisticsType().equals(other.getLogisticsType()))
            && (this.getPaidType() == null ? other.getPaidType() == null : this.getPaidType().equals(other.getPaidType()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getProfessorId() == null ? other.getProfessorId() == null : this.getProfessorId().equals(other.getProfessorId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserid() == null ? other.getCreateUserid() == null : this.getCreateUserid().equals(other.getCreateUserid()))
            && (this.getModifiedTime() == null ? other.getModifiedTime() == null : this.getModifiedTime().equals(other.getModifiedTime()))
            && (this.getModifiedUserid() == null ? other.getModifiedUserid() == null : this.getModifiedUserid().equals(other.getModifiedUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderUuid() == null) ? 0 : getOrderUuid().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getProjectAmount() == null) ? 0 : getProjectAmount().hashCode());
        result = prime * result + ((getLogisticsAmount() == null) ? 0 : getLogisticsAmount().hashCode());
        result = prime * result + ((getOrderAmount() == null) ? 0 : getOrderAmount().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getHospitalCode() == null) ? 0 : getHospitalCode().hashCode());
        result = prime * result + ((getBedCode() == null) ? 0 : getBedCode().hashCode());
        result = prime * result + ((getAttendingPhysician() == null) ? 0 : getAttendingPhysician().hashCode());
        result = prime * result + ((getInvoiceType() == null) ? 0 : getInvoiceType().hashCode());
        result = prime * result + ((getReportType() == null) ? 0 : getReportType().hashCode());
        result = prime * result + ((getLogisticsType() == null) ? 0 : getLogisticsType().hashCode());
        result = prime * result + ((getPaidType() == null) ? 0 : getPaidType().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getProfessorId() == null) ? 0 : getProfessorId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUserid() == null) ? 0 : getCreateUserid().hashCode());
        result = prime * result + ((getModifiedTime() == null) ? 0 : getModifiedTime().hashCode());
        result = prime * result + ((getModifiedUserid() == null) ? 0 : getModifiedUserid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderUuid=").append(orderUuid);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", projectAmount=").append(projectAmount);
        sb.append(", logisticsAmount=").append(logisticsAmount);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", gender=").append(gender);
        sb.append(", mobile=").append(mobile);
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append(", hospitalCode=").append(hospitalCode);
        sb.append(", bedCode=").append(bedCode);
        sb.append(", attendingPhysician=").append(attendingPhysician);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", reportType=").append(reportType);
        sb.append(", logisticsType=").append(logisticsType);
        sb.append(", paidType=").append(paidType);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", memo=").append(memo);
        sb.append(", introduction=").append(introduction);
        sb.append(", companyId=").append(companyId);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", professorId=").append(professorId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", modifiedUserid=").append(modifiedUserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}