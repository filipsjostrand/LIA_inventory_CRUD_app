drop table if exists organization CASCADE;

create table organization (id bigint generated by default as identity, location varchar(255) not null, name varchar(255) not null, primary key (id));

alter table organization add constraint UK_2d01v70dyja5siieksttsxscp unique (location);
alter table organization add constraint UK_8j5y8ipk73yx2joy9yr653c9t unique (name);

/*
create table organization (id bigint generated by default as identity, location varchar(255) not null, name varchar(255) not null, organization_id bigint, primary key (id));
alter table organization add constraint UK_2d01v70dyja5siieksttsxscp unique (location);
alter table organization add constraint UK_8j5y8ipk73yx2joy9yr653c9t unique (name);
//alter table organization add constraint FKqe60n6johnnctx5k5ykwditlr foreign key (organization_id) references organization;
*/