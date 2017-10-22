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


INSERT INTO t_note_content (note_id, user_id, is_blog, created_time, updated_time, abstracts, content, updated_user_id)
VALUES (1,1,0,now(),now(),'第一篇测试用摘要','段时间，联通一口气联合多家互联网公司推出了联合SIM卡，比如腾讯王卡、蚂蚁宝卡、百度神卡、京东强卡、B站2233卡等等。这些SIM卡套餐非常优惠，而且包含免费定向流量，非常吸引人，遗憾的是必须新号才能办理，老用户无福享受。现在情况出现转机，其实，工信部2006年9月30日出台的一个文件，即〔2006 〕630号文件中第二条要求：在同一移动电话归属地内，可以在不改变号码的情况下，自主选择使用本企业的所有资费方案',1);


INSERT INTO t_note_content (note_id, user_id, is_blog, created_time, updated_time, abstracts, content, updated_user_id)
VALUES (2,1,0,now(),now(),'第2篇测试用摘要','段时间，联通一口气联合多家互联网公司推出了联合SIM卡，比如腾讯王卡、蚂蚁宝卡、百度神卡、京东强卡、B站2233卡等等。这些SIM卡套餐非常优惠，而且包含免费定向流量，非常吸引人，遗憾的是必须新号才能办理，老用户无福享受。现在情况出现转机，其实，工信部2006年9月30日出台的一个文件，即〔2006 〕630号文件中第二条要求：在同一移动电话归属地内，可以在不改变号码的情况下，自主选择使用本企业的所有资费方案',1);

INSERT INTO t_note_content (note_id, user_id, is_blog, created_time, updated_time, abstracts, content, updated_user_id)
VALUES (3,1,0,now(),now(),'第3篇测试用摘要','段时间，联通一口气联合多家互联网公司推出了联合SIM卡，比如腾讯王卡、蚂蚁宝卡、百度神卡、京东强卡、B站2233卡等等。这些SIM卡套餐非常优惠，而且包含免费定向流量，非常吸引人，遗憾的是必须新号才能办理，老用户无福享受。现在情况出现转机，其实，工信部2006年9月30日出台的一个文件，即〔2006 〕630号文件中第二条要求：在同一移动电话归属地内，可以在不改变号码的情况下，自主选择使用本企业的所有资费方案',1);

INSERT INTO t_note_content (note_id, user_id, is_blog, created_time, updated_time, abstracts, content, updated_user_id)
VALUES (4,1,0,now(),now(),'第4篇测试用摘要','段时间，联通一口气联合多家互联网公司推出了联合SIM卡，比如腾讯王卡、蚂蚁宝卡、百度神卡、京东强卡、B站2233卡等等。这些SIM卡套餐非常优惠，而且包含免费定向流量，非常吸引人，遗憾的是必须新号才能办理，老用户无福享受。现在情况出现转机，其实，工信部2006年9月30日出台的一个文件，即〔2006 〕630号文件中第二条要求：在同一移动电话归属地内，可以在不改变号码的情况下，自主选择使用本企业的所有资费方案',1);





