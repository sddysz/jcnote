package cn.dongyeshengzhen.framework.utils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by zhaoq on 2016/4/18.
 */
public class PageUtils {
    public static <T> Page<T> getPage(List<T> result, int pageNumber, int pageSize) {
        Pageable pageable = new PageRequest(pageNumber, pageSize);
        int totalElements = result.size();
        int from = pageNumber * pageSize;
        int to = from + pageSize;
        if (totalElements >= to) {
            result = result.subList(from, to);
        } else {
            result = result.subList(from, totalElements);
        }
        Page<T> page = new PageImpl<T>(result, pageable, totalElements);
        return page;
    }

    public static <T> Page<T> getPage2(List<T> result, int pageNumber, int pageSize) {
        Pageable pageable = new PageRequest(pageNumber, pageSize);
        Page<T> page;
        if(result.size() < pageSize){
            page = new PageImpl<T>(result, pageable, pageNumber * pageSize);
        }
        else{
            page = new PageImpl<T>(result, pageable, (pageNumber + 2) * pageSize);
        }
        return page;
    }
    public static <T> Page<T> getPageModel(List<T> result,int totalElements, int pageNumber, int pageSize) {
        Pageable pageable = new PageRequest(pageNumber, pageSize);
        Page<T> page = new PageImpl<T>(result, pageable, totalElements);
        return page;
    }
    public static <T> Page<T> getPageModel(List<T> result,Pageable pageable, int total) {
        Page<T> page = new PageImpl<T>(result, pageable, total);
        return page;
    }
}