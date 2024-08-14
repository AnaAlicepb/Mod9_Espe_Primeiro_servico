INSERT
    INTO
    resgatador
    (nome)
    VALUES
    ('Ana'),
    ('Rafaella'),
    ('Maria');

 INSERT
    INTO
    animal
    (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, porte, data_adocao, resgatador_id, tipo)
    VALUES
    ('Naruto', 5, 'Fila brasileiro', current_date -254, 'pulguento', 'Grande', current_date - 35, 1, 'CACHORRO'),
        ('Bethoven', 2, 'Angorá', current_date -25, 'machucado', 'pequeno', current_date - 3, 1, 'GATO'),
        ('Bethoven', 2, 'Angorá', current_date -25, 'machucado', 'pequeno', current_date - 3, 1, 'GATO'),
        ('Latifa', 3, 'Labrador retriever', current_date -5, 'magro', 'Médio', current_date - 5, 1, 'CACHORRO'),
        ('Luli', 2, 'SRD', current_date -368, 'Desnutrido', 'Médio', NULL, 1, 'CACHORRO'),
        ('PSakura', 4, 'Siamês', current_date -408, 'Magra', 'Pequena', current_date -7, 2, 'GATO'),
        ('Tsunad', 2, 'Persa', current_date - 32, 'Bem', 'Pequena', current_date - 30, 3, 'GATO');
