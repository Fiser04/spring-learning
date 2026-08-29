alter table address
    add user_id bigint not null;

alter table address
    add constraint address_users_id_fk
        foreign key (user_id) references users (id);
