package com.domain;

public class RoleRelationship {
    private int roleRelationshipId;
    private Integer access;
    private RoleInfo roleinfoByRoleId;
    private MenuInfo menuinfoByMenuInfoId;

    public int getRoleRelationshipId() {
        return roleRelationshipId;
    }

    public void setRoleRelationshipId(int roleRelationshipId) {
        this.roleRelationshipId = roleRelationshipId;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleRelationship that = (RoleRelationship) o;

        if (roleRelationshipId != that.roleRelationshipId) return false;
        if (access != null ? !access.equals(that.access) : that.access != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleRelationshipId;
        result = 31 * result + (access != null ? access.hashCode() : 0);
        return result;
    }

    public RoleInfo getRoleinfoByRoleId() {
        return roleinfoByRoleId;
    }

    public void setRoleinfoByRoleId(RoleInfo roleinfoByRoleId) {
        this.roleinfoByRoleId = roleinfoByRoleId;
    }

    public MenuInfo getMenuinfoByMenuInfoId() {
        return menuinfoByMenuInfoId;
    }

    public void setMenuinfoByMenuInfoId(MenuInfo menuinfoByMenuInfoId) {
        this.menuinfoByMenuInfoId = menuinfoByMenuInfoId;
    }
}
