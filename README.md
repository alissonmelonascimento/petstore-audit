# petstore-audit
Persiste dados de auditoria das operações de um petshop usando um módulo quarkus separado do projeto principal.
<br>
Cada serviço do backend do petshop que for chamado persistirá uma linha no banco de dados dizendo que a operação foi concluída com sucesso ou não.
<br>
Tem como objetivo demonstrar como modularizar um projeto Quarkus criando extensões.
<br>
ATENÇÃO: as configurações de conexão com o banco de dados não ficam neste projeto, mas no projeto principal.
