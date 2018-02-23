package entities.business;

import java.io.Serializable;
import java.util.Date;

public class FinanceVoucherExtend implements Serializable {
    private Integer voucherId;

    private Integer payerId;

    private Integer voucherUserId;

    private String payer;

    private Date paidDate;

    private static final long serialVersionUID = 1L;

    public FinanceVoucherExtend(Integer voucherId, Integer payerId, Integer voucherUserId, String payer, Date paidDate) {
        this.voucherId = voucherId;
        this.payerId = payerId;
        this.voucherUserId = voucherUserId;
        this.payer = payer;
        this.paidDate = paidDate;
    }

    public FinanceVoucherExtend() {
        super();
    }

    public Integer getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
    }

    public Integer getPayerId() {
        return payerId;
    }

    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    public Integer getVoucherUserId() {
        return voucherUserId;
    }

    public void setVoucherUserId(Integer voucherUserId) {
        this.voucherUserId = voucherUserId;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
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
        FinanceVoucherExtend other = (FinanceVoucherExtend) that;
        return (this.getVoucherId() == null ? other.getVoucherId() == null : this.getVoucherId().equals(other.getVoucherId()))
            && (this.getPayerId() == null ? other.getPayerId() == null : this.getPayerId().equals(other.getPayerId()))
            && (this.getVoucherUserId() == null ? other.getVoucherUserId() == null : this.getVoucherUserId().equals(other.getVoucherUserId()))
            && (this.getPayer() == null ? other.getPayer() == null : this.getPayer().equals(other.getPayer()))
            && (this.getPaidDate() == null ? other.getPaidDate() == null : this.getPaidDate().equals(other.getPaidDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVoucherId() == null) ? 0 : getVoucherId().hashCode());
        result = prime * result + ((getPayerId() == null) ? 0 : getPayerId().hashCode());
        result = prime * result + ((getVoucherUserId() == null) ? 0 : getVoucherUserId().hashCode());
        result = prime * result + ((getPayer() == null) ? 0 : getPayer().hashCode());
        result = prime * result + ((getPaidDate() == null) ? 0 : getPaidDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voucherId=").append(voucherId);
        sb.append(", payerId=").append(payerId);
        sb.append(", voucherUserId=").append(voucherUserId);
        sb.append(", payer=").append(payer);
        sb.append(", paidDate=").append(paidDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}