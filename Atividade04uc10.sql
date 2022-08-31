/*criar novo perfil de acesso ao banco*/
create role newPerfil;

/*criar novo usuário e o adicionar no perfil criado anteriormente*/
create user Paulo identified by '123456' default role newPerfil;

/*definir o usuario criado para usar apenas o select*/
grant select on comabem.* to Paulo;

/*tentar fazer inserção de dados, erro pq o usuariio esta liberado para select*/
insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("bolo de chocolate", 25.00, 3, 4);