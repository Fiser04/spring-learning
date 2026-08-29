alter table products
    drop foreign key products_ibfk_1;

alter table products
    add constraint products_ibfk_1
        foreign key (category_id) references categories (id);