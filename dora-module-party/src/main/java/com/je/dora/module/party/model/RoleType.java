package com.je.dora.module.party.model;

import java.util.Date;

import com.je.dora.core.base.mybatis.model.BaseModel;
@SuppressWarnings("serial")
public class RoleType extends BaseModel {

    // Fields

    private String roleTypeId;		//角色类型唯一标识
    private String parentTypeId;		//上级类型标识
    private String hasTable;		//有库表
    private String description;		//描述
    private Date createStamp;		//创建时间
    private Date lastUpdateStamp;		//最后修改时间
    
    

    
    public RoleType() {
    }

    

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getRoleTypeId() {
        return this.roleTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public String getParentTypeId() {
        return this.parentTypeId;
    }

    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }

    public String getHasTable() {
        return this.hasTable;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCreateStamp(Date createStamp) {
        this.createStamp = createStamp;
    }

    public Date getCreateStamp() {
        return this.createStamp;
    }

    public void setLastUpdateStamp(Date lastUpdateStamp) {
        this.lastUpdateStamp = lastUpdateStamp;
    }

    public Date getLastUpdateStamp() {
        return this.lastUpdateStamp;
    }

}