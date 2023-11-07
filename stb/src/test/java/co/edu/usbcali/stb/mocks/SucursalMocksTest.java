package co.edu.usbcali.stb.mocks;

import co.edu.usbcali.stb.domain.Sucursal;

import java.util.Arrays;
import java.util.List;

public class SucursalMocksTest {

    public static Integer ID_UNO = 1;
    public static Integer ID_DOS = 2;
    public static String DIRECCIONSUC_UNO = "D1";
    public static String DIRECCIONSUC_DOS = "D2";
    public static String NOMBRESUC_UNO = "N1";
    public static String NOMBRESUC_DOS = "N2";

    public static Sucursal SUCURSAL_UNO=
            Sucursal.builder()
                    .idSucursal(ID_UNO)
                    .direcSucursal(DIRECCIONSUC_UNO)
                    .nomSucursal(NOMBRESUC_UNO)
                    .build();

    public static Sucursal SUCURSAL_DOS=
            Sucursal.builder()
                    .idSucursal(ID_DOS)
                    .direcSucursal(DIRECCIONSUC_DOS)
                    .nomSucursal(NOMBRESUC_DOS)
                    .build();

    public static List<Sucursal> SUCURSAL_LIST=
            Arrays.asList(SUCURSAL_UNO,SUCURSAL_DOS);
}
