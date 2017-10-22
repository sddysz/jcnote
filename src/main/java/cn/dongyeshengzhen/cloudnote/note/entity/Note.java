package cn.dongyeshengzhen.cloudnote.note.entity;

import cn.dongyeshengzhen.cloudnote.notebook.entity.Notebook;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noteId;
    //所有者
    private Integer userId;
    //创建者
    private Integer createdUserId;
   // private Integer notebookId;
    private String title;
    private String description;
    private String src;
    private String imgSrc;
    @Transient
    private List tags;
    private Boolean isTrash;
    private Boolean isBlog;
    private String urlTitle;
    private Boolean isRecommend;
    private Boolean isTop;
    private Boolean hasSelfDefined;
    private Integer readNum;
    private Integer likeNum;
    private Integer commentNum;
    private Boolean isMarkdown;
    private Integer attachNum;
    private Date createdTime;
    private Date updatedTime;
    private Date recommendTime;
    private Date publicTime;
    private Integer updatedUserId;
    private Integer usn;
    private Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "notebook_id")
    private Notebook notebook;

    @OneToOne
    @JoinColumn(name="note_id")
    private NoteContent content;

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public NoteContent getContent() {
        return content;
    }

    public void setContent(NoteContent content) {
        this.content = content;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public List getTags() {
        return tags;
    }

    public void setTags(List tags) {
        this.tags = tags;
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

    public String getUrlTitle() {
        return urlTitle;
    }

    public void setUrlTitle(String urlTitle) {
        this.urlTitle = urlTitle;
    }

    public Boolean getRecommend() {
        return isRecommend;
    }

    public void setRecommend(Boolean recommend) {
        isRecommend = recommend;
    }

    public Boolean getTop() {
        return isTop;
    }

    public void setTop(Boolean top) {
        isTop = top;
    }

    public Boolean getHasSelfDefined() {
        return hasSelfDefined;
    }

    public void setHasSelfDefined(Boolean hasSelfDefined) {
        this.hasSelfDefined = hasSelfDefined;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Boolean getMarkdown() {
        return isMarkdown;
    }

    public void setMarkdown(Boolean markdown) {
        isMarkdown = markdown;
    }

    public Integer getAttachNum() {
        return attachNum;
    }

    public void setAttachNum(Integer attachNum) {
        this.attachNum = attachNum;
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

    public Date getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Date recommendTime) {
        this.recommendTime = recommendTime;
    }

    public Date getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    public Integer getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(Integer updatedUserId) {
        this.updatedUserId = updatedUserId;
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
}
