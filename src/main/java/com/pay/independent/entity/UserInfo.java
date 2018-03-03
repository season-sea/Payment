package com.pay.independent.entity;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.Date;


/**
 * 用户基础信息
 *
 * @author Administrator
 */

@SuppressWarnings("all")
public class UserInfo implements Serializable{

    private static final long serialVersionUID = -1462408211308137723L;

    private Long userId;

    private String account; // 账号

    private String password; // 登陆密码

    private String nickname;// 用户昵称

    private String fullName;// 真实名称

    private String phone;// 电话

    private String email;// 邮箱

    private Long superId; // 所属代理ID

    private String superName; // 所属代理名称
    private String superPath; // 所属代理路径

    private Integer state;// 用户状态（1：正常；2：冻结；3：停用）

    private Integer limitBet;// 限制投注:0-不限制;1-限制

    private Integer regWay;// 注册方式:1-后台添加，2-推广注册 3-在线注册 4-代理添加
    private String regIp;// 注册ip

    private Date addTime;// 注册时间

    private Date updateTime;// 更新时间
    private String browser;
    private String operatingSystem;
    private String userAgent;
    private String wxUnionid;

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String fk;// 校验字段

    private String hyLevel;// 充值层级

    private String qq; // qq


    private String weixin; // 微信


    private String type; // 会员类型HY会员TEST试玩会员

    private Integer receive; // 1电话已验证,2表示允许接收短信,4表示允许接收邮件(值可以进行或运算)

    private String intrCode; // 推广码(对应intr_info表)

    private String recommendCode; // 推荐码(会员介绍会员)

    private String birthday; // 生日(格式0706)
    private String address; // 地址
    private Integer perfectInfo; // 是否完善资料0表示否1表示是3已发送完善资料彩金
    private Integer isDayWage; // 是否结算是工资0否,1是
    private Integer tableIndex;
    private Integer limitRech = 0;// 限制银行充值:0-不限制;1-限制
    /**
     * 0正常,1密码错误限制
     */
    private Integer limited;

    private Integer dlLevel;


    private Boolean isDl;

    private Double rebate;

    private String userMemo;
    /**
     * 用户颜色
     */
    private String userColor;




    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSuperId() {
        return superId;
    }

    public void setSuperId(Long superId) {
        this.superId = superId;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public String getSuperPath() {
        return superPath;
    }

    public void setSuperPath(String superPath) {
        this.superPath = superPath;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getLimitBet() {
        return limitBet;
    }

    public void setLimitBet(Integer limitBet) {
        this.limitBet = limitBet;
    }

    public Integer getRegWay() {
        return regWay;
    }

    public void setRegWay(Integer regWay) {
        this.regWay = regWay;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getWxUnionid() {
        return wxUnionid;
    }

    public void setWxUnionid(String wxUnionid) {
        this.wxUnionid = wxUnionid;
    }

    public String getFk() {
        return fk;
    }

    public void setFk(String fk) {
        this.fk = fk;
    }

    public String getHyLevel() {
        return hyLevel;
    }

    public void setHyLevel(String hyLevel) {
        this.hyLevel = hyLevel;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getReceive() {
        return receive;
    }

    public void setReceive(Integer receive) {
        this.receive = receive;
    }

    public String getIntrCode() {
        return intrCode;
    }

    public void setIntrCode(String intrCode) {
        this.intrCode = intrCode;
    }

    public String getRecommendCode() {
        return recommendCode;
    }

    public void setRecommendCode(String recommendCode) {
        this.recommendCode = recommendCode;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPerfectInfo() {
        return perfectInfo;
    }

    public void setPerfectInfo(Integer perfectInfo) {
        this.perfectInfo = perfectInfo;
    }

    public Integer getIsDayWage() {
        return isDayWage;
    }

    public void setIsDayWage(Integer isDayWage) {
        this.isDayWage = isDayWage;
    }

    public Integer getTableIndex() {
        return tableIndex;
    }

    public void setTableIndex(Integer tableIndex) {
        this.tableIndex = tableIndex;
    }

    public Integer getLimitRech() {
        return limitRech;
    }

    public void setLimitRech(Integer limitRech) {
        this.limitRech = limitRech;
    }

    public Integer getLimited() {
        return limited;
    }

    public void setLimited(Integer limited) {
        this.limited = limited;
    }

    public Integer getDlLevel() {
        return dlLevel;
    }

    public void setDlLevel(Integer dlLevel) {
        this.dlLevel = dlLevel;
    }

    public Boolean getDl() {
        return isDl;
    }

    public void setDl(Boolean dl) {
        isDl = dl;
    }

    public Double getRebate() {
        return rebate;
    }

    public void setRebate(Double rebate) {
        this.rebate = rebate;
    }

    public String getUserMemo() {
        return userMemo;
    }

    public void setUserMemo(String userMemo) {
        this.userMemo = userMemo;
    }

    public String getUserColor() {
        return userColor;
    }

    public void setUserColor(String userColor) {
        this.userColor = userColor;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
