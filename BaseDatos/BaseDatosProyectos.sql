CREATE DATABASE PROYECTOENTORNOS;
USE PROYECTOENTORNOS;
-- Creamos las tablas
CREATE TABLE Cliente(
IDCliente int NOT NULL PRIMARY KEY,
DNI varchar(9) ,
Nombre varchar(255),
Apellidos varchar(255),
Edad int(3)
);

CREATE TABLE Reparacion (
Descripcion varchar(255) NOT NULL PRIMARY KEY,
IDVehiculo int,
IDCliente int,
Fecha date,
Tiempo varchar(255),
totalReparacion double
);

CREATE TABLE Vehiculo (
IDVehiculo int NOT NULL PRIMARY KEY,
Matricula varchar(255),
Marca varchar(255),
Modelo varchar(255),
Año varchar(255),
Color varchar(255)
);


-- Añadimos las Foreign Keys para conectar las tablas
USE ProyectoEntornos;
ALTER TABLE Reparacion
ADD FOREIGN KEY (IDVehiculo)
REFERENCES Vehiculo (IDVehiculo)
ON DELETE CASCADE
ON UPDATE CASCADE;

USE ProyectoEntornos;

ALTER TABLE Reparacion
ADD FOREIGN KEY (IDCliente)
REFERENCES Cliente (IDCliente)
ON DELETE CASCADE
ON UPDATE CASCADE;

-- Añadimos registros

INSERT INTO Cliente (IDCliente, DNI, Nombre, Apellidos, Edad) VALUES
(1, '12345678A', 'Juan', 'García', 25),
(2, '23456789B', 'María', 'Pérez', 30),
(3, '34567890C', 'Pedro', 'Martínez', 45),
(4, '45678901D', 'Ana', 'López', 50),
(5, '56789012E', 'Javier', 'González', 28),
(6, '67890123F', 'Lucía', 'Fernández', 37),
(7, '78901234G', 'Marta', 'Ruiz', 42),
(8, '89012345H', 'Manuel', 'Sánchez', 55),
(9, '90123456I', 'Sara', 'Jiménez', 23),
(10, '01234567J', 'Pablo', 'Romero', 31);

INSERT INTO Vehiculo (IDVehiculo, Matricula, Marca, Modelo, Año, Color) VALUES
(1, '1234ABC', 'Seat', 'Ibiza', '2018', 'Rojo'),
(2, '5678DEF', 'Renault', 'Clio', '2020', 'Azul'),
(3, '9012GHI', 'Ford', 'Focus', '2016', 'Blanco'),
(4, '3456JKL', 'Peugeot', '208', '2019', 'Gris'),
(5, '7890MNO', 'Opel', 'Corsa', '2017', 'Negro'),
(6, '2345PQR', 'Volkswagen', 'Golf', '2021', 'Blanco'),
(7, '6789STU', 'Fiat', '500', '2015', 'Rojo'),
(8, '1234VWX', 'Toyota', 'Corolla', '2022', 'Gris'),
(9, '5678YZA', 'Hyundai', 'Kona', '2018', 'Negro'),
(10, '9012BCD', 'Kia', 'Ceed', '2020', 'Azul');

INSERT INTO Reparacion (Descripcion, IDVehiculo, IDCliente, Fecha, Tiempo, totalReparacion) VALUES
('Cambio de aceite', 1, 1, '2022-02-05', '2 horas', 60.00),
('Revisión anual', 2, 2, '2021-12-12', '3 horas', 90.00),
('Cambio de pastillas de freno', 3, 3, '2022-01-10', '4 horas', 120.00),
('Cambio de neumáticos', 4, 4, '2021-10-15', '5 horas', 150.00),
('Reparación de motor', 5, 5, '2022-03-20', '6 horas', 180.00),
('Cambio de batería', 6, 6, '2022-04-25', '1 hora', 30.00),
('Cambio de filtro de aire', 7, 7, '2021-11-30', '2 horas', 60.00),
('Reparación de chapa y pintura', 8, 8, '2021-09-22', '8 horas', 120.00);
