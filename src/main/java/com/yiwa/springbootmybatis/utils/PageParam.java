package com.yiwa.springbootmybatis.utils;

public class PageParam {
    private int beginLine;//起始行
    private Integer pageSize=3;
    private Integer currentPage=0;

    public int getBeginLine() {
        return pageSize*currentPage;
    }

    public void setBeginLine(int beginLine) {
        this.beginLine = beginLine;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
