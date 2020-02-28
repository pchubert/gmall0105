package cn.nokehubert.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/28 10:06
 **/
public class PmsBaseAttrInfo implements Serializable {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column
    private String attrName;
    @Column
    private BigInteger catalog3Id;
    @Column
    private String isEnabled;
    @Transient
    List<PmsBaseAttrValue> attrValues;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public BigInteger getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(BigInteger catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public List<PmsBaseAttrValue> getAttrValues() {
        return attrValues;
    }

    public void setAttrValues(List<PmsBaseAttrValue> attrValues) {
        this.attrValues = attrValues;
    }
}
