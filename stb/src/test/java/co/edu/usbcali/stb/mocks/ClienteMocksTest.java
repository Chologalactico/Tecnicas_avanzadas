package co.edu.usbcali.stb.mocks;

import co.edu.usbcali.stb.domain.Cliente;


import java.util.Arrays;
import java.util.List;

public class ClienteMocksTest {

    public static Integer ID_UNO = 1;
    public static Integer ID_DOS = 2;

    public static String NOMBRE_UNO = "N1";
    public static String NOMBRE_DOS = "N2";

    public static String DIRECCION_UNO = "D1";
    public static String DIRECCION_DOS = "D2";

    public static String CEDULA_UNO = "C1";
    public static String CEDULA_DOS = "C2";

    public static Cliente CLIENTE_UNO=
            Cliente.builder()
                    .idCliente(ID_UNO)
                    .nomCliente(NOMBRE_UNO)
                    .direcCliente(DIRECCION_UNO)
                    .cedulaCliente(CEDULA_UNO)
                    .build();

    public static Cliente CLIENTE_DOS=
            Cliente.builder()
                    .idCliente(ID_DOS)
                    .nomCliente(NOMBRE_DOS)
                    .direcCliente(DIRECCION_DOS)
                    .cedulaCliente(CEDULA_DOS)
                    .build();

    public static List<Cliente> CLIENTES_LIST =
            Arrays.asList(CLIENTE_UNO,CLIENTE_DOS);





}
