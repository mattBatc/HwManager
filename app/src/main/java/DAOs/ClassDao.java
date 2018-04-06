package DAOs;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Matt on 4/6/2018.
 */
@Dao
public interface ClassDao {

    @Insert
    void insertClass(Class...classes);

    @Update
    void updateClass(Class...classes);

    @Query("SELECT * FROM class")
    List <Class> getClasses();

    @Query("DELETE FROM class")
    void nukeTable();

}
