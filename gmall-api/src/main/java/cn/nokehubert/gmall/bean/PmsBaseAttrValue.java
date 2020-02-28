package cn.nokehubert.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * @Author nokehubert
 * @Date 2020/2/28 10:12
 **/
public class PmsBaseAttrValue implements Serializable {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column
    private String valueName;
    @Column
    private BigInteger attrId;
    @Column
    private String isEnabled;
    @Transient
    private String urlParam;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public BigInteger getAttrId() {
        return attrId;
    }

    public void setAttrId(BigInteger attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getUrlParam() {
        return urlParam;
    }

    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }
}
