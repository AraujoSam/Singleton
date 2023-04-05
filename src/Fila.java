public class Fila
{
    private String nome ="samuel";
    private static Fila instancia = null;

    public void ImprimeDocumeto()
    {

    }
    public void RemoveDocumento()
    {


    }

    public void RemoveTodosDocumentos()
    {

    }


    public String getNome()
    {
        return this.nome;
    }


    public void setNome(String nome)
    {
        this.nome = nome;
    }


    private Fila()
    {

    }

    public static Fila getInstance()
    {

        if(instancia  == null)
        {
            instancia = new Fila();//como instancia não está instanciada a nada, eu a instancio a fila
        }

        return instancia;//caso já esteja instanciada eu a retorno do mesmo jeito

    }

}
