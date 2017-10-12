package cn.dongyeshengzhen.cloudnote.notebook.dao;


import cn.dongyeshengzhen.cloudnote.notebook.entity.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookDao extends JpaRepository<Notebook, Integer>, JpaSpecificationExecutor<Notebook> {

}

