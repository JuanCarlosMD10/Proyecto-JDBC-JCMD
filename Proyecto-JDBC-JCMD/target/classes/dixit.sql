DROP DATABASE IF EXISTS jdbcMySqlAcceso;
CREATE DATABASE jdbcMySqlAcceso;

CREATE TABLE IF NOT EXISTS jdbcMySqlAcceso.MejiasJuanCarlosJugador (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100)  NOT NULL,
    puntosTotales INT DEFAULT 0
);

CREATE TABLE IF NOT EXISTS jdbcMySqlAcceso.MejiasJuanCarlosPartida (
    id INT AUTO_INCREMENT PRIMARY KEY,
    narrador_id INT,
    fecha DATE NOT NULL,
    resultado ENUM('TODOS', 'NADIE', 'ALGUNOS') NOT NULL,
    FOREIGN KEY (narrador_id) REFERENCES MejiasJuanCarlosJugador(id)
);