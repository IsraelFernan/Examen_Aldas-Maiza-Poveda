package deitel.com;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class ClientDataBase extends SQLiteOpenHelper {
    private String CREATE_TABLE_CLIENTS = "CREATE TABLE Clients(Codigo int PRIMARY KEY AUTOINCREMENT, Nombre TEXT,Apellido TEXT,Saldo REAL)";
    public ClientDataBase(@Nullable Context context,@Nullable String name,
                          @Nullable SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);

    }
    @Override
    public void onCreate(SQLiteDatabase sqLliteDatabase){
        SQLiteDatabase.

    }
}
