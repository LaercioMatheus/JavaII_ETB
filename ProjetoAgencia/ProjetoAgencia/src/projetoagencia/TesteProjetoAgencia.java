package projetoagencia;

public class TesteProjetoAgencia {

    public static void main(String[] args) throws Exception {

        //Testar conexão
        /*Connection conn = createConnectionToMySQL();

        if (conn != null) {
            System.out.println("Conectado!");

            conn.close();
        }*/
        //Criar registro
        Carro carro = new Carro();

        carro.setFabricante("BMW");
        carro.setTamanho("Grande");
        carro.setTipo("Viagem");
        carro.setValor(107.365);
        carro.setCor("Preto");

        CarroDAO carroDao = new CarroDAO();
        //carroDao.save(carro);
        //Pesquisar Registro
        for (Carro car : carroDao.getCarros()) {
            System.out.println("--- Automóvel ---\n"
                    + " id: " + car.getId()
                    + " Fabricante: " + car.getFabricante()
                    + " Tamanho: " + car.getTamanho()
                    + " Tipo: " + car.getTipo()
                    + " Valor: " + car.getValor()
                    + " Cor: " + car.getCor()
            );
        }

    }
}
