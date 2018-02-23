package entities.business;

import java.io.Serializable;
import java.util.Date;

public class SysCompany implements Serializable {
    private String companyId;

    private String companyName;

    private String simpleName;

    private String companyType;

    private Boolean isEnabled;

    private String companyLevel;

    private String contactor;

    private String mobile;

    private String userName;

    private String userId;

    private String country;

    private String zone;

    private String province;

    private String city;

    private String district;

    private String street;

    private String address;

    private String fulladdress;

    private String companyCode;

    private String owner;

    private String ownerCardId;

    private Date establishDate;

    private String profile;

    private String postCode;

    private String fax;

    private String email;

    private String memo;

    private static final long serialVersionUID = 1L;

    public SysCompany(String companyId, String companyName, String simpleName, String companyType, Boolean isEnabled, String companyLevel, String contactor, String mobile, String userName, String userId, String country, String zone, String province, String city, String district, String street, String address, String fulladdress, String companyCode, String owner, String ownerCardId, Date establishDate, String profile, String postCode, String fax, String email, String memo) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.simpleName = simpleName;
        this.companyType = companyType;
        this.isEnabled = isEnabled;
        this.companyLevel = companyLevel;
        this.contactor = contactor;
        this.mobile = mobile;
        this.userName = userName;
        this.userId = userId;
        this.country = country;
        this.zone = zone;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.address = address;
        this.fulladdress = fulladdress;
        this.companyCode = companyCode;
        this.owner = owner;
        this.ownerCardId = ownerCardId;
        this.establishDate = establishDate;
        this.profile = profile;
        this.postCode = postCode;
        this.fax = fax;
        this.email = email;
        this.memo = memo;
    }

    public SysCompany() {
        super();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getCompanyLevel() {
        return companyLevel;
    }

    public void setCompanyLevel(String companyLevel) {
        this.companyLevel = companyLevel == null ? null : companyLevel.trim();
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor == null ? null : contactor.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFulladdress() {
        return fulladdress;
    }

    public void setFulladdress(String fulladdress) {
        this.fulladdress = fulladdress == null ? null : fulladdress.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getOwnerCardId() {
        return ownerCardId;
    }

    public void setOwnerCardId(String ownerCardId) {
        this.ownerCardId = ownerCardId == null ? null : ownerCardId.trim();
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
        SysCompany other = (SysCompany) that;
        return (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getSimpleName() == null ? other.getSimpleName() == null : this.getSimpleName().equals(other.getSimpleName()))
            && (this.getCompanyType() == null ? other.getCompanyType() == null : this.getCompanyType().equals(other.getCompanyType()))
            && (this.getIsEnabled() == null ? other.getIsEnabled() == null : this.getIsEnabled().equals(other.getIsEnabled()))
            && (this.getCompanyLevel() == null ? other.getCompanyLevel() == null : this.getCompanyLevel().equals(other.getCompanyLevel()))
            && (this.getContactor() == null ? other.getContactor() == null : this.getContactor().equals(other.getContactor()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getZone() == null ? other.getZone() == null : this.getZone().equals(other.getZone()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getStreet() == null ? other.getStreet() == null : this.getStreet().equals(other.getStreet()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getFulladdress() == null ? other.getFulladdress() == null : this.getFulladdress().equals(other.getFulladdress()))
            && (this.getCompanyCode() == null ? other.getCompanyCode() == null : this.getCompanyCode().equals(other.getCompanyCode()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
            && (this.getOwnerCardId() == null ? other.getOwnerCardId() == null : this.getOwnerCardId().equals(other.getOwnerCardId()))
            && (this.getEstablishDate() == null ? other.getEstablishDate() == null : this.getEstablishDate().equals(other.getEstablishDate()))
            && (this.getProfile() == null ? other.getProfile() == null : this.getProfile().equals(other.getProfile()))
            && (this.getPostCode() == null ? other.getPostCode() == null : this.getPostCode().equals(other.getPostCode()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getSimpleName() == null) ? 0 : getSimpleName().hashCode());
        result = prime * result + ((getCompanyType() == null) ? 0 : getCompanyType().hashCode());
        result = prime * result + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        result = prime * result + ((getCompanyLevel() == null) ? 0 : getCompanyLevel().hashCode());
        result = prime * result + ((getContactor() == null) ? 0 : getContactor().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getZone() == null) ? 0 : getZone().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getStreet() == null) ? 0 : getStreet().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getFulladdress() == null) ? 0 : getFulladdress().hashCode());
        result = prime * result + ((getCompanyCode() == null) ? 0 : getCompanyCode().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        result = prime * result + ((getOwnerCardId() == null) ? 0 : getOwnerCardId().hashCode());
        result = prime * result + ((getEstablishDate() == null) ? 0 : getEstablishDate().hashCode());
        result = prime * result + ((getProfile() == null) ? 0 : getProfile().hashCode());
        result = prime * result + ((getPostCode() == null) ? 0 : getPostCode().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyId=").append(companyId);
        sb.append(", companyName=").append(companyName);
        sb.append(", simpleName=").append(simpleName);
        sb.append(", companyType=").append(companyType);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", companyLevel=").append(companyLevel);
        sb.append(", contactor=").append(contactor);
        sb.append(", mobile=").append(mobile);
        sb.append(", userName=").append(userName);
        sb.append(", userId=").append(userId);
        sb.append(", country=").append(country);
        sb.append(", zone=").append(zone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", street=").append(street);
        sb.append(", address=").append(address);
        sb.append(", fulladdress=").append(fulladdress);
        sb.append(", companyCode=").append(companyCode);
        sb.append(", owner=").append(owner);
        sb.append(", ownerCardId=").append(ownerCardId);
        sb.append(", establishDate=").append(establishDate);
        sb.append(", profile=").append(profile);
        sb.append(", postCode=").append(postCode);
        sb.append(", fax=").append(fax);
        sb.append(", email=").append(email);
        sb.append(", memo=").append(memo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}