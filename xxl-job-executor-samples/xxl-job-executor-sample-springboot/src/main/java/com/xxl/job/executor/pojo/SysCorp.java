package com.xxl.job.executor.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/25
 */
@Data
@TableName("SysCorp")
public class SysCorp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    private Integer corpID;

    @TableField("CorpName")
    private String corpName;

    @TableField("CorpCode")
    private String corpCode;

    @TableField("Manager")
    private String manager;

    @TableField("ManagerPhone")
    private String managerPhone;

    @TableField("Phone")
    private String phone;

    @TableField("Address")
    private String address;

    @TableField("Email")
    private String email;

    @TableField("PostCode")
    private String postCode;

    @TableField("Fax")
    private String fax;

    @TableField("WebSite")
    private String webSite;

    @TableField("RegionCode")
    private String regionCode;

    @TableField("Longitude")
    private String longitude;

    @TableField("Latitude")
    private String latitude;

    @TableField("MallTemplateID")
    private Integer mallTemplateID;

    @TableField("MallLogo")
    private String mallLogo;

    @TableField("MallName")
    private String mallName;

    @TableField("MallInfo")
    private String mallInfo;

    @TableField("LicenseImg")
    private String licenseImg;

    @TableField("OrganizeImg")
    private String organizeImg;

    @TableField("TaxImg")
    private String taxImg;

    @TableField("WeiXinAppId")
    private String weiXinAppId;

    @TableField("WeiXinAPPSecret")
    private String weiXinAPPSecret;

    @TableField("WeiXinPaySignKey")
    private String weiXinPaySignKey;

    @TableField("AlipayID")
    private String alipayID;

    @TableField("AlipayIDStatus")
    private Integer alipayIDStatus;

    @TableField("Qualification")
    private String qualification;

    @TableField("Status")
    private Integer status;

    @TableField("AuditInfo")
    private String auditInfo;

    @TableField("AuditSubmitTime")
    private Date auditSubmitTime;

    @TableField("AuditPassTime")
    private Date auditPassTime;

    @TableField("Note")
    private String note;

    //uniqueidentifier
   // @TableId(value = "CreateBy",type = IdType.UUID)
    @TableField("CreateBy")
    private String createBy;

    @TableField("CreateTime")
    private Date createTime;

    //uniqueidentifier
    //@TableId(value = "LastUpdateBy",type = IdType.UUID)
    @TableField("LastUpdateBy")
    private String lastUpdateBy;

    @TableField("LastUpdateTime")
    private Date lastUpdateTime;

    @TableField("CorpType")
    private Integer corpType;

    @TableField("OperatorsID")
    private Integer operatorsID;

    @TableField("ExpiryDate")
    private Date expiryDate;

    @TableField("TaobaoID")
    private String taobaoID;

    @TableField("Source")
    private Integer source;

    @TableField("Province")
    private String province;

    @TableField("City")
    private String city;

    @TableField("District")
    private String district;

    @TableField("Zoom")
    private String zoom;

    @TableField("SystemSettingID")
    private String systemSettingID;

    //uniqueidentifier
    //@TableId(value = "IndustryTypeID",type = IdType.UUID)
    @TableField("IndustryTypeID")
    private String industryTypeID;

    @TableField("AddToSubSysLanding")
    private Integer addToSubSysLanding;

    @TableField("PageThemeID")
    private Integer pageThemeID;

    @TableField("LogoImage")
    private String logoImage;

    @TableField("BackImage")
    private String backImage;

    @TableField("LogoTitle")
    private String logoTitle;

    @TableField("OptionEditPower")
    private Integer optionEditPower;

    @TableField("SelectedSystems")
    private String selectedSystems;

    @TableField("isUseDefaultSystemSetting")
    private String useDefaultSystemSetting;
}
