package entities.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderGoods implements Serializable {
    private Integer goodsId;

    private Integer orderId;

    private String productId;

    private BigDecimal salePrice;

    private BigDecimal price;

    private String projectName;

    private String examinedContent;

    private Integer subjectId;

    private Boolean isPackage;

    private String categoryId;

    private String memo;

    private Date createTime;

    private String createUserid;

    private Date modifiedTime;

    private String modifiedUserid;

    private static final long serialVersionUID = 1L;

    public OrderGoods(Integer goodsId, Integer orderId, String productId, BigDecimal salePrice, BigDecimal price, String projectName, String examinedContent, Integer subjectId, Boolean isPackage, String categoryId, String memo, Date createTime, String createUserid, Date modifiedTime, String modifiedUserid) {
        this.goodsId = goodsId;
        this.orderId = orderId;
        this.productId = productId;
        this.salePrice = salePrice;
        this.price = price;
        this.projectName = projectName;
        this.examinedContent = examinedContent;
        this.subjectId = subjectId;
        this.isPackage = isPackage;
        this.categoryId = categoryId;
        this.memo = memo;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.modifiedTime = modifiedTime;
        this.modifiedUserid = modifiedUserid;
    }

    public OrderGoods() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getExaminedContent() {
        return examinedContent;
    }

    public void setExaminedContent(String examinedContent) {
        this.examinedContent = examinedContent == null ? null : examinedContent.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Boolean getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Boolean isPackage) {
        this.isPackage = isPackage;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
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
        OrderGoods other = (OrderGoods) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getSalePrice() == null ? other.getSalePrice() == null : this.getSalePrice().equals(other.getSalePrice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getExaminedContent() == null ? other.getExaminedContent() == null : this.getExaminedContent().equals(other.getExaminedContent()))
            && (this.getSubjectId() == null ? other.getSubjectId() == null : this.getSubjectId().equals(other.getSubjectId()))
            && (this.getIsPackage() == null ? other.getIsPackage() == null : this.getIsPackage().equals(other.getIsPackage()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
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
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getSalePrice() == null) ? 0 : getSalePrice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getExaminedContent() == null) ? 0 : getExaminedContent().hashCode());
        result = prime * result + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        result = prime * result + ((getIsPackage() == null) ? 0 : getIsPackage().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", orderId=").append(orderId);
        sb.append(", productId=").append(productId);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", price=").append(price);
        sb.append(", projectName=").append(projectName);
        sb.append(", examinedContent=").append(examinedContent);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", isPackage=").append(isPackage);
        sb.append(", categoryId=").append(categoryId);
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