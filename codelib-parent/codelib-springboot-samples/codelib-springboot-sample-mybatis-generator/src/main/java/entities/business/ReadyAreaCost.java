package entities.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ReadyAreaCost implements Serializable {
    private String areaCostId;

    private String expressId;

    private String areaId;

    private BigDecimal costLogistics;

    private BigDecimal costColdChain;

    private Boolean isUsing;

    private Date createTime;

    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public ReadyAreaCost(String areaCostId, String expressId, String areaId, BigDecimal costLogistics, BigDecimal costColdChain, Boolean isUsing, Date createTime, Date modifiedTime) {
        this.areaCostId = areaCostId;
        this.expressId = expressId;
        this.areaId = areaId;
        this.costLogistics = costLogistics;
        this.costColdChain = costColdChain;
        this.isUsing = isUsing;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }

    public ReadyAreaCost() {
        super();
    }

    public String getAreaCostId() {
        return areaCostId;
    }

    public void setAreaCostId(String areaCostId) {
        this.areaCostId = areaCostId == null ? null : areaCostId.trim();
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId == null ? null : expressId.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public BigDecimal getCostLogistics() {
        return costLogistics;
    }

    public void setCostLogistics(BigDecimal costLogistics) {
        this.costLogistics = costLogistics;
    }

    public BigDecimal getCostColdChain() {
        return costColdChain;
    }

    public void setCostColdChain(BigDecimal costColdChain) {
        this.costColdChain = costColdChain;
    }

    public Boolean getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(Boolean isUsing) {
        this.isUsing = isUsing;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
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
        ReadyAreaCost other = (ReadyAreaCost) that;
        return (this.getAreaCostId() == null ? other.getAreaCostId() == null : this.getAreaCostId().equals(other.getAreaCostId()))
            && (this.getExpressId() == null ? other.getExpressId() == null : this.getExpressId().equals(other.getExpressId()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getCostLogistics() == null ? other.getCostLogistics() == null : this.getCostLogistics().equals(other.getCostLogistics()))
            && (this.getCostColdChain() == null ? other.getCostColdChain() == null : this.getCostColdChain().equals(other.getCostColdChain()))
            && (this.getIsUsing() == null ? other.getIsUsing() == null : this.getIsUsing().equals(other.getIsUsing()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifiedTime() == null ? other.getModifiedTime() == null : this.getModifiedTime().equals(other.getModifiedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAreaCostId() == null) ? 0 : getAreaCostId().hashCode());
        result = prime * result + ((getExpressId() == null) ? 0 : getExpressId().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getCostLogistics() == null) ? 0 : getCostLogistics().hashCode());
        result = prime * result + ((getCostColdChain() == null) ? 0 : getCostColdChain().hashCode());
        result = prime * result + ((getIsUsing() == null) ? 0 : getIsUsing().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifiedTime() == null) ? 0 : getModifiedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", areaCostId=").append(areaCostId);
        sb.append(", expressId=").append(expressId);
        sb.append(", areaId=").append(areaId);
        sb.append(", costLogistics=").append(costLogistics);
        sb.append(", costColdChain=").append(costColdChain);
        sb.append(", isUsing=").append(isUsing);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}