package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 商家
 *
 * @author 
 * @email
 */
@TableName("shangjia")
public class ShangjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShangjiaEntity() {

	}

	public ShangjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 商家姓名
     */
    @TableField(value = "shangjia_name")

    private String shangjiaName;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 现有余额
     */
    @TableField(value = "new_money")

    private Double newMoney;


    /**
     * 身份证号
     */
    @TableField(value = "shangjia_id_number")

    private String shangjiaIdNumber;


    /**
     * 手机号
     */
    @TableField(value = "shangjia_phone")

    private String shangjiaPhone;


    /**
     * 邮箱
     */
    @TableField(value = "shangjia_email")

    private String shangjiaEmail;


    /**
     * 营业执照展示
     */
    @TableField(value = "shangjia_photo")

    private String shangjiaPhoto;


    /**
     * 商家星级
     */
    @TableField(value = "shangjia_xingji")

    private String shangjiaXingji;


    /**
     * 商家简介
     */
    @TableField(value = "shangjia_content")

    private String shangjiaContent;


    /**
     * 假删
     */
    @TableField(value = "shangjia_delete")

    private Integer shangjiaDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：商家姓名
	 */
    public String getShangjiaName() {
        return shangjiaName;
    }


    /**
	 * 获取：商家姓名
	 */

    public void setShangjiaName(String shangjiaName) {
        this.shangjiaName = shangjiaName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：现有余额
	 */
    public Double getNewMoney() {
        return newMoney;
    }


    /**
	 * 获取：现有余额
	 */

    public void setNewMoney(Double newMoney) {
        this.newMoney = newMoney;
    }
    /**
	 * 设置：身份证号
	 */
    public String getShangjiaIdNumber() {
        return shangjiaIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setShangjiaIdNumber(String shangjiaIdNumber) {
        this.shangjiaIdNumber = shangjiaIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getShangjiaPhone() {
        return shangjiaPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setShangjiaPhone(String shangjiaPhone) {
        this.shangjiaPhone = shangjiaPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getShangjiaEmail() {
        return shangjiaEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setShangjiaEmail(String shangjiaEmail) {
        this.shangjiaEmail = shangjiaEmail;
    }
    /**
	 * 设置：营业执照展示
	 */
    public String getShangjiaPhoto() {
        return shangjiaPhoto;
    }


    /**
	 * 获取：营业执照展示
	 */

    public void setShangjiaPhoto(String shangjiaPhoto) {
        this.shangjiaPhoto = shangjiaPhoto;
    }
    /**
	 * 设置：商家星级
	 */
    public String getShangjiaXingji() {
        return shangjiaXingji;
    }


    /**
	 * 获取：商家星级
	 */

    public void setShangjiaXingji(String shangjiaXingji) {
        this.shangjiaXingji = shangjiaXingji;
    }
    /**
	 * 设置：商家简介
	 */
    public String getShangjiaContent() {
        return shangjiaContent;
    }


    /**
	 * 获取：商家简介
	 */

    public void setShangjiaContent(String shangjiaContent) {
        this.shangjiaContent = shangjiaContent;
    }
    /**
	 * 设置：假删
	 */
    public Integer getShangjiaDelete() {
        return shangjiaDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setShangjiaDelete(Integer shangjiaDelete) {
        this.shangjiaDelete = shangjiaDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shangjia{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", shangjiaName=" + shangjiaName +
            ", sexTypes=" + sexTypes +
            ", newMoney=" + newMoney +
            ", shangjiaIdNumber=" + shangjiaIdNumber +
            ", shangjiaPhone=" + shangjiaPhone +
            ", shangjiaEmail=" + shangjiaEmail +
            ", shangjiaPhoto=" + shangjiaPhoto +
            ", shangjiaXingji=" + shangjiaXingji +
            ", shangjiaContent=" + shangjiaContent +
            ", shangjiaDelete=" + shangjiaDelete +
            ", createTime=" + createTime +
        "}";
    }
}