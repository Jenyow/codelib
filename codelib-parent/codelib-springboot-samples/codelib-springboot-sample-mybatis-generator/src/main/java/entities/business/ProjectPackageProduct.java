package entities.business;

import java.io.Serializable;
import java.util.Date;

public class ProjectPackageProduct extends ProjectPackageProductKey implements Serializable {
    private String packageProductId;

    private Date createTime;

    private String createUserid;

    private static final long serialVersionUID = 1L;

    public ProjectPackageProduct(String packageId, String projectId, String packageProductId, Date createTime, String createUserid) {
        super(packageId, projectId);
        this.packageProductId = packageProductId;
        this.createTime = createTime;
        this.createUserid = createUserid;
    }

    public ProjectPackageProduct() {
        super();
    }

    public String getPackageProductId() {
        return packageProductId;
    }

    public void setPackageProductId(String packageProductId) {
        this.packageProductId = packageProductId == null ? null : packageProductId.trim();
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
        ProjectPackageProduct other = (ProjectPackageProduct) that;
        return (this.getPackageId() == null ? other.getPackageId() == null : this.getPackageId().equals(other.getPackageId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getPackageProductId() == null ? other.getPackageProductId() == null : this.getPackageProductId().equals(other.getPackageProductId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserid() == null ? other.getCreateUserid() == null : this.getCreateUserid().equals(other.getCreateUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getPackageProductId() == null) ? 0 : getPackageProductId().hashCode());
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
        sb.append(", packageProductId=").append(packageProductId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}