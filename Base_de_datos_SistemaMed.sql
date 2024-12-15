Create database Clinica;
USE CLINICA;
	CREATE TABLE Citas (
		idCita INT AUTO_INCREMENT PRIMARY KEY, 
		Fecha DATE NOT NULL,             
		Hora TIME NOT NULL,                  
		Paciente VARCHAR(100) NOT NULL,      
		Motivo VARCHAR(255),                 
		Estado ENUM('Pendiente', 'Completada', 'Cancelada') DEFAULT 'Pendiente' 
	);

ALTER TABLE Citas DROP COLUMN paciente;

-- Agregar la columna 'idPaciente' para relacionar con la tabla Pacientes
ALTER TABLE Citas ADD COLUMN idPaciente INT NOT NULL;

-- Agregar la clave foránea para relacionar las tablas
ALTER TABLE Citas 
ADD CONSTRAINT fk_idPaciente
FOREIGN KEY (idPaciente) REFERENCES Pacientes(idPaciente)
ON DELETE CASCADE;

    
    SELECT *FROM CITAS;
    ALTER TABLE citas auto_increment=2;
    ALTER TABLE pacientes auto_increment=2;
     CREATE TABLE Pacientes(
     idPaciente INT AUTO_INCREMENT PRIMARY KEY,
     nombre VARCHAR(50) NOT NULL,
     apellidos VARCHAR(50) NOT NULL,
     edad INT NOT NULL,
     genero VARCHAR(10) NOT NULL,
     direccion VARCHAR (100) NOT NULL,
     telefono INT(10) NOT NULL,
     Correo VARCHAR(60) NOT NULL
	);
    SELECT 
    Citas.idCita, 
    Citas.Fecha, 
    Citas.Hora, 
    CONCAT(Pacientes.nombre, ' ', Pacientes.apellidos) AS NombreCompleto,
    Citas.Motivo, 
    Citas.Estado
FROM Citas
INNER JOIN Pacientes ON Citas.idPaciente = Pacientes.idPaciente;

    SELECT * FROM pacientes;
    
    CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    role VARCHAR(20) NOT NULL
);
INSERT INTO usuarios (username, password, role) 
VALUES 
('admin', 'admin123', 'administrador'), 
('doctor1', 'doctor123', 'doctor');


CREATE TABLE Profesionales (
    idProfesional INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(150) NOT NULL,
    edad INT NOT NULL,
    genero ENUM('Masculino', 'Femenino', 'Otro') NOT NULL,
    especialidad VARCHAR(100) not null,
    experiencia VARCHAR(100) NOT NULL,
    horaEntrada TIME NOT NULL,
    horaSalida TIME NOT NULL
);
SELECT * FROM profesionales;

	

