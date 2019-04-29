package sjava_06b;

class Utils {

    public static String[] semana_es = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
    public static String[] semana_ca = { "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte",
            "Diumenge" };
    public static String[] semana_en = { "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday", "Sunday" };

    public static String diaSemana(int dia) {
        int indice = --dia;
        return semana_es[indice];
    }

    public static String[] mes_es = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Setiembre", "Octubre", "Noviembre", "Diciembre" };
    public static String[] mes_ca = { "Gener", "Febrer", "Març", "", "Mayo", "Junio", "Julio", "Agosto", "Setiembre",
            "Octubre", "Noviembre", "Diciembre" };
    public static String[] mes_en = { "January", "February", "March", "April", "May", "Jun", "July", "August",
            "September", "October", "November", "December" };

    public static String mes(int mes) {
        int indice = --mes;
        return mes_es[indice];
    }

}
