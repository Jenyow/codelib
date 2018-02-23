package entities.business;

import java.io.Serializable;
import java.util.Date;

public class OrderExtend implements Serializable {
    private Integer orderId;

    private Date submitedTime;

    private Date paidTime;

    private Date sampledTime;

    private Date sendTime;

    private Date receiptedTime;

    private Date testedTime;

    private Date reportTime;

    private Date invoiceTime;

    private static final long serialVersionUID = 1L;

    public OrderExtend(Integer orderId, Date submitedTime, Date paidTime, Date sampledTime, Date sendTime, Date receiptedTime, Date testedTime, Date reportTime, Date invoiceTime) {
        this.orderId = orderId;
        this.submitedTime = submitedTime;
        this.paidTime = paidTime;
        this.sampledTime = sampledTime;
        this.sendTime = sendTime;
        this.receiptedTime = receiptedTime;
        this.testedTime = testedTime;
        this.reportTime = reportTime;
        this.invoiceTime = invoiceTime;
    }

    public OrderExtend() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getSubmitedTime() {
        return submitedTime;
    }

    public void setSubmitedTime(Date submitedTime) {
        this.submitedTime = submitedTime;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Date getSampledTime() {
        return sampledTime;
    }

    public void setSampledTime(Date sampledTime) {
        this.sampledTime = sampledTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getReceiptedTime() {
        return receiptedTime;
    }

    public void setReceiptedTime(Date receiptedTime) {
        this.receiptedTime = receiptedTime;
    }

    public Date getTestedTime() {
        return testedTime;
    }

    public void setTestedTime(Date testedTime) {
        this.testedTime = testedTime;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
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
        OrderExtend other = (OrderExtend) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getSubmitedTime() == null ? other.getSubmitedTime() == null : this.getSubmitedTime().equals(other.getSubmitedTime()))
            && (this.getPaidTime() == null ? other.getPaidTime() == null : this.getPaidTime().equals(other.getPaidTime()))
            && (this.getSampledTime() == null ? other.getSampledTime() == null : this.getSampledTime().equals(other.getSampledTime()))
            && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
            && (this.getReceiptedTime() == null ? other.getReceiptedTime() == null : this.getReceiptedTime().equals(other.getReceiptedTime()))
            && (this.getTestedTime() == null ? other.getTestedTime() == null : this.getTestedTime().equals(other.getTestedTime()))
            && (this.getReportTime() == null ? other.getReportTime() == null : this.getReportTime().equals(other.getReportTime()))
            && (this.getInvoiceTime() == null ? other.getInvoiceTime() == null : this.getInvoiceTime().equals(other.getInvoiceTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getSubmitedTime() == null) ? 0 : getSubmitedTime().hashCode());
        result = prime * result + ((getPaidTime() == null) ? 0 : getPaidTime().hashCode());
        result = prime * result + ((getSampledTime() == null) ? 0 : getSampledTime().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getReceiptedTime() == null) ? 0 : getReceiptedTime().hashCode());
        result = prime * result + ((getTestedTime() == null) ? 0 : getTestedTime().hashCode());
        result = prime * result + ((getReportTime() == null) ? 0 : getReportTime().hashCode());
        result = prime * result + ((getInvoiceTime() == null) ? 0 : getInvoiceTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", submitedTime=").append(submitedTime);
        sb.append(", paidTime=").append(paidTime);
        sb.append(", sampledTime=").append(sampledTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", receiptedTime=").append(receiptedTime);
        sb.append(", testedTime=").append(testedTime);
        sb.append(", reportTime=").append(reportTime);
        sb.append(", invoiceTime=").append(invoiceTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}