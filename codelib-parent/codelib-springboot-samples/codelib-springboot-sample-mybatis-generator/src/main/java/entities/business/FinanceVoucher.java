package entities.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinanceVoucher implements Serializable {
    private Integer voucherId;

    private Integer orderId;

    private String voucherCode;

    private BigDecimal voucherAmount;

    private Short paidType;

    private Date fundDate;

    private Boolean isInvoiced;

    private Short invoicedStatus;

    private String invoicedUserName;

    private Date invoicedDate;

    private String auditUserId;

    private Short auditStatus;

    private Date auditTime;

    private Short voucherStatus;

    private Date accountingDate;

    private Boolean isDeleted;

    private String memo;

    private Date createTime;

    private String createUserid;

    private Date modifiedTime;

    private String modifiedUserid;

    private static final long serialVersionUID = 1L;

    public FinanceVoucher(Integer voucherId, Integer orderId, String voucherCode, BigDecimal voucherAmount, Short paidType, Date fundDate, Boolean isInvoiced, Short invoicedStatus, String invoicedUserName, Date invoicedDate, String auditUserId, Short auditStatus, Date auditTime, Short voucherStatus, Date accountingDate, Boolean isDeleted, String memo, Date createTime, String createUserid, Date modifiedTime, String modifiedUserid) {
        this.voucherId = voucherId;
        this.orderId = orderId;
        this.voucherCode = voucherCode;
        this.voucherAmount = voucherAmount;
        this.paidType = paidType;
        this.fundDate = fundDate;
        this.isInvoiced = isInvoiced;
        this.invoicedStatus = invoicedStatus;
        this.invoicedUserName = invoicedUserName;
        this.invoicedDate = invoicedDate;
        this.auditUserId = auditUserId;
        this.auditStatus = auditStatus;
        this.auditTime = auditTime;
        this.voucherStatus = voucherStatus;
        this.accountingDate = accountingDate;
        this.isDeleted = isDeleted;
        this.memo = memo;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.modifiedTime = modifiedTime;
        this.modifiedUserid = modifiedUserid;
    }

    public FinanceVoucher() {
        super();
    }

    public Integer getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode == null ? null : voucherCode.trim();
    }

    public BigDecimal getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(BigDecimal voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public Short getPaidType() {
        return paidType;
    }

    public void setPaidType(Short paidType) {
        this.paidType = paidType;
    }

    public Date getFundDate() {
        return fundDate;
    }

    public void setFundDate(Date fundDate) {
        this.fundDate = fundDate;
    }

    public Boolean getIsInvoiced() {
        return isInvoiced;
    }

    public void setIsInvoiced(Boolean isInvoiced) {
        this.isInvoiced = isInvoiced;
    }

    public Short getInvoicedStatus() {
        return invoicedStatus;
    }

    public void setInvoicedStatus(Short invoicedStatus) {
        this.invoicedStatus = invoicedStatus;
    }

    public String getInvoicedUserName() {
        return invoicedUserName;
    }

    public void setInvoicedUserName(String invoicedUserName) {
        this.invoicedUserName = invoicedUserName == null ? null : invoicedUserName.trim();
    }

    public Date getInvoicedDate() {
        return invoicedDate;
    }

    public void setInvoicedDate(Date invoicedDate) {
        this.invoicedDate = invoicedDate;
    }

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId == null ? null : auditUserId.trim();
    }

    public Short getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Short auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Short getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(Short voucherStatus) {
        this.voucherStatus = voucherStatus;
    }

    public Date getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(Date accountingDate) {
        this.accountingDate = accountingDate;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
        FinanceVoucher other = (FinanceVoucher) that;
        return (this.getVoucherId() == null ? other.getVoucherId() == null : this.getVoucherId().equals(other.getVoucherId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getVoucherCode() == null ? other.getVoucherCode() == null : this.getVoucherCode().equals(other.getVoucherCode()))
            && (this.getVoucherAmount() == null ? other.getVoucherAmount() == null : this.getVoucherAmount().equals(other.getVoucherAmount()))
            && (this.getPaidType() == null ? other.getPaidType() == null : this.getPaidType().equals(other.getPaidType()))
            && (this.getFundDate() == null ? other.getFundDate() == null : this.getFundDate().equals(other.getFundDate()))
            && (this.getIsInvoiced() == null ? other.getIsInvoiced() == null : this.getIsInvoiced().equals(other.getIsInvoiced()))
            && (this.getInvoicedStatus() == null ? other.getInvoicedStatus() == null : this.getInvoicedStatus().equals(other.getInvoicedStatus()))
            && (this.getInvoicedUserName() == null ? other.getInvoicedUserName() == null : this.getInvoicedUserName().equals(other.getInvoicedUserName()))
            && (this.getInvoicedDate() == null ? other.getInvoicedDate() == null : this.getInvoicedDate().equals(other.getInvoicedDate()))
            && (this.getAuditUserId() == null ? other.getAuditUserId() == null : this.getAuditUserId().equals(other.getAuditUserId()))
            && (this.getAuditStatus() == null ? other.getAuditStatus() == null : this.getAuditStatus().equals(other.getAuditStatus()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getVoucherStatus() == null ? other.getVoucherStatus() == null : this.getVoucherStatus().equals(other.getVoucherStatus()))
            && (this.getAccountingDate() == null ? other.getAccountingDate() == null : this.getAccountingDate().equals(other.getAccountingDate()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserid() == null ? other.getCreateUserid() == null : this.getCreateUserid().equals(other.getCreateUserid()))
            && (this.getModifiedTime() == null ? other.getModifiedTime() == null : this.getModifiedTime().equals(other.getModifiedTime()))
            && (this.getModifiedUserid() == null ? other.getModifiedUserid() == null : this.getModifiedUserid().equals(other.getModifiedUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVoucherId() == null) ? 0 : getVoucherId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getVoucherCode() == null) ? 0 : getVoucherCode().hashCode());
        result = prime * result + ((getVoucherAmount() == null) ? 0 : getVoucherAmount().hashCode());
        result = prime * result + ((getPaidType() == null) ? 0 : getPaidType().hashCode());
        result = prime * result + ((getFundDate() == null) ? 0 : getFundDate().hashCode());
        result = prime * result + ((getIsInvoiced() == null) ? 0 : getIsInvoiced().hashCode());
        result = prime * result + ((getInvoicedStatus() == null) ? 0 : getInvoicedStatus().hashCode());
        result = prime * result + ((getInvoicedUserName() == null) ? 0 : getInvoicedUserName().hashCode());
        result = prime * result + ((getInvoicedDate() == null) ? 0 : getInvoicedDate().hashCode());
        result = prime * result + ((getAuditUserId() == null) ? 0 : getAuditUserId().hashCode());
        result = prime * result + ((getAuditStatus() == null) ? 0 : getAuditStatus().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getVoucherStatus() == null) ? 0 : getVoucherStatus().hashCode());
        result = prime * result + ((getAccountingDate() == null) ? 0 : getAccountingDate().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
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
        sb.append(", voucherId=").append(voucherId);
        sb.append(", orderId=").append(orderId);
        sb.append(", voucherCode=").append(voucherCode);
        sb.append(", voucherAmount=").append(voucherAmount);
        sb.append(", paidType=").append(paidType);
        sb.append(", fundDate=").append(fundDate);
        sb.append(", isInvoiced=").append(isInvoiced);
        sb.append(", invoicedStatus=").append(invoicedStatus);
        sb.append(", invoicedUserName=").append(invoicedUserName);
        sb.append(", invoicedDate=").append(invoicedDate);
        sb.append(", auditUserId=").append(auditUserId);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", voucherStatus=").append(voucherStatus);
        sb.append(", accountingDate=").append(accountingDate);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", memo=").append(memo);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", modifiedUserid=").append(modifiedUserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}