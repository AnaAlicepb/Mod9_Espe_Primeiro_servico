<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
</head>
<body style="font-family: Arial, sans-serif; margin: 0; padding: 20px; background-color: #f4f4f4;">
    <h1 style="color: #333;">Animal Service API</h1>
    <h2 style="color: #333;">Descrição do Projeto</h2>
    <p style="color: #555; line-height: 1.6;">O <strong>Animal Service</strong> é uma API RESTful desenvolvida em Java com Spring Boot que permite o gerenciamento de animais resgatados por um abrigo. A aplicação suporta operações de cadastro e consulta de cães e gatos, fornecendo informações detalhadas sobre os animais, como data de entrada, adoção, e o responsável pelo resgate.</p>
    <h2 style="color: #333;">Funcionalidades</h2>
    <ul style="color: #555; line-height: 1.6;">
        <li><strong>Cadastro de Animais</strong>: Permite adicionar novos animais resgatados ao sistema.</li>
        <li><strong>Listagem de Todos os Animais</strong>: Exibe todos os animais cadastrados no abrigo.</li>
        <li><strong>Listagem de Animais Não Adotados</strong>: Exibe os animais que ainda não foram adotados, ordenados pela data de entrada no abrigo.</li>
        <li><strong>Listagem de Animais Adotados</strong>: Exibe os animais que já foram adotados.</li>
        <li><strong>Listagem de Animais por Resgatador</strong>: Mostra a quantidade de animais resgatados por cada pessoa em um intervalo de um ano.</li>
    </ul>
    <h2 style="color: #333;">Tecnologias Utilizadas</h2>
    <ul style="color: #555; line-height: 1.6;">
        <li><strong>Java</strong>: Linguagem principal do projeto.</li>
        <li><strong>Spring Boot</strong>: Framework para facilitar o desenvolvimento de aplicações Java.</li>
        <li><strong>H2 Database</strong>: Banco de dados utilizado para armazenar as informações dos animais.</li>
        <li><strong>Maven</strong>: Ferramenta de gerenciamento de dependências e automação de build.</li>
        <li><strong>Postman</strong>: Utilizado para testar as APIs.</li>
    </ul>
    <h2 style="color: #333;">Endpoints</h2>
    <ul style="color: #555; line-height: 1.6;">
        <li><strong>POST <code style="background-color: #eee; padding: 2px 4px; font-family: Consolas, monospace; border-radius: 4px;">/animais</code></strong>: Cadastra um novo animal.</li>
        <li><strong>GET <code style="background-color: #eee; padding: 2px 4px; font-family: Consolas, monospace; border-radius: 4px;">/animais</code></strong>: Lista todos os animais cadastrados.</li>
        <li><strong>GET <code style="background-color: #eee; padding: 2px 4px; font-family: Consolas, monospace; border-radius: 4px;">/animais/not-adopted</code></strong>: Lista animais que ainda não foram adotados.</li>
        <li><strong>GET <code style="background-color: #eee; padding: 2px 4px; font-family: Consolas, monospace; border-radius: 4px;">/animais/adopted</code></strong>: Lista animais que já foram adotados.</li>
        <li><strong>GET <code style="background-color: #eee; padding: 2px 4px; font-family: Consolas, monospace; border-radius: 4px;">/animais/animais-resgatadores</code></strong>: Lista a quantidade de animais resgatados por cada pessoa em um intervalo de um ano.</li>
    </ul>
    <h2 style="color: #333;">Configuração</h2>
    <ol style="color: #555; line-height: 1.6;">
        <li><strong>Clone o Repositório</strong>:
            <pre style="background-color: #eee; padding: 10px; border-radius: 4px; overflow-x: auto;"><code style="font-family: Consolas, monospace;">git clone &lt;url-do-repositorio&gt;</code></pre>
        </li>
        <li><strong>Importe o Projeto no IDE</strong>:
            <p style="color: #555; line-height: 1.6;">Abra o projeto no Eclipse ou IntelliJ como um projeto Maven.</p>
        </li>
        <li><strong>Configuração do Banco de Dados H2</strong>:
            <p style="color: #555; line-height: 1.6;">As configurações de acesso ao banco H2 estão no arquivo <code style="background-color: #eee; padding: 2px 4px; font-family: Consolas, monospace; border-radius: 4px;">application.properties</code>.</p>
        </li>
        <li><strong>Executar o Projeto</strong>:
            <p style="color: #555; line-height: 1.6;">Execute a aplicação como um projeto Spring Boot.</p>
        </li>
        <li><strong>Testando as APIs</strong>:
            <p style="color: #555; line-height: 1.6;">Utilize o Postman ou outra ferramenta similar para testar os endpoints descritos acima.</p>
        </li>
    </ol>
    <h2 style="color: #333;">Banco de Dados</h2>
    <h3 style="color: #333;">Tabelas</h3>
    <ul style="color: #555; line-height: 1.6;">
        <li><strong>resgatador</strong>: Armazena informações sobre os resgatadores.</li>
        <li><strong>animal</strong>: Armazena informações sobre os animais resgatados.</li>
    </ul>
    <h3 style="color: #333;">Scripts de Inserção</h3>
    <pre style="background-color: #eee; padding: 10px; border-radius: 4px; overflow-x: auto;"><code style="font-family: Consolas, monospace;">INSERT INTO resgatador (nome) VALUES ('Ana'), ('Rafaella'), ('Maria');

INSERT INTO animal (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, porte, data_adocao, resgatador_id, tipo) 
VALUES 
('Naruto', 5, 'Fila brasileiro', current_date -254, 'pulguento', 'Grande', current_date - 35, 1, 'CACHORRO'),
('Bethoven', 2, 'Angorá', current_date -25, 'machucado', 'pequeno', current_date - 3, 1, 'GATO'),
('Latifa', 3, 'Labrador retriever', current_date -5, 'magro', 'Médio', current_date - 5, 1, 'CACHORRO'),
('Luli', 2, 'SRD', current_date -368, 'Desnutrido', 'Médio', NULL, 1, 'CACHORRO'),
('Sakura', 4, 'Siamês', current_date -408, 'Magra', 'Pequena', current_date -7, 2, 'GATO'),
('Tsunade', 2, 'Persa', current_date - 32, 'Bem', 'Pequena', current_date - 30, 3, 'GATO');</code></pre>
    <h2 style="color: #333;">Contribuição</h2>
    <ol style="color: #555; line-height: 1.6;">
        <li><strong>Fork o Repositório</strong>.</li>
        <li><strong>Crie uma Branch</strong> para sua feature (<code style="background-color: #eee; padding: 2px 4px; font-family: Consolas, monospace; border-radius: 4px;">git checkout -b feature/nova-feature</code>).</li>
        <li><strong>Commit suas alterações</strong> (<code style="background-color: #eee; padding: 2px 4px; font-family: Consolas, monospace; border-radius: 4px;">git commit -m 'Adicionando nova feature'</code>).</li>
        <li><strong>Faça o Push para a Branch</strong> (<code style="background-color: #eee; padding: 2px 4px; font-family: Consolas, monospace; border-radius: 4px;">git push origin feature/nova-feature</code>).</li>
        <li><strong>Abra um Pull Request</strong>.</li>
    </ol>
    <h2 style="color: #333;">Autor</h2>
    <p style="color: #555; line-height: 1.6;">Projeto desenvolvido por <strong>Ana</strong> para o gerenciamento de animais resgatados em abrigos.</p>
</body>
</html>

