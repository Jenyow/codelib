package entities.business;

import java.io.Serializable;

public class ReadyExpress implements Serializable {
    private String expressId;

    private String expressName;

    private String hotline;

    private String profile;

    private Boolean isDefault;

    private static final long serialVersionUID = 1L;

    public ReadyExpress(String expressId, String expressName, String hotline, String profile, Boolean isDefault) {
        this.expressId = expressId;
        this.expressName = expressName;
        this.hotline = hotline;
        this.profile = profile;
        this.isDefault = isDefault;
    }

    public ReadyExpress() {
        super();
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

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline == null ? null : hotline.trim();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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
        ReadyExpress other = (ReadyExpress) that;
        return (this.getExpressId() == null ? other.getExpressId() == null : this.getExpressId().equals(other.getExpressId()))
            && (this.getExpressName() == null ? other.getExpressName() == null : this.getExpressName().equals(other.getExpressName()))
            && (this.getHotline() == null ? other.getHotline() == null : this.getHotline().equals(other.getHotline()))
            && (this.getProfile() == null ? other.getProfile() == null : this.getProfile().equals(other.getProfile()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpressId() == null) ? 0 : getExpressId().hashCode());
        result = prime * result + ((getExpressName() == null) ? 0 : getExpressName().hashCode());
        result = prime * result + ((getHotline() == null) ? 0 : getHotline().hashCode());
        result = prime * result + ((getProfile() == null) ? 0 : getProfile().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expressId=").append(expressId);
        sb.append(", expressName=").append(expressName);
        sb.append(", hotline=").append(hotline);
        sb.append(", profile=").append(profile);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}