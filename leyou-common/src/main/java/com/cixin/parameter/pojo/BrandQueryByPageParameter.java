package com.cixin.parameter.pojo;

/**
 * 分页参数封装
 */
public class BrandQueryByPageParameter {

    /**
     *当前页 int
     */
    private Integer page;
    /**
     * 每页大小 int
     */
    private Integer rows;
    /**
     *  排序字段 sortBy
     */
    private String sortBy;
    /**
     * 是否降序 boolean
     */
    private Boolean desc;
    /**
     * 搜索关键字
     */
    private String key;

    public BrandQueryByPageParameter(Integer page, Integer rows, String sortBy, Boolean desc, String key) {
        this.page = page;
        this.rows = rows;
        this.sortBy = sortBy;
        this.desc = desc;
        this.key = key;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public Boolean getDesc() {
        return desc;
    }

    public void setDesc(Boolean desc) {
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "BrandQueryByPageParameter{" +
                "page=" + page +
                ", rows=" + rows +
                ", sortBy='" + sortBy + '\'' +
                ", desc=" + desc +
                ", key='" + key + '\'' +
                '}';
    }
}
