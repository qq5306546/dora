package com.je.dora.module.party.model;

import java.util.Date;

import com.je.dora.core.base.mybatis.model.BaseModel;
@SuppressWarnings("serial")
public class PartyGroup extends BaseModel {

    // Fields

    private String partyId;		//当事人唯一标识
    private String groupName;		//组织名称
    private String groupNameLocal;		//组织英文名称
    private String officeSiteName;		//办公地点
    private String comments;		//备注
    private Date createStamp;		//创建时间
    private Date lastUpdateStamp;		//最后修改时间
    
    

    
    public PartyGroup() {
    }

    

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyId() {
        return this.partyId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupNameLocal(String groupNameLocal) {
        this.groupNameLocal = groupNameLocal;
    }

    public String getGroupNameLocal() {
        return this.groupNameLocal;
    }

    public void setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
    }

    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return this.comments;
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