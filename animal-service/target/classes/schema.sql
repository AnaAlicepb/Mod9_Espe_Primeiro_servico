CREATE TABLE resgatador (
  id INT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
  nome VARCHAR(255) NOT NULL,
  CONSTRAINT pk_resgatador PRIMARY KEY (id)
);

CREATE TABLE animal (
  id INT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
  nome_provisorio VARCHAR(255) NOT NULL,
  idade_estimada INT NOT NULL,
  raca VARCHAR(255) NOT NULL,
  data_entrada DATE NOT NULL,
  data_adocao DATE,
  condicoes_chegada VARCHAR(255) NOT NULL,
  resgatador_id INT,
  data_obito DATE,
  porte VARCHAR(255) NOT NULL,
  tipo VARCHAR(255),
  CONSTRAINT pk_animal PRIMARY KEY (id),
  CONSTRAINT FK_ANIMAL_ON_RESGATADOR FOREIGN KEY (resgatador_id) REFERENCES resgatador (id)
);