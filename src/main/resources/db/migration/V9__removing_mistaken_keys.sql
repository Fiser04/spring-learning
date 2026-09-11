
alter table users
    drop foreign key users_address_id_fk;

drop index users_address_id_fk on users;

alter table users
    drop column address_id;