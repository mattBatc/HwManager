package Utils;

import android.arch.persistence.room.*;
import Entities.*;
import Entities.Class;
import DAOs.ClassDao;

/**
 * Created by Matt on 4/4/2018.
 */

@android.arch.persistence.room.Database(entities = {Class.class,Assignment.class},version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;

    public abstract ClassDao classDao();

}
