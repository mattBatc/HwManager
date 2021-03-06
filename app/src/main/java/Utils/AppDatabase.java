package Utils;

import android.arch.persistence.room.*;
import android.content.Context;

import DAOs.AssignmentDao;
import DAOs.GroupDao;
import Entities.*;
import Entities.Group;
import DAOs.GroupDao;

/**
 * Created by Matt on 4/4/2018.
 */

@Database(entities = {Group.class,Assignment.class},version = 1,exportSchema = false)

public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public abstract GroupDao groupDao();
    public abstract AssignmentDao assignmentDao();

    public static AppDatabase getDatabase(Context context){

        if(INSTANCE == null){
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"hw-database").build();
        }
        return INSTANCE;
    }

    public static void destroyInstance(){
        INSTANCE = null;
    }

}
