package com.je.dora.module.party.model;

import java.util.Date;

import com.je.dora.core.base.mybatis.model.BaseModel;

@SuppressWarnings("serial")
public class Party extends BaseModel {

    // Fields

    private String partyId;		//当事人标识
    private String partyTypeId;		//当事人类型标识
    private String description;		//描述
    private Date createStamp;		//创建时间
    private Date lastUpdateStamp;		//最后修改时间
    private String createByUserLogin;		//创建的用户登录标识
    
    

    
    public Party() {
    }

    

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyId() {
        return this.partyId;
    }

    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public String getPartyTypeId() {
        return this.partyTypeId;
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

    public void setCreateByUserLogin(String createByUserLogin) {
        this.createByUserLogin = createByUserLogin;
    }

    public String getCreateByUserLogin() {
        return this.createByUserLogin;
    }

}