create table address
(
    id     bigint auto_increment
        primary key,
    street varchar(255) not null,
    city   varchar(255) not null,
    zip    varchar(255) not null,
    state  varchar(255) not null
);

alter table users
    add address_id bigint not null;

alter table users
    add constraint users_address_id_fk
        foreign key (address_id) references address (id);

