package entities.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProjectProduct implements Serializable {
    private String productId;

    private String categoryId;

    private String productName;

    private String productCode;

    private String firstCategoryId;

    private BigDecimal originalPrice;

    private BigDecimal price;

    private String examinedTime;

    private String examinedMethod;

    private String examinedContent;

    private String sample;

    private Integer orderNo;

    private Boolean isOpened;

    private Boolean isEnabled;

    private Boolean isDeleted;

    private String memo;

    private Date createTime;

    private String createUserid;

    private Date modifiedTime;

    private String modifiedUserid;

    private static final long serialVersionUID = 1L;

    public ProjectProduct(String productId, String categoryId, String productName, String productCode, String firstCategoryId, BigDecimal originalPrice, BigDecimal price, String examinedTime, String examinedMethod, String examinedContent, String sample, Integer orderNo, Boolean isOpened, Boolean isEnabled, Boolean isDeleted, String memo, Date createTime, String createUserid, Date modifiedTime, String modifiedUserid) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.productCode = productCode;
        this.firstCategoryId = firstCategoryId;
        this.originalPrice = originalPrice;
        this.price = price;
        this.examinedTime = examinedTime;
        this.examinedMethod = examinedMethod;
        this.examinedContent = examinedContent;
        this.sample = sample;
        this.orderNo = orderNo;
        this.isOpened = isOpened;
        this.isEnabled = isEnabled;
        this.isDeleted = isDeleted;
        this.memo = memo;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.modifiedTime = modifiedTime;
        this.modifiedUserid = modifiedUserid;
    }

    public ProjectProduct() {
        super();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getFirstCategoryId() {
        return firstCategoryId;
    }

    public void setFirstCategoryId(String firstCategoryId) {
        this.firstCategoryId = firstCategoryId == null ? null : firstCategoryId.trim();
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getExaminedTime() {
        return examinedTime;
    }

    public void setExaminedTime(String examinedTime) {
        this.examinedTime = examinedTime == null ? null : examinedTime.trim();
    }

    public String getExaminedMethod() {
        return examinedMethod;
    }

    public void setExaminedMethod(String examinedMethod) {
        this.examinedMethod = examinedMethod == null ? null : examinedMethod.trim();
    }

    public String getExaminedContent() {
        return examinedContent;
    }

    public void setExaminedContent(String examinedContent) {
        this.examinedContent = examinedContent == null ? null : examinedContent.trim();
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample == null ? null : sample.trim();
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Boolean getIsOpened() {
        return isOpened;
    }

    public void setIsOpened(Boolean isOpened) {
        this.isOpened = isOpened;
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
        ProjectProduct other = (ProjectProduct) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getFirstCategoryId() == null ? other.getFirstCategoryId() == null : this.getFirstCategoryId().equals(other.getFirstCategoryId()))
            && (this.getOriginalPrice() == null ? other.getOriginalPrice() == null : this.getOriginalPrice().equals(other.getOriginalPrice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getExaminedTime() == null ? other.getExaminedTime() == null : this.getExaminedTime().equals(other.getExaminedTime()))
            && (this.getExaminedMethod() == null ? other.getExaminedMethod() == null : this.getExaminedMethod().equals(other.getExaminedMethod()))
            && (this.getExaminedContent() == null ? other.getExaminedContent() == null : this.getExaminedContent().equals(other.getExaminedContent()))
            && (this.getSample() == null ? other.getSample() == null : this.getSample().equals(other.getSample()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getIsOpened() == null ? other.getIsOpened() == null : this.getIsOpened().equals(other.getIsOpened()))
            && (this.getIsEnabled() == null ? other.getIsEnabled() == null : this.getIsEnabled().equals(other.getIsEnabled()))
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
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getFirstCategoryId() == null) ? 0 : getFirstCategoryId().hashCode());
        result = prime * result + ((getOriginalPrice() == null) ? 0 : getOriginalPrice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getExaminedTime() == null) ? 0 : getExaminedTime().hashCode());
        result = prime * result + ((getExaminedMethod() == null) ? 0 : getExaminedMethod().hashCode());
        result = prime * result + ((getExaminedContent() == null) ? 0 : getExaminedContent().hashCode());
        result = prime * result + ((getSample() == null) ? 0 : getSample().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getIsOpened() == null) ? 0 : getIsOpened().hashCode());
        result = prime * result + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
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
        sb.append(", productId=").append(productId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", productName=").append(productName);
        sb.append(", productCode=").append(productCode);
        sb.append(", firstCategoryId=").append(firstCategoryId);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", price=").append(price);
        sb.append(", examinedTime=").append(examinedTime);
        sb.append(", examinedMethod=").append(examinedMethod);
        sb.append(", examinedContent=").append(examinedContent);
        sb.append(", sample=").append(sample);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", isOpened=").append(isOpened);
        sb.append(", isEnabled=").append(isEnabled);
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