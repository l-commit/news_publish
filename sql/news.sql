-- 创建数据库
-- create database news;
-- use news;
create table t_role
(
    roleId   INT PRIMARY KEY,
    roleName VARCHAR(20)
);

INSERT into t_role
values (1, '管理员');
INSERT into t_role
values (2, '信息员');

create table t_user
(
    userId INT PRIMARY KEY auto_increment,
    userName VARCHAR(20),
    loginName VARCHAR(20),
    password varchar(20),
    tel VARCHAR(50),
    registerTime datetime,
    status char(1),
    roleId int,
    FOREIGN KEY (roleId) references t_role(roleId)
);

insert into t_user(userName, loginName, password, status, roleId ) values('无为','admin','123456','2',1);

create table t_category(
    categoryId int primary key,
    categoryName varchar(20)
);

insert into t_category values (1,'今日头条');
insert into t_category values (2,'综合资讯');

create table t_news(
    newsId int primary key auto_increment,
    title varchar(60),
    contentTitle varchar(120),
    titlePicUrl varchar (120),
    content text,
    contentAbstract varchar (300),
    keywords varchar (100),
    author varchar (30),
    publishTime datetime,
    clicks int,
    publishStatus char(1),
    categoryId int,
    userId int,
    foreign key (categoryId) references t_category(categoryId),
    foreign key(userId) references t_user(userId)
);