CREATE TABLE Departamentos (
    id_departamento INT AUTO_INCREMENT,
    nombre_departamento VARCHAR(50) NOT NULL,
    presupuesto DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id_departamento)
);

CREATE TABLE Empleados (
    DNI VARCHAR(10),
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    nacionalidad VARCHAR(50) NOT NULL,
    id_departamento INT,
    PRIMARY KEY (DNI),
    FOREIGN KEY (id_departamento) REFERENCES Departamentos(id_departamento)
);


/* Insertar un empleado nuevo en la nómina de trabajo. */
INSERT INTO Empleados (DNI, nombre, apellido, nacionalidad, id_departamento)
VALUES ('12345678A', 'Jose', 'Gonzalez', 'Argentina', 1);

/* 5. Modificar la nacionalidad de algún empleado. */
UPDATE Empleados SET nacionalidad = 'Uruguaya' WHERE DNI = '12345678A';

/* 6. Eliminar un departamento. */
DELETE FROM Departamentos WHERE id_departamento = 1;


/* 7. Conocer los empleados que trabajan en el departamento de “logística” (puede ser
cualquiera de los que agreguen). */
SELECT * FROM Empleados WHERE id_departamento = 1;

/* 8. Mostrar todos los departamentos ordenados alfabéticamente. */
SELECT nombre_departamento FROM Departamentos ORDER BY nombre_departamento ASC;