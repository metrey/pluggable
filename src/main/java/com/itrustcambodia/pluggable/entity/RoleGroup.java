package com.itrustcambodia.pluggable.entity;

import java.io.Serializable;

import com.itrustcambodia.pluggable.database.annotation.Column;
import com.itrustcambodia.pluggable.database.annotation.Entity;
import com.itrustcambodia.pluggable.database.annotation.Id;
import com.itrustcambodia.pluggable.database.annotation.Table;

/**
 * @author Socheat KHAUV
 */
@Entity
@Table(name = "tbl_role_group")
public class RoleGroup implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4239609556224904138L;

    @Id
    @Column(name = ROLE_ID, columnDefinition = "INT")
    private Long roleId;
    public static final String ROLE_ID = Role.ID;

    @Id
    @Column(name = GROUP_ID, columnDefinition = "INT")
    private Long groupId;
    public static final String GROUP_ID = Group.ID;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

}
