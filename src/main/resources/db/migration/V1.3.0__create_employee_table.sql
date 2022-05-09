drop table if exists employee CASCADE;

create table employee (id bigint generated by default as identity, firstname varchar(255) not null, lastname varchar(255) not null, organization_id bigint, primary key (id));

alter table employee add constraint UK_odeif7ievx2asgt77vtqtsbta unique (firstname);
alter table employee add constraint UK_gph4f6140tr3riucjcy5jkx7b unique (lastname);


--create table employee (id bigint generated by default as identity, firstname varchar(255) not null, org_id integer not null, organization_id bigint, primary key (id));

--alter table employee add constraint UK_odeif7ievx2asgt77vtqtsbta unique (firstname);
--alter table employee add constraint UK_j3t6cbvfqphukt6qc7sxcgm39 unique (org_id);
//alter table employee add constraint FK2rna2w2imtuuk9f2et8yllawk foreign key (organization_id) references organization;

/*
create table employee (id bigint generated by default as identity, firstname varchar(255) not null, organization_id integer not null, primary key (id));
alter table employee add constraint UK_odeif7ievx2asgt77vtqtsbta unique (firstname);
alter table employee add constraint UK_sfap0psgqho076hl6mwkaf9m9 unique (organization_id);
*/