INSERT INTO cliente(id, apellidom, apellidop, estado, fechadenacimiento, nombre, numerodocumento, tipodocumento) VALUES (3, 'TEST', 'TEST', true, '2000-10-10', 'TEST', '12345678', 'DNI');
INSERT INTO ctabancaria(id, cliente, cuentabancaria, estado, saldoactual) VALUES (3, '12345678', '1234', true, 100.0);

--INSERT INTO operacion(Id,Fecha,Descripcion,Monto,NumeroCuenta,Estado) VALUES (1,null,'ABONO',100.6,'123456',true);