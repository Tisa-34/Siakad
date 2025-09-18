public class App{
    public static void main(String[] args){

        MataKuliah mataKuliah1  = new MataKuliah();

        mataKuliah1.kodeMataKuliah = "TIU32021";

        mataKuliah1.namaMataKuliah = "PBO";

        mataKuliah1.menampilkanJumlahSks();

        System.out.println(

            mataKuliah1.menampilkanDeskripsi()

        );

        MataKuliah mataKuliah2 = new MataKuliah();

        mataKuliah2.kodeMataKuliah = "TIU34015";

        mataKuliah2.namaMataKuliah = "PWL";

        mataKuliah2.menampilkanJumlahSks();

        System.out.println(

        mataKuliah2.menampilkanDeskripsi()

        );
    }
}