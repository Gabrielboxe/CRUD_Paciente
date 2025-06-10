# CRUD_Paciente
Pacientes API
Projeto de uma API RESTful para gerenciamento de pacientes (CRUD - Create, Read, Update, Delete), desenvolvido com Java 17 e Spring Boot 3.
🚀 Requisitos
Para executar este projeto localmente, você precisará ter instalado em sua máquina:
Java Development Kit (JDK): Versão 17 ou superior.
Maven: Ferramenta de gerenciamento de dependências e build.
PostgreSQL: Banco de dados relacional.
Uma IDE de sua preferência, como IntelliJ IDEA ou VS Code.
⚙️ Configuração do Ambiente
Clone o Repositório:
git clone https://[URL_DO_SEU_REPOSITORIO_GIT]
cd pacientes-api


Crie o Banco de Dados:
No seu PostgreSQL, crie um banco de dados para a aplicação. O nome padrão configurado é pacientes_db.
Configure as Variáveis de Ambiente:
Abra o arquivo src/main/resources/application.properties.
Altere as seguintes propriedades com as suas credenciais do PostgreSQL:
spring.datasource.url=jdbc:postgresql://localhost:5432/pacientes_db
spring.datasource.username=seu_usuario_postgres
spring.datasource.password=sua_senha_postgres


▶️ Executando a Aplicação
Você pode executar a aplicação de duas maneiras:
1. Pela IDE (Recomendado)
Abra o projeto na sua IDE (ex: IntelliJ IDEA).
Localize a classe principal PacientesApiApplication.java.
Clique com o botão direito sobre ela e selecione Run 'PacientesApiApplication'.
2. Pelo Terminal com Maven
Navegue até a pasta raiz do projeto.
Execute o seguinte comando:
mvn spring-boot:run


A API estará disponível em http://localhost:8080.
📝 Endpoints da API
A URL base para todos os endpoints é http://localhost:8080/pacientes.
Método
Endpoint
Descrição
Corpo da Requisição (Exemplo)
POST
/
Cria um novo paciente.
{"nome": "Rex", "idade": 5, "raca": "Labrador", "tutorResponsavel": "João Silva"}
GET
/
Lista todos os pacientes.
N/A
GET
/{id}
Busca um paciente pelo seu ID.
N/A
PUT
/{id}
Atualiza um paciente existente.
{"nome": "Rex Atualizado", "idade": 6, "raca": "Labrador", "tutorResponsavel": "João Silva"}
DELETE
/{id}
Deleta um paciente pelo seu ID.
N/A

🌐 Link da API Online
Atualmente, a API está configurada para ser executada em ambiente local.
URL Base (Local): http://localhost:8080
(Caso o projeto seja implantado em um servidor, o link da API online será adicionado aqui).
