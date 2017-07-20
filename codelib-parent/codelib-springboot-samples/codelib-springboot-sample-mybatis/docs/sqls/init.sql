create table groups (
    id bigint primary key,
    group_name varchar(50) not null
);

create table group_authorities (
    group_id bigint not null,
    authority varchar(50) not null,
    constraint fk_group_authorities_group foreign key(group_id) references groups(id)
);

create table group_members (
    id bigint primary key,
    username varchar(50) not null,
    group_id bigint not null,
    constraint fk_group_members_group foreign key(group_id) references groups(id)
);

INSERT INTO groups (id,group_name) VALUES (1,'groupA');
INSERT INTO groups (id,group_name) VALUES (2,'groupB');

INSERT INTO group_authorities (group_id,authority) VALUES (1,'ROLE_USER1');
INSERT INTO group_authorities (group_id,authority) VALUES (2,'ROLE_USER2');
INSERT INTO group_authorities (group_id,authority) VALUES (1,'ROLE_ADMIN1');
INSERT INTO group_authorities (group_id,authority) VALUES (2,'ROLE_ADMIN2');

INSERT INTO group_members (id,username,group_id) VALUES (1,'zhangsan',1);
INSERT INTO group_members (id,username,group_id) VALUES (2,'lisi',2);
INSERT INTO group_members (id,username,group_id) VALUES (3,'wangwu',1);
INSERT INTO group_members (id,username,group_id) VALUES (4,'liuliu',2);