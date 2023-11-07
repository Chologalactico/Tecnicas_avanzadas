package co.edu.usbcali.stb.mocks;

import co.edu.usbcali.stb.domain.Sucursal;
import co.edu.usbcali.stb.domain.Targeta;

import java.util.Arrays;
import java.util.List;

public class TargetaMocksTest {

    public static Integer ID_UNO = 1;
    public static Integer ID_DOS = 2;
    public static String NO_UNO = "D1";
    public static String NO_DOS = "D2";
    public static Integer CVC_UNO = 1;
    public static Integer CVC_DOS = 2;
    public static Integer SINCE_UNO = 1;
    public static Integer SINCE_DOS = 2;
    public static Integer VENCE_UNO = 1;
    public static Integer VENCE_DOS = 2;


    public static Targeta TARGETA_UNO=
            Targeta.builder()
                    .idTargeta(ID_UNO)
                    .noTarjeta(NO_UNO)
                    .cvcTarjeta(CVC_UNO)
                    .sinceTarjeta(SINCE_UNO)
                    .vencTarjeta(VENCE_UNO)
                    .build();


    public static Targeta TARGETA_DOS=
            Targeta.builder()
                    .idTargeta(ID_DOS)
                    .noTarjeta(NO_DOS)
                    .cvcTarjeta(CVC_DOS)
                    .sinceTarjeta(SINCE_DOS)
                    .vencTarjeta(VENCE_DOS)
                    .build();


    public static List<Targeta> SUCURSAL_LIST =
            Arrays.asList(TARGETA_UNO,TARGETA_DOS);


}





