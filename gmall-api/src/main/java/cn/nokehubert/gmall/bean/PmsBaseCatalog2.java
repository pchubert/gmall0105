package cn.nokehubert.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/27 16:46
 **/
public class PmsBaseCatalog2 implements Serializable {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer catalog1Id;
    @Transient
    private List<PmsBaseCatalog1> catalog1s;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    public List<PmsBaseCatalog1> getCatalog1s() {
        return catalog1s;
    }

    public void setCatalog1s(List<PmsBaseCatalog1> catalog1s) {
        this.catalog1s = catalog1s;
    }
}
