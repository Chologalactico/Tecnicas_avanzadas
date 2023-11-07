package co.edu.usbcali.stb.mocks;

import co.edu.usbcali.stb.domain.Cuenta;


import java.util.Arrays;
import java.util.List;

public class CuentaMocksTest {

    public static Integer ID_UNO = 1;
    public static Integer ID_DOS = 2;
    public static String NUMERO_UNO = "N1";
    public static String NUMERO_DOS = "N2";
    public static Integer SALDO_UNO = 1;
    public static Integer SALDO_DOS = 2;
    public static String TIPO_UNO = "T1";
    public static String TIPO_DOS = "T2";
    public static String USER_UNO = "U1";
    public static String USER_DOS = "U2";
    public static String CONTR_UNO = "C1c";
    public static String CONTR_DOS = "C2c";
    public static Integer LIMITE_UNO = 1;
    public static Integer LIMITE_DOS = 2;
    public static Integer CLAVE_UNO = 1;
    public static Integer CLAVE_DOS = 2;


    public static Cuenta CUENTA_UNO =
            Cuenta.builder()
                    .idCuenta(ID_UNO)
                    .numCuenta(NUMERO_UNO)
                    .saldocuenta(SALDO_UNO)
                    .tipoCuenta(TIPO_UNO)
                    .userCuenta(USER_UNO)
                    .contrCuenta(CONTR_UNO)
                    .limCuenta(LIMITE_UNO)
                    .claveCuenta(CLAVE_UNO).
                    //Aqui faltan los FK
                            build();



    public static Cuenta CUENTA_DOS=
            Cuenta.builder()
                    .idCuenta(ID_DOS)
                    .numCuenta(NUMERO_DOS)
                    .saldocuenta(SALDO_DOS)
                    .tipoCuenta(TIPO_DOS)
                    .userCuenta(USER_DOS)
                    .contrCuenta(CONTR_DOS)
                    .limCuenta(LIMITE_DOS)
                    .claveCuenta(CLAVE_DOS)
                    //Aqui faltan los FK
                    .build();

    public static List<Cuenta>CUENTA_LIST =
            Arrays.asList(CUENTA_UNO,CUENTA_DOS);




}
