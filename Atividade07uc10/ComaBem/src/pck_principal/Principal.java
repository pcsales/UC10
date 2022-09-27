package pck_principal;
/*classe principal para executar as demais classes do projeto*/
public class Principal{
    public static void main(String[] args){ //método principal do projeto
        DAO_Produtos obj_produtos = new DAO_Produtos(); //instancia da classe DAO_Produtos

        //consultar produtos
        //obj_produtos.consultar();//chamar o metodo consultar

        //Inserir Produtos
        //Produto novoProduto = new Produto(7, "maca",25.00,12.00,1);//instancia da classe Unidade passando parâmetros
        //obj_produtos.inserir(novoProduto); // chamar o metodo inserir

        //alterar produto
        //Produto produtoAlterado = new Produto(7, "maca alterada", 27.00, 11.00, 2);//instancia da classe Unidade passando parâmetros
        //obj_produtos.alterar(produtoAlterado);//chamar o metodo alterar

        //excluir produtos
        //obj_produtos.excluir(7);//chamar o metdo excluir

        DAO_Unidades obj_unidades = new DAO_Unidades(); //instancia da classe DAO_Unidades

        //consultar
        //obj_unidades.consultar();//chamar o metodo consultar

        //inserir unidade
        //Unidade novaUnidade = new Unidade(5,"unidade new");//instancia da classe Unidade passando parâmetros
        //obj_unidades.inserir(novaUnidade);//chamar o metodo inserir

        //alterar unidade
        //Unidade unidadeAlterada = new Unidade(5,"unidade new alterada");//instancia da classe Unidade passando parâmetros
        //obj_unidades.alterar(unidadeAlterada); //chamar o metodo alterar

        //exluir unidade
        //obj_unidades.excluir(5); // chamar o metodo excluir
    }
}
