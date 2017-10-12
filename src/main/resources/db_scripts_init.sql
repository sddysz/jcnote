USE cloudnote;

INSERT INTO t_user (email, is_active, pwd, salt, username, nickname, username_raw)
VALUES ('sddysz@126.com', 1, 'e8799bf58c24e70913e6a83bea34fe2fcb7d9ef1', 'aebfe2021d2cf3a9', 'dysz', 'dongye', '');


INSERT INTO t_notebook (user_id, parent_notebook_id, seq, title,url_title, number_notes, is_trash, is_blog,created_time,updated_time,usn,is_deleted)
VALUES (1, -1, 1, '笔记本1','urltitle1', 1, 0,0,now(),now() ,1,0);
INSERT INTO t_notebook (user_id, parent_notebook_id, seq, title,url_title, number_notes, is_trash, is_blog,created_time,updated_time,usn,is_deleted)
VALUES (1, -1, 1, '笔记本2','urltitle1', 1, 0,0,now(),now() ,1,0);
INSERT INTO t_notebook (user_id, parent_notebook_id, seq, title,url_title, number_notes, is_trash, is_blog,created_time,updated_time,usn,is_deleted)
VALUES (1, 1, 1, '笔记本11','urltitle1', 1, 0,0,now(),now() ,1,0);
INSERT INTO t_notebook (user_id, parent_notebook_id, seq, title,url_title, number_notes, is_trash, is_blog,created_time,updated_time,usn,is_deleted)
VALUES (1, 1, 1, '笔记本12','urltitle1', 1, 0,0,now(),now() ,1,0);


INSERT INTO t_note (user_id,created_user_id,notebook_id,title,description)
VALUES (1, 1, 1, '第1篇笔记','笔记描述');
INSERT INTO t_note (user_id,created_user_id,notebook_id,title,description)
VALUES (1, 1, 1, '第2篇笔记','笔记描述');
INSERT INTO t_note (user_id,created_user_id,notebook_id,title,description)
VALUES (1, 1, 1, '第3篇笔记','笔记描述');
INSERT INTO t_note (user_id,created_user_id,notebook_id,title,description)
VALUES (1, 1, 1, '第4篇笔记','笔记描述');
INSERT INTO t_note (user_id,created_user_id,notebook_id,title,description)
VALUES (1, 1, 2, '第5篇笔记','笔记描述');