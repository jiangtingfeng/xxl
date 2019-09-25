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
public class MSysCorp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "corp_id",type = IdType.AUTO)
    private Integer corpID;

    @TableField("corp_name")
    private String corpName;

    @TableField("corp_code")
    private String corpCode;

    @TableField("manager")
    private String manager;

    @TableField("manger_phone")
    private String mangerPhone;

    @TableField("phone")
    private String phone;

    @TableField("address")
    private String address;

    @TableField("email")
    private String email;

    @TableField("post_code")
    private String postCode;

    @TableField("fax")
    private String fax;

    @TableField("web_site")
    private String webSite;

    @TableField("region_code")
    private String regionCode;

    @TableField("longitude")
    private String longitude;

    @TableField("latitude")
    private String latitude;

    @TableField("mall_template_id")
    private Integer mallTemplateID;

    @TableField("mall_logo")
    private String mallLogo;

    @TableField("mall_name")
    private String mallName;

    @TableField("mall_info")
    private String mallInfo;

    @TableField("license_img")
    private String licenseImg;

    @TableField("organize_img")
    private String organizeImg;

    @TableField("tax_img")
    private String taxImg;

    @TableField("wei_xin_app_id")
    private String weiXinAppId;

    @TableField("wei_xin_app_secret")
    private String weiXinAPPSecret;

    @TableField("wei_xin_pay_sign_key")
    private String weiXinPaySignKey;

    @TableField("alipay_id")
    private String alipayID;

    @TableField("alipay_id_status")
    private Integer alipayIDStatus;

    @TableField("qualification")
    private String qualification;

    @TableField("status")
    private Integer status;

    @TableField("audit_info")
    private String auditInfo;

    @TableField("audit_submit_time")
    private Date auditSubmitTime;

    @TableField("audit_pass_time")
    private Date auditPassTime;

    @TableField("note")
    private String note;

    //uniqueidentifier
   // @TableId(value = "CreateBy",type = IdType.UUID)
    @TableField("create_by")
    private String createBy;

    @TableField("create_time")
    private Date createTime;

    //uniqueidentifier
    //@TableId(value = "LastUpdateBy",type = IdType.UUID)
    @TableField("last_update_by")
    private String lastUpdateBy;

    @TableField("last_update_time")
    private Date lastUpdateTime;

    @TableField("corp_type")
    private Integer corpType;

    @TableField("operators_id")
    private Integer operatorsID;

    @TableField("expiry_date")
    private Date expiryDate;

    @TableField("tao_bao_id")
    private String taobaoID;

    @TableField("source")
    private Integer source;

    @TableField("province")
    private String province;

    @TableField("city")
    private String city;

    @TableField("district")
    private String district;

    @TableField("zoom")
    private String zoom;

    @TableField("system_setting_id")
    private String systemSettingID;

    //uniqueidentifier
    //@TableId(value = "IndustryTypeID",type = IdType.UUID)
    @TableField("industry_type_id")
    private String industryTypeID;

    @TableField("add_to_sub_sys_landing")
    private Integer addToSubSysLanding;

    @TableField("page_theme_id")
    private Integer pageThemeID;

    @TableField("logo_image")
    private String logoImage;

    @TableField("back_image")
    private String backImage;

    @TableField("logo_title")
    private String logoTitle;

    @TableField("option_edit_power")
    private Integer optionEditPower;

    @TableField("selected_systems")
    private String selectedSystems;

    @TableField("is_use_default_system_setting")
    private String useDefaultSystemSetting;
}
