USE cloudnote;

DROP TABLE  t_note;
alter table t_notebook drop foreign key user_id;
DROP TABLE  t_notebook ;
DROP TABLE  t_user;