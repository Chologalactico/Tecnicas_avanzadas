package co.edu.usbcali.stb.mocks;

import co.edu.usbcali.stb.domain.Transaccion;

import java.util.Arrays;
import java.util.List;

public class TransaccionMocksTest {

    public static Integer ID_UNO = 1;
    public static Integer ID_DOS = 2;
    public static String NO_UNO = "T1";
    public static String NO_DOS = "T2";
    public static Integer MONTO_UNO = 1;
    public static Integer MONTO_DOS = 1;
    public static String DESTINO_UNO = "T1";
    public static String DESTINO_DOS = "T1";
    //Falta la FK

    public static Transaccion TRANSACCION_UNO=
            Transaccion.builder()
                    .idTransaccion(ID_UNO)
                    .noTransac(NO_UNO)
                    .montoTransac(MONTO_UNO)
                    .destinoTransac(DESTINO_UNO)
                    //Falta la Fk
                    .build();

    public static Transaccion TRANSACCION_DOS=
            Transaccion.builder()
                    .idTransaccion(ID_DOS)
                    .noTransac(NO_DOS)
                    .montoTransac(MONTO_DOS)
                    .destinoTransac(DESTINO_DOS)
                    //Falta la Fk
                    .build();

    public static List<Transaccion> TRANSACCION_LIST=
            Arrays.asList(TRANSACCION_UNO,TRANSACCION_DOS);
}
