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

CREATE UNIQUE INDEX first_name_idx ON profile (first_name);
CREATE UNIQUE INDEX last_name_idx ON profile (last_name);
CREATE UNIQUE INDEX email_idx ON profile (email);
