package cn.nokehubert.gmall.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * @Author nokehubert
 * @Date 2020/2/14 15:04
 **/
public class UmsMember  implements Serializable {
    //增加主键注解以及主键返回策略注解
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private BigInteger memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private Integer status;
    private Timestamp createTime;
    private String icon;
    private Integer gender;
    private Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private Integer sourceType;
    private Integer integration;
    private Integer growth;
    private Integer luckeyCount;
    private Integer historyIntegration;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(BigInteger memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }
}
