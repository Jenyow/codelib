package entities.business;

import java.io.Serializable;
import java.util.Date;

public class OrderSample implements Serializable {
    private Integer sampleId;

    private Integer goodsId;

    private String sampleCode;

    private Boolean isInvalid;

    private String resampledReason;

    private Boolean isResampled;

    private Boolean isDeleted;

    private String memo;

    private Integer orderId;

    private Integer logisticsId;

    private Date createTime;

    private String createUserid;

    private Date modifiedTime;

    private String modifiedUserid;

    private static final long serialVersionUID = 1L;

    public OrderSample(Integer sampleId, Integer goodsId, String sampleCode, Boolean isInvalid, String resampledReason, Boolean isResampled, Boolean isDeleted, String memo, Integer orderId, Integer logisticsId, Date createTime, String createUserid, Date modifiedTime, String modifiedUserid) {
        this.sampleId = sampleId;
        this.goodsId = goodsId;
        this.sampleCode = sampleCode;
        this.isInvalid = isInvalid;
        this.resampledReason = resampledReason;
        this.isResampled = isResampled;
        this.isDeleted = isDeleted;
        this.memo = memo;
        this.orderId = orderId;
        this.logisticsId = logisticsId;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.modifiedTime = modifiedTime;
        this.modifiedUserid = modifiedUserid;
    }

    public OrderSample() {
        super();
    }

    public Integer getSampleId() {
        return sampleId;
    }

    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSampleCode() {
        return sampleCode;
    }

    public void setSampleCode(String sampleCode) {
        this.sampleCode = sampleCode == null ? null : sampleCode.trim();
    }

    public Boolean getIsInvalid() {
        return isInvalid;
    }

    public void setIsInvalid(Boolean isInvalid) {
        this.isInvalid = isInvalid;
    }

    public String getResampledReason() {
        return resampledReason;
    }

    public void setResampledReason(String resampledReason) {
        this.resampledReason = resampledReason == null ? null : resampledReason.trim();
    }

    public Boolean getIsResampled() {
        return isResampled;
    }

    public void setIsResampled(Boolean isResampled) {
        this.isResampled = isResampled;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
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
        OrderSample other = (OrderSample) that;
        return (this.getSampleId() == null ? other.getSampleId() == null : this.getSampleId().equals(other.getSampleId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getSampleCode() == null ? other.getSampleCode() == null : this.getSampleCode().equals(other.getSampleCode()))
            && (this.getIsInvalid() == null ? other.getIsInvalid() == null : this.getIsInvalid().equals(other.getIsInvalid()))
            && (this.getResampledReason() == null ? other.getResampledReason() == null : this.getResampledReason().equals(other.getResampledReason()))
            && (this.getIsResampled() == null ? other.getIsResampled() == null : this.getIsResampled().equals(other.getIsResampled()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getLogisticsId() == null ? other.getLogisticsId() == null : this.getLogisticsId().equals(other.getLogisticsId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserid() == null ? other.getCreateUserid() == null : this.getCreateUserid().equals(other.getCreateUserid()))
            && (this.getModifiedTime() == null ? other.getModifiedTime() == null : this.getModifiedTime().equals(other.getModifiedTime()))
            && (this.getModifiedUserid() == null ? other.getModifiedUserid() == null : this.getModifiedUserid().equals(other.getModifiedUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSampleId() == null) ? 0 : getSampleId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getSampleCode() == null) ? 0 : getSampleCode().hashCode());
        result = prime * result + ((getIsInvalid() == null) ? 0 : getIsInvalid().hashCode());
        result = prime * result + ((getResampledReason() == null) ? 0 : getResampledReason().hashCode());
        result = prime * result + ((getIsResampled() == null) ? 0 : getIsResampled().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getLogisticsId() == null) ? 0 : getLogisticsId().hashCode());
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
        sb.append(", sampleId=").append(sampleId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", sampleCode=").append(sampleCode);
        sb.append(", isInvalid=").append(isInvalid);
        sb.append(", resampledReason=").append(resampledReason);
        sb.append(", isResampled=").append(isResampled);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", memo=").append(memo);
        sb.append(", orderId=").append(orderId);
        sb.append(", logisticsId=").append(logisticsId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", modifiedUserid=").append(modifiedUserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}