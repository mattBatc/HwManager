package DAOs;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import Entities.Assignment;

/**
 * Created by Matt on 4/4/2018.
 */

@Dao

public interface AssignmentDao {

    @Insert
    void insertHw(Assignment...assignments);

    @Update
    void updateHw(Assignment...assignments);

    @Query("SELECT * FROM hw")
    List<Assignment> getAll();

    @Query("SELECT * FROM hw WHERE classId =:classId")
    List<Assignment> getAllForClass();
}