package cn.nokehubert.gmall.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * @Author nokehubert
 * @Date 2020/2/27 16:45
 **/
public class PmsBaseCatalog3 implements Serializable {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column
    private String name;
    @Column
    private BigInteger catalog2Id;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(BigInteger catalog2Id) {
        this.catalog2Id = catalog2Id;
    }
}
