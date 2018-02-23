package entities.business;

import java.io.Serializable;
import java.util.Date;

public class Consult implements Serializable {
    private Integer consultId;

    private Integer parentId;

    private String titme;

    private Date consultTime;

    private Date lastTime;

    private String consulter;

    private String consulterId;

    private String companyName;

    private String workTitle;

    private Short status;

    private Short consultType;

    private Integer rootId;

    private String consultUuid;

    private String category;

    private Boolean isDeleted;

    private String memo;

    private Date createTime;

    private String createUserid;

    private Date modifiedTime;

    private String modifiedUserid;

    private String content;

    private static final long serialVersionUID = 1L;

    public Consult(Integer consultId, Integer parentId, String titme, Date consultTime, Date lastTime, String consulter, String consulterId, String companyName, String workTitle, Short status, Short consultType, Integer rootId, String consultUuid, String category, Boolean isDeleted, String memo, Date createTime, String createUserid, Date modifiedTime, String modifiedUserid, String content) {
        this.consultId = consultId;
        this.parentId = parentId;
        this.titme = titme;
        this.consultTime = consultTime;
        this.lastTime = lastTime;
        this.consulter = consulter;
        this.consulterId = consulterId;
        this.companyName = companyName;
        this.workTitle = workTitle;
        this.status = status;
        this.consultType = consultType;
        this.rootId = rootId;
        this.consultUuid = consultUuid;
        this.category = category;
        this.isDeleted = isDeleted;
        this.memo = memo;
        this.createTime = createTime;
        this.createUserid = createUserid;
        this.modifiedTime = modifiedTime;
        this.modifiedUserid = modifiedUserid;
        this.content = content;
    }

    public Consult() {
        super();
    }

    public Integer getConsultId() {
        return consultId;
    }

    public void setConsultId(Integer consultId) {
        this.consultId = consultId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTitme() {
        return titme;
    }

    public void setTitme(String titme) {
        this.titme = titme == null ? null : titme.trim();
    }

    public Date getConsultTime() {
        return consultTime;
    }

    public void setConsultTime(Date consultTime) {
        this.consultTime = consultTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getConsulter() {
        return consulter;
    }

    public void setConsulter(String consulter) {
        this.consulter = consulter == null ? null : consulter.trim();
    }

    public String getConsulterId() {
        return consulterId;
    }

    public void setConsulterId(String consulterId) {
        this.consulterId = consulterId == null ? null : consulterId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle == null ? null : workTitle.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getConsultType() {
        return consultType;
    }

    public void setConsultType(Short consultType) {
        this.consultType = consultType;
    }

    public Integer getRootId() {
        return rootId;
    }

    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

    public String getConsultUuid() {
        return consultUuid;
    }

    public void setConsultUuid(String consultUuid) {
        this.consultUuid = consultUuid == null ? null : consultUuid.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        Consult other = (Consult) that;
        return (this.getConsultId() == null ? other.getConsultId() == null : this.getConsultId().equals(other.getConsultId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getTitme() == null ? other.getTitme() == null : this.getTitme().equals(other.getTitme()))
            && (this.getConsultTime() == null ? other.getConsultTime() == null : this.getConsultTime().equals(other.getConsultTime()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getConsulter() == null ? other.getConsulter() == null : this.getConsulter().equals(other.getConsulter()))
            && (this.getConsulterId() == null ? other.getConsulterId() == null : this.getConsulterId().equals(other.getConsulterId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getWorkTitle() == null ? other.getWorkTitle() == null : this.getWorkTitle().equals(other.getWorkTitle()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getConsultType() == null ? other.getConsultType() == null : this.getConsultType().equals(other.getConsultType()))
            && (this.getRootId() == null ? other.getRootId() == null : this.getRootId().equals(other.getRootId()))
            && (this.getConsultUuid() == null ? other.getConsultUuid() == null : this.getConsultUuid().equals(other.getConsultUuid()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserid() == null ? other.getCreateUserid() == null : this.getCreateUserid().equals(other.getCreateUserid()))
            && (this.getModifiedTime() == null ? other.getModifiedTime() == null : this.getModifiedTime().equals(other.getModifiedTime()))
            && (this.getModifiedUserid() == null ? other.getModifiedUserid() == null : this.getModifiedUserid().equals(other.getModifiedUserid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConsultId() == null) ? 0 : getConsultId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getTitme() == null) ? 0 : getTitme().hashCode());
        result = prime * result + ((getConsultTime() == null) ? 0 : getConsultTime().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getConsulter() == null) ? 0 : getConsulter().hashCode());
        result = prime * result + ((getConsulterId() == null) ? 0 : getConsulterId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getWorkTitle() == null) ? 0 : getWorkTitle().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getConsultType() == null) ? 0 : getConsultType().hashCode());
        result = prime * result + ((getRootId() == null) ? 0 : getRootId().hashCode());
        result = prime * result + ((getConsultUuid() == null) ? 0 : getConsultUuid().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUserid() == null) ? 0 : getCreateUserid().hashCode());
        result = prime * result + ((getModifiedTime() == null) ? 0 : getModifiedTime().hashCode());
        result = prime * result + ((getModifiedUserid() == null) ? 0 : getModifiedUserid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", consultId=").append(consultId);
        sb.append(", parentId=").append(parentId);
        sb.append(", titme=").append(titme);
        sb.append(", consultTime=").append(consultTime);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", consulter=").append(consulter);
        sb.append(", consulterId=").append(consulterId);
        sb.append(", companyName=").append(companyName);
        sb.append(", workTitle=").append(workTitle);
        sb.append(", status=").append(status);
        sb.append(", consultType=").append(consultType);
        sb.append(", rootId=").append(rootId);
        sb.append(", consultUuid=").append(consultUuid);
        sb.append(", category=").append(category);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", memo=").append(memo);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", modifiedUserid=").append(modifiedUserid);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}