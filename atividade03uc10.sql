/*inserção de dados nas tabelas*/
insert into Unidades (ds_unidade) values ("kilo");
insert into Unidades (ds_unidade) values ("Unidade");
insert into Unidades (ds_unidade) values ("Litro");
insert into Unidades (ds_unidade) values ("Metro");
insert into Unidades (ds_unidade) values ("Duzia");

insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Carne", 30.00, 2,1);
insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Oleo", 7.59, 1,2);
insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Leite", 4.50, 1.5,3);
insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Alface", 1.50, 1,2);
insert into Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) values ("Laranja", 1.99, 2,5);

/*consultar dados tablas*/
select * from Produtos;
select * from Unidades;

/*alteração de dados nas tabelas*/
update Produtos set ds_produto = "Frango" where cd_produto = 1;
update Unidades set ds_unidade = "Und" where cd_unidade = 2;

/*exclusão de dados nas tabelas*/
delete from Produtos where cd_produto = 5;
delete from Unidades where cd_unidade = 5;

