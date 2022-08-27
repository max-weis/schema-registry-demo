create sequence hibernate_sequence as BIGINT INCREMENT BY 1;

create table profile
(
    id         BIGINT,
    first_name VARCHAR(50),
    last_name  VARCHAR(50),
    email      VARCHAR(50),
    gender     VARCHAR(6),
    image      VARCHAR(256)
);