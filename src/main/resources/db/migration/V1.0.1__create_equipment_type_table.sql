//drop table if exists equipmenttype CASCADE;
drop table if exists equipment_type CASCADE;

create table equipment_type (id bigint generated by default as identity, name varchar(255) not null, primary key (id));

    alter table equipment_type add constraint UK_ly5pm93u4ps4l4936g1neschk unique (name);