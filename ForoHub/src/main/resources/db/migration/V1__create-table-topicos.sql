CREATE TABLE topicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    mensaje VARCHAR(500) NOT NULL,
    fecha_creacion DATETIME NOT NULL,
    status TINYINT NOT NULL DEFAULT(1),
    curso VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);
