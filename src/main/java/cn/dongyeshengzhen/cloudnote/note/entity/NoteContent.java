package cn.dongyeshengzhen.cloudnote.note.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_note_content")
public class NoteContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer noteId;
    private Integer userId;
    private Boolean isBlog;
    private String content;
    private String abstracts;
    private Date createdTime;
    private Date updatedTime;
    private Integer updatedUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getBlog() {
        return isBlog;
    }

    public void setBlog(Boolean blog) {
        isBlog = blog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
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

    public Integer getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(Integer updatedUserId) {
        this.updatedUserId = updatedUserId;
    }
}
