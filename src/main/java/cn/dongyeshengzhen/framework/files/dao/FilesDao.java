package cn.dongyeshengzhen.framework.files.dao;

import cn.dongyeshengzhen.framework.files.entity.Files;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by zhaoq on 2016/5/4.
 */
@Repository
public interface FilesDao extends JpaRepository<Files, String>, JpaSpecificationExecutor<Files> {

}
