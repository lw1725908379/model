package com.edu.lw.model.page.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
@ApiModel(description = "分页传输对象")
public class PageDTO<T> {

    /**
     * 当前页码
     */
    @ApiModelProperty("当前页码")
    private Integer page;

    /**
     * 每页条数
     */
    @ApiModelProperty("每页条数")
    private Integer size;

    /**
     * 总条数
     */
    @ApiModelProperty("总条数")
    private Long total;

    /**
     * 总页数
     */
    @ApiModelProperty("总页数")
    private Integer totalPage;

    /**
     * 返回数据
     */
    @ApiModelProperty("返回数据")
    private List<T> list;

    /**
     * 请求参数
     */
    @ApiModelProperty("请求参数")
    private T param;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getTotalPage() {
        return  Integer.valueOf(String.valueOf((total-1)/size+1));
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PageDto{");
        sb.append("page=").append(page);
        sb.append(", size=").append(size);
        sb.append(", total=").append(total);
        sb.append(", list=").append(list);
        sb.append(", totalPage=").append(totalPage);
        sb.append(", param=").append(param);
        sb.append('}');
        return sb.toString();
    }
}
