USE cloudnote;


CREATE TABLE `t_user` (
  `id`                  INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `email`               VARCHAR(255) NULL,
  `is_active`           INT          NULL,
  `pwd`                 CHAR(255)    NULL,
  `salt`                CHAR(255)    NULL,
  `username`            VARCHAR(100) NULL,
  `nickname`            VARCHAR(100) NULL,
  `username_raw`        VARCHAR(100) NULL,
  `create_time`         DATETIME     NULL,
  `logo`                VARCHAR(255) NULL,
  `theme`               VARCHAR(255) NULL,
  `notebook_width`      INT          NULL,
  `note_list_width`     INT          NULL,
  `md_editor_width`     INT          NULL,
  `left_is_min`         INT          NULL,
  `third_user_id`       VARCHAR(255) NULL,
  `third_username`      VARCHAR(255) NULL,
  `third_type`          VARCHAR(255) NULL,
  `image_num`           INT          NULL,
  `image_size`          INT          NULL,
  `attach_num`          INT          NULL,
  `attach_size`         INT          NULL,
  `from_user_id`        INT          NULL,
  `account_type`        VARCHAR(255) NULL,
  `account_start_time`  DATETIME     NULL,
  `account_end_time`    DATETIME     NULL,
  `max_image_num`       INT          NULL,
  `max_image_size`      INT          NULL,
  `max_attach_num`      INT          NULL,
  `max_attach_size`     INT          NULL,
  `max_per_attach_size` INT          NULL,
  `usn`                 INT          NULL,
  `full_sync_before`    DATETIME     NULL,
  PRIMARY KEY (`id`)
);


CREATE TABLE `t_notebook` (
  `notebook_id`        INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id`            INT UNSIGNED NOT NULL,
  `parent_notebook_id` INT          NOT NULL,
  `seq`                INT          NOT NULL,
  `title`              VARCHAR(255) NOT NULL,
  `url_title`          VARCHAR(255) NULL,
  `number_notes`       INT          NULL,
  `is_trash`           INT          NULL,
  `is_blog`            INT          NULL,
  `created_time`       DATETIME     NULL,
  `updated_time`       DATETIME     NULL,
  `usn`                INT          NULL,
  `is_deleted`         INT          NULL,
  PRIMARY KEY (`notebook_id`)
);
ALTER TABLE t_notebook
  ADD FOREIGN KEY (user_id) REFERENCES t_user (id)
  ON DELETE RESTRICT;


CREATE TABLE `t_note` (
  `note_id`         INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id`          INT UNSIGNED NOT NULL,
  `created_user_id` INT UNSIGNED  NULL,
  `notebook_id`     INT UNSIGNED NOT NULL,
  `title`           VARCHAR(255) NOT NULL,
  `description`     VARCHAR(255) NULL,
  `src`             VARCHAR(255) NULL,
  `img_src`          VARCHAR(255) NULL,
  `is_trash`        INT          NULL,
  `is_blog`         INT          NULL,
  `url_title`       VARCHAR(255) NULL,
  `is_recommend`    INT          NULL,
  `is_top`          INT          NULL,
  `has_self_defined` INT          NULL,
  `read_num`        INT          NULL,
  `like_num`        INT          NULL,
  `comment_num`     INT          NULL,
  `is_markdown`     INT          NULL,
  `attach_num`      INT          NULL,
  `created_time`    DATETIME     NULL,
  `updated_time`    DATETIME     NULL,
  `recommend_time`  DATETIME     NULL,
  `public_time`     DATETIME     NULL,
  `updated_user_id` INT UNSIGNED NULL,
  `usn`             INT          NULL,
  `is_deleted`      INT          NULL,
  PRIMARY KEY (`note_id`)
);

ALTER TABLE t_note
  ADD FOREIGN KEY (notebook_id) REFERENCES t_notebook (notebook_id)
  ON DELETE RESTRICT;
ALTER TABLE t_note
  ADD FOREIGN KEY (user_id) REFERENCES t_user (id)
  ON DELETE RESTRICT;


CREATE TABLE `t_note_content` (
  `id`         INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `note_id`         INT UNSIGNED NOT NULL,
  `user_id`         INT UNSIGNED NOT NULL,
  `is_blog` INT UNSIGNED NULL,
  `created_time`     DATETIME NULL,
  `updated_time`     DATETIME NULL,
  `abstracts`     TEXT ,
  `content`     TEXT ,
  `updated_user_id`         INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`)
);
ALTER TABLE t_note_content
  ADD FOREIGN KEY (note_id) REFERENCES t_note (note_id)
  ON DELETE RESTRICT;
ALTER TABLE t_note_content
  ADD FOREIGN KEY (user_id) REFERENCES t_user (id)
  ON DELETE RESTRICT;
