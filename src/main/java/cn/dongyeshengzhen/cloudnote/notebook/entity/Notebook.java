package cn.dongyeshengzhen.cloudnote.notebook.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_notebook")
public class Notebook implements Comparable<Notebook> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer notebookId;
    private Integer userId;
    private Integer parentNotebookId;
    private Integer seq;
    private String title;
    private String urlTitle;
    private Integer numberNotes;
    private Boolean isTrash;
    private Boolean isBlog;
    private Date createdTime;
    private Date updatedTime;
    private Integer usn;
    private Boolean isDeleted;
    @Transient
    private List<Notebook> subNotebooks;


    @Override
    public int compareTo(Notebook o) {
        int i = this.getSeq() - o.getSeq();//先按照seq排序
        if (i == 0) {
            return this.getTitle().compareTo(o.getTitle());//如果seq相等了再用title进行排序
        }
        return 0;
    }


    public NotebookNode convert2Node() {

        NotebookNode node = new NotebookNode();
        node.setId(this.getNotebookId());
        node.setText(this.getTitle());
        if (this.getSubNotebooks() != null && !this.getSubNotebooks().isEmpty()) {
            List<NotebookNode> nodeList = new ArrayList<>();
            for (Notebook notebook : this.getSubNotebooks()) {
                nodeList.add(notebook.convert2Node());
            }
            node.setChildren(nodeList);
        }
        return node;
    }

    public Integer getNotebookId() {
        return notebookId;
    }

    public void setNotebookId(Integer notebookId) {
        this.notebookId = notebookId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getParentNotebookId() {
        return parentNotebookId;
    }

    public void setParentNotebookId(Integer parentNotebookId) {
        this.parentNotebookId = parentNotebookId;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlTitle() {
        return urlTitle;
    }

    public void setUrlTitle(String urlTitle) {
        this.urlTitle = urlTitle;
    }

    public Integer getNumberNotes() {
        return numberNotes;
    }

    public void setNumberNotes(Integer numberNotes) {
        this.numberNotes = numberNotes;
    }

    public Boolean getTrash() {
        return isTrash;
    }

    public void setTrash(Boolean trash) {
        isTrash = trash;
    }

    public Boolean getBlog() {
        return isBlog;
    }

    public void setBlog(Boolean blog) {
        isBlog = blog;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getUsn() {
        return usn;
    }

    public void setUsn(Integer usn) {
        this.usn = usn;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public List<Notebook> getSubNotebooks() {
        return subNotebooks;
    }

    public void setSubNotebooks(List<Notebook> subNotebooks) {
        this.subNotebooks = subNotebooks;
    }
}
