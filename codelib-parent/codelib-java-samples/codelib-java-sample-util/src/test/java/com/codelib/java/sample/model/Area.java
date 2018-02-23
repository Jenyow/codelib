package com.codelib.java.sample.model;

public class Area {

    private String code;
    private String name;
    private String pCode;
    private String type;

    public Area() {
        super();
    }

    public Area(String code, String name, String pCode) {
        super();
        this.code = code;
        this.name = name;
        this.pCode = pCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((pCode == null) ? 0 : pCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Area other = (Area) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (pCode == null) {
            if (other.pCode != null)
                return false;
        } else if (!pCode.equals(other.pCode))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Area [code=" + code + ", name=" + name + ", pCode=" + pCode + "]";
    }

}
