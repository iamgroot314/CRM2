package com.domain;

import java.util.Collection;

public class RoleInfo {
    private int roleId;
    private String roleName;
    private Collection<RoleRelationship> rolerelationshipsByRoleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleInfo roleInfo = (RoleInfo) o;

        if (roleId != roleInfo.roleId) return false;
        if (roleName != null ? !roleName.equals(roleInfo.roleName) : roleInfo.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }

    public Collection<RoleRelationship> getRolerelationshipsByRoleId() {
        return rolerelationshipsByRoleId;
    }

    public void setRolerelationshipsByRoleId(Collection<RoleRelationship> rolerelationshipsByRoleId) {
        this.rolerelationshipsByRoleId = rolerelationshipsByRoleId;
    }
}
