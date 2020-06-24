package com.domain;

import java.util.Collection;

public class MenuInfo {
    private int menuInfoId;
    private String menuInfoName;
    private Collection<RoleRelationship> rolerelationshipsByMenuInfoId;

    public int getMenuInfoId() {
        return menuInfoId;
    }

    public void setMenuInfoId(int menuInfoId) {
        this.menuInfoId = menuInfoId;
    }

    public String getMenuInfoName() {
        return menuInfoName;
    }

    public void setMenuInfoName(String menuInfoName) {
        this.menuInfoName = menuInfoName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuInfo menuInfo = (MenuInfo) o;

        if (menuInfoId != menuInfo.menuInfoId) return false;
        if (menuInfoName != null ? !menuInfoName.equals(menuInfo.menuInfoName) : menuInfo.menuInfoName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = menuInfoId;
        result = 31 * result + (menuInfoName != null ? menuInfoName.hashCode() : 0);
        return result;
    }

    public Collection<RoleRelationship> getRolerelationshipsByMenuInfoId() {
        return rolerelationshipsByMenuInfoId;
    }

    public void setRolerelationshipsByMenuInfoId(Collection<RoleRelationship> rolerelationshipsByMenuInfoId) {
        this.rolerelationshipsByMenuInfoId = rolerelationshipsByMenuInfoId;
    }
}
