USE cloudnote;

alter table t_note drop foreign key notebook_id;
alter table t_note drop foreign key user_id;
DROP TABLE  t_note;
alter table t_notebook drop foreign key user_id;
DROP TABLE  t_notebook ;
DROP TABLE  t_user;