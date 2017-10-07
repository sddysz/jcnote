package cn.dongyeshengzhen.framework.model;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

/**
 * Created by zhaoq on 2016/7/21.
 */
public class PageRequestModel {
    int pageSize = 10;
    int pageNumber = 1;
    String sortBy="";
    String direction;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Pageable toPageable() {
        Sort sort = null;
        if(!StringUtils.isEmpty(sortBy) && !StringUtils.isEmpty(direction)){
            sort = new Sort(Sort.Direction.fromStringOrNull(direction), sortBy);
        }
        Pageable pageable = new PageRequest(this.getPageNumber() - 1, this.getPageSize(), sort);
        return pageable;
    }
}
