package cn.nokehubert.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Author nokehubert
 * @Date 2020/2/27 16:48
 **/
public class PmsBaseCatalog1 implements Serializable {
    //主键标识 主键返回策略
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Transient
    private List<PmsBaseCatalog2> catalog2s;

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

    public List<PmsBaseCatalog2> getCatalog2s() {
        return catalog2s;
    }

    public void setCatalog2s(List<PmsBaseCatalog2> catalog2s) {
        this.catalog2s = catalog2s;
    }
}
