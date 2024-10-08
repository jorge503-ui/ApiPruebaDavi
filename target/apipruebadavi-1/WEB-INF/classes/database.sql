-- Crear tabla ACTIVIDADES_ECONOMICAS
CREATE TABLE ACTIVIDADES_ECONOMICAS (
    ID_ACTIVIDAD_ECONOMICA SERIAL PRIMARY KEY,
    DESCRIPCION VARCHAR(255) NOT NULL
);

-- Crear tabla ESTADO_CIVIL
CREATE TABLE ESTADO_CIVIL (
    ID_ESTADO_CIVIL SERIAL PRIMARY KEY,
    DESCRIPCION VARCHAR(255) NOT NULL
);

-- Crear tabla FORMA_PAGO
CREATE TABLE FORMA_PAGO (
    ID_FORMA_PAGO SERIAL PRIMARY KEY,
    DESCRIPCION VARCHAR(255) NOT NULL
);

-- Crear tabla PERSONA
CREATE TABLE PERSONA (
    ID_PERSONA SERIAL PRIMARY KEY,
    DUI VARCHAR(20) NOT NULL,
    NIT VARCHAR(20) NOT NULL,
    NOMBRES VARCHAR(255) NOT NULL,
    APELLIDOS VARCHAR(255) NOT NULL,
    SEXO CHAR(1) NOT NULL,
    ID_ACTIVIDAD_ECONOMICA INT,
    ID_ESTADO_CIVIL INT,
    FOREIGN KEY (ID_ACTIVIDAD_ECONOMICA) REFERENCES ACTIVIDADES_ECONOMICAS(ID_ACTIVIDAD_ECONOMICA),
    FOREIGN KEY (ID_ESTADO_CIVIL) REFERENCES ESTADO_CIVIL(ID_ESTADO_CIVIL)
);

-- Crear tabla SOLICITUD
CREATE TABLE SOLICITUD (
    ID_SOLICITUD SERIAL PRIMARY KEY,
    FECHA_CREACION DATE NOT NULL,
    MONTO DECIMAL(10, 2) NOT NULL,
    PLAZO INT NOT NULL,
    ID_PERSONA INT,
    ID_FORMA_PAGO INT,
    FOREIGN KEY (ID_PERSONA) REFERENCES PERSONA(ID_PERSONA),
    FOREIGN KEY (ID_FORMA_PAGO) REFERENCES FORMA_PAGO(ID_FORMA_PAGO)
);

-- Insertar registros en la tabla ACTIVIDADES_ECONOMICAS
INSERT INTO ACTIVIDADES_ECONOMICAS (DESCRIPCION) VALUES
('Comercio'),
('Servicios'),
('Manufactura');

-- Insertar registros en la tabla ESTADO_CIVIL
INSERT INTO ESTADO_CIVIL (DESCRIPCION) VALUES
('Soltero'),
('Casado'),
('Divorciado');

-- Insertar registros en la tabla FORMA_PAGO
INSERT INTO FORMA_PAGO (DESCRIPCION) VALUES
('Efectivo'),
('Tarjeta de Crédito'),
('Transferencia Bancaria');

-- Insertar registros en la tabla PERSONA
INSERT INTO PERSONA (DUI, NIT, NOMBRES, APELLIDOS, SEXO, ID_ACTIVIDAD_ECONOMICA, ID_ESTADO_CIVIL) VALUES
('12345678-9', '0614-123456-001-0', 'Juan', 'Pérez', 'M', 1, 1),
('98765432-1', '0614-987654-001-0', 'María', 'González', 'F', 2, 2),
('45678901-2', '0614-456789-001-0', 'Carlos', 'López', 'M', 3, 3);

-- Insertar registros en la tabla SOLICITUD
INSERT INTO SOLICITUD (FECHA_CREACION, MONTO, PLAZO, ID_PERSONA, ID_FORMA_PAGO) VALUES
('2024-09-01', 1000.00, 12, 1, 1),
('2024-09-02', 2000.00, 24, 2, 2),
('2024-09-03', 1500.00, 18, 3, 3);
