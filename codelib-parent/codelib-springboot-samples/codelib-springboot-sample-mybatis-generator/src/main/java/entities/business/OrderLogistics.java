package entities.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderLogistics implements Serializable {
    private Integer logisticsId;

    private Integer orderId;

    private String orderCode;

    private String logisticsCode;

    private BigDecimal amount;

    private String expressId;

    private String expressName;

    private Short isReceived;

    private Date receivedTime;

    private String receivedUserid;

    private String memo;

    private Date createTime;

    private String createUserid;

    private static final long serialVersionUID = 1L;

    public OrderLogistics(Integer logisticsId, Integer orderId, String orderCode, String logisticsCode, BigDecimal amount, String expressId, String expressName, Short isReceived, Date receivedTime, String receivedUserid, String memo, Date createTime, String createUserid) {
        this.logisticsId = logisticsId;
        this.orderId = orderId;
        this.orderCode = orderCode;
        this.logisticsCode = logisticsCode;
        this.amount = amount;
        this.expressId = expressId;
        this.expressName = expressName;
        this.isReceived = isReceived;
        this.receivedTime = receivedTime;
        this.receivedUserid = receivedUserid;
        this.memo = memo;
        this.createTime = createTime;
        this.createUserid = createUserid;
    }

    public OrderLogistics() {
        super();
    }

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode == null ? null : logisticsCode.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId == null ? null : expressId.trim();
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName == null ? null : expressName.trim();
    }

    public Short getIsReceived() {
        return isReceived;
    }

    public void setIsReceived(Short isReceived) {
        this.isReceived = isReceived;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getReceivedUserid() {
        return receivedUserid;
    }

    public void setReceivedUserid(String receivedUserid) {
        this.receivedUserid = receivedUserid == null ? null : receivedUserid.trim();
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
        OrderLogistics other = (OrderLogistics) that;
        return (this.getLogisticsId() == null ? other.getLogisticsId() == null : this.getLogisticsId().equals(other.getLogisticsId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getLogisticsCode() == null ? other.getLogisticsCode() == null : this.getLogisticsCode().equals(other.getLogisticsCode()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getExpressId() == null ? other.getExpressId() == null : this.getExpressId().equals(other.getExpressId()))
            && (this.getExpressName() == null ? other.getExpressName() == null : this.getExpressName().equals(other.getExpressName()))
            && (this.getIsReceived() == null ? other.getIsReceived() == null : this.getIsReceived().equals(other.getIsReceived()))
            && (this.getReceivedTime() == null ? other.getReceivedTime() == null : this.getReceivedTime().equals(other.getReceivedTime()))
            && (this.getReceivedUserid() == null ? other.getReceivedUserid() == null : this.getReceivedUserid().equals(other.getReceivedUserid()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserid() == null ? other.getCreateUserid() == null : this.getCreateUserid().equals(other.getCreateUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogisticsId() == null) ? 0 : getLogisticsId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getLogisticsCode() == null) ? 0 : getLogisticsCode().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getExpressId() == null) ? 0 : getExpressId().hashCode());
        result = prime * result + ((getExpressName() == null) ? 0 : getExpressName().hashCode());
        result = prime * result + ((getIsReceived() == null) ? 0 : getIsReceived().hashCode());
        result = prime * result + ((getReceivedTime() == null) ? 0 : getReceivedTime().hashCode());
        result = prime * result + ((getReceivedUserid() == null) ? 0 : getReceivedUserid().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
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
        sb.append(", logisticsId=").append(logisticsId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", logisticsCode=").append(logisticsCode);
        sb.append(", amount=").append(amount);
        sb.append(", expressId=").append(expressId);
        sb.append(", expressName=").append(expressName);
        sb.append(", isReceived=").append(isReceived);
        sb.append(", receivedTime=").append(receivedTime);
        sb.append(", receivedUserid=").append(receivedUserid);
        sb.append(", memo=").append(memo);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}