package Utils;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;


import Entities.Assignment;

/**
 * Created by Matt on 4/6/2018.
 * This is the class that that classes for the activites call to interact with the database
 */

public class DatabaseInitializer {

    public static final String TAG = DatabaseInitializer.class.getName();

    public void populateAsync(@NonNull AppDatabase db) {
        PopulateDbAsync task = new PopulateDbAsync(db);
        task.execute();
    }

    //Method to delete a single assignment

    public static void delAssignment(@NonNull AppDatabase db, Assignment a) {
        db.assignmentDao().delHw(a);
        Log.d(TAG, "Deleted item: " + a.getName());
    }

    //Method to get homework List

    public List<Assignment> getHwList(@NonNull AppDatabase db) {
        List<Assignment> hw = db.assignmentDao().getAll();
        Log.d(TAG, "Returned HW list with size of: " + hw.size());
        return hw;
    }

    //Method to get Class List

    public List<Class> getClassList(@NonNull AppDatabase db) {
        List<Class> classes = db.classDao().getClasses();
        Log.d(TAG, "Returned Class list with size of: " + classes.size());
        return classes;
    }

    //Method to add a class

    public void addClass(@NonNull AppDatabase db, Class c) {
        db.classDao().insertClass(c);
        Log.d(TAG, "Added " + c.getName() + " Class");
    }

    //Method to get all homework for class

    public List<Assignment> hwForClass(@NonNull AppDatabase db, Class c){
        //int id = c.getId
        List<Assignment> hw = db.assignmentDao().getAllForClass(c);
        Log.d(TAG,"Returned assignments for class: " + c.getName()+" Size: " +hw.size());
        return hw;
    }

    //Method to clear the HW List

    public void nukeHwList(@NonNull AppDatabase db){
        db.assignmentDao().nukeTable();
        Log.d(TAG,"Nuked Hw List");
    }

    //Method to clear the Class List

    public void nukeClassList(@NonNull AppDatabase db){
        db.classDao().nukeTable();
        Log.d(TAG,"Nuked Class List");
    }

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
        private final AppDatabase mDb;

        PopulateDbAsync(AppDatabase db) {
            mDb = db;
        }

        @Override
        protected Void doInBackground(final Void... params) {
            return null;
        }


    }
}
