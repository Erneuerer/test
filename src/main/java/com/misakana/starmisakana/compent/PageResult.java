package com.misakana.starmisakana.compent;

import java.io.PrintWriter;
import java.io.Serializable;
import java.security.PrivateKey;
import java.util.List;

public class PageResult implements Serializable {
    private Integer PageNo;//当前页
    private Integer PageSize;//每页多少条数据
    private Integer TotalPage;//总页数
    private long total;//多少条数据
    private List rows;//当前页的数据

    public Integer getPageNo() {
        return PageNo;
    }

    public void setPageNo(Integer pageNo) {
        PageNo = pageNo;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public Integer getTotalPage() {
        return TotalPage;
    }

    public void setTotalPage(Integer totalPage) {
        TotalPage = totalPage;
    }

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageResult(int total) {
        this.total = total;
    }


    public PageResult(Integer pageNo, Integer pageSize, long total, List rows) {
        PageNo = pageNo;
        PageSize = pageSize;
        this.total = total;
        this.rows = rows;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "PageNo=" + PageNo +
                ", PageSize=" + PageSize +
                ", TotalPage=" + TotalPage +
                ", total=" + total +
                ", rows=" + rows +
                '}';
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
